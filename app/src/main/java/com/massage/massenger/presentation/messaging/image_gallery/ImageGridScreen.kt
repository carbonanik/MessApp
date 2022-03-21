package com.massage.massenger.presentation.messaging.image_gallery

import android.Manifest
import android.net.Uri
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.unit.dp
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.navigation.NavHostController
import coil.compose.rememberImagePainter
import com.google.accompanist.permissions.ExperimentalPermissionsApi
import com.google.accompanist.permissions.rememberPermissionState
import com.massage.massenger.model.SharedStoragePhoto
import com.massage.massenger.presentation.messaging.single_chat.SingleChatViewModel
import com.massage.massenger.util.isPermanentlyDenied
import com.massage.massenger.R


@OptIn(ExperimentalPermissionsApi::class)
@Composable
fun ImageGridScreen(
    viewModel: SingleChatViewModel,
    navController: NavHostController,
) {


    var photos by remember {
        mutableStateOf(emptyList<SharedStoragePhoto>())
    }

    val permissionState = rememberPermissionState(
        permission = Manifest.permission.READ_EXTERNAL_STORAGE
    )

    val lifecycleOwner = LocalLifecycleOwner.current

    DisposableEffect(key1 = lifecycleOwner, effect = {

        val observer = LifecycleEventObserver { _, event ->
            if (event == Lifecycle.Event.ON_START) {
                permissionState.launchPermissionRequest()
            }
        }

        lifecycleOwner.lifecycle.addObserver(observer)

        onDispose {
            lifecycleOwner.lifecycle.removeObserver(observer)
        }

    })

    when {
        permissionState.hasPermission -> {
            photos = viewModel.getImages().collectAsState(initial = emptyList()).value
        }
        permissionState.shouldShowRationale -> {
            Text("Storage Permission Needed")
        }
        permissionState.isPermanentlyDenied() -> {
            Text("Camera Permission was permanently denied. You can enable it " +
                    "from the app setting")
        }
    }

    ImageGridContent(photos = photos, onImageClick = {photo ->
        viewModel.submitPhotoForSend(photo)
        navController.navigateUp()
    })
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ImageGridContent(
    photos: List<SharedStoragePhoto>,
    onImageClick: (photo: SharedStoragePhoto) -> Unit
) {

    Column {
        LazyVerticalGrid(cells = GridCells.Fixed(4)) {

            items(items = photos) { photo ->

                Image(
                    painter = rememberImagePainter(
                        data = photo.contentUri,
                        builder = {
                            crossfade(true)
                            placeholder(R.drawable.ic_launcher_foreground)
                        }
                    ),
                    contentDescription = "",
                    modifier = Modifier
                        .fillMaxWidth(1 / 3f)
                        .aspectRatio(1.0f)
                        .clickable {
                            onImageClick(photo)
                        }
                        .padding(4.dp),
                    contentScale = ContentScale.Crop,
                )
            }
        }
    }
}
