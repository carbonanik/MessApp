package com.massage.massenger.presentation.messaging.video_play

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import com.google.accompanist.insets.LocalWindowInsets
import com.google.accompanist.insets.rememberInsetsPaddingValues
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.MediaItem
import kotlinx.coroutines.flow.collect

@Composable
fun VideosScreen(viewModel: VideosViewModel = hiltViewModel()) {

    val context = LocalContext.current
    val lifecycleOwner = LocalLifecycleOwner.current

    val exoPlayer = remember(context) { ExoPlayer.Builder(context).build() }
    val listState = rememberLazyListState()

    val videos by viewModel.videos.observeAsState(listOf())
    val playingItemIndex by viewModel.currentlyPlayingIndex.observeAsState()
    val isCurrentItemVisible = remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        snapshotFlow {
            listState.visibleAreaContainsItem(playingItemIndex, videos)
        }.collect { isItemVisible ->
            isCurrentItemVisible.value = isItemVisible
        }
    }

    LaunchedEffect(playingItemIndex) {
        if (playingItemIndex == null) {
            exoPlayer.pause()
        } else {
            val video = videos[playingItemIndex!!]
            exoPlayer.setMediaItem(MediaItem.fromUri(video.mediaUrl), video.lastPlayedPosition)
            exoPlayer.prepare()
            exoPlayer.playWhenReady = true
        }
    }

    LaunchedEffect(isCurrentItemVisible.value) {
        if (!isCurrentItemVisible.value && playingItemIndex != null) {
            viewModel.onPlayVideoClick(exoPlayer.currentPosition, playingItemIndex!!)
        }
    }

    DisposableEffect(exoPlayer) {
        val lifecycleObserver = LifecycleEventObserver { _, event ->
            if (playingItemIndex == null) return@LifecycleEventObserver
            when (event) {
                Lifecycle.Event.ON_START -> exoPlayer.play()
                Lifecycle.Event.ON_STOP -> exoPlayer.pause()
                else -> Unit
            }
        }

        lifecycleOwner.lifecycle.addObserver(lifecycleObserver)
        onDispose {
            lifecycleOwner.lifecycle.removeObserver(lifecycleObserver)
            exoPlayer.release()
        }
    }

    LazyColumn(
        state = listState,
        modifier = Modifier.fillMaxSize(),
        contentPadding = rememberInsetsPaddingValues(
            insets = LocalWindowInsets.current.systemBars,
            applyTop = true,
            applyBottom = true,
            additionalStart = 16.dp,
            additionalEnd = 16.dp,
            additionalBottom = 8.dp
        )
    ) {
        itemsIndexed(videos, { _, video -> video.id }) { index, video ->
            Spacer(modifier = Modifier.height(16.dp))
            VideoCard(
                videoItem = video,
                exoPlayer = exoPlayer,
                isPlaying = index == playingItemIndex,
                onClick = {
                    viewModel.onPlayVideoClick(exoPlayer.currentPosition, index)
                }
            )
        }
    }
}

private fun LazyListState.visibleAreaContainsItem(
    currentlyPlayedIndex: Int?,
    videos: List<VideoItem>
): Boolean {
    return when {
        currentlyPlayedIndex == null -> false
        videos.isEmpty() -> false
        else -> {
            layoutInfo.visibleItemsInfo.map { videos[it.index] }
                .contains(videos[currentlyPlayedIndex])
        }
    }
}