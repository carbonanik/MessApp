package com.massage.massenger.presentation.messaging.single_chat.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.LayoutCoordinates
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp
import com.google.accompanist.insets.LocalWindowInsets
import com.google.accompanist.insets.rememberInsetsPaddingValues
import com.massage.massenger.model.ChatMessage
import com.massage.massenger.model.User
import kotlinx.coroutines.launch

@Composable
fun MessageList(
    modifier: Modifier = Modifier,
    messages: List<ChatMessage>,
    me: User?,
    navigateToProfile: (User) -> Unit = {},
    scrollState: LazyListState,
    onImageClick: (message: ChatMessage) -> Unit
) {
    val scope = rememberCoroutineScope()
    Box(modifier = modifier) {
        var listHeight by remember { mutableStateOf(0f) }
        LazyColumn(
            reverseLayout = true,
            state = scrollState,
            contentPadding = rememberInsetsPaddingValues(
                insets = LocalWindowInsets.current.statusBars,
                additionalTop = 90.dp
            ),
            modifier = Modifier
                .testTag("ConversationTestTag")
                .fillMaxSize()
                .onGloballyPositioned { coordinates: LayoutCoordinates ->
                    listHeight = coordinates.size.height.toFloat()
                }
        ) {

            itemsIndexed(messages) { i, message ->

                val prevMess = messages.getOrNull(i + 1)
                val nextMess = messages.getOrNull(i - 1)

                val firstOfAuthor = message.authorId != prevMess?.authorId
                val lastOfAuthor = message.authorId != nextMess?.authorId

                val firstOfDay = message.date != prevMess?.date
                val lastOfDay = message.date != nextMess?.date

                Message(
                    onAuthorClick = { name -> navigateToProfile(name) },
                    message = message,
                    isUserMe = message.authorId == me?.id,
                    firstOfAuthor = firstOfAuthor,
                    lastOfAuthor = lastOfAuthor,
                    firstOfDay = firstOfDay,
                    lastOfDay = lastOfDay,
                    onImageClick = onImageClick,
                    listHeight = listHeight
                )

                if (firstOfDay) {
                    DayHeader(dayString = message.date ?: "Date Header")
                }
            }
        }

        val jumpThreshold = with(LocalDensity.current) {
            JumpToBottomThreshold.toPx()
        }

        val jumpToBottomButtonEnabled by remember {
            derivedStateOf {
                scrollState.firstVisibleItemIndex != 0 || scrollState.firstVisibleItemScrollOffset > jumpThreshold
            }
        }

        JumpToBottom(
            enabled = jumpToBottomButtonEnabled,
            onClicked = {
                scope.launch {
                    scrollState.animateScrollToItem(0)
                }
            },
            modifier = Modifier.align(Alignment.BottomCenter)
        )
    }
}

private val JumpToBottomThreshold = 56.dp
