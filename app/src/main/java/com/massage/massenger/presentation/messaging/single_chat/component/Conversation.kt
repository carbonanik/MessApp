package com.massage.massenger.presentation.messaging.single_chat.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.*
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp
import com.google.accompanist.insets.LocalWindowInsets
import com.google.accompanist.insets.rememberInsetsPaddingValues
import com.massage.massenger.model.ChatMessage
import com.massage.massenger.model.User
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat

@Composable
fun MessageList(
    modifier: Modifier = Modifier,
    messageList: SnapshotStateList<ChatMessage>,
    me: User,
    navigateToProfile: (User) -> Unit = {},
    scrollState: LazyListState
) {
    val scope = rememberCoroutineScope()
    Box(modifier = modifier) {

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
        ) {
            for (index in messageList.indices) {
                val prevMessageAuthorId = messageList.getOrNull(index - 1)?.authorId
                val nextMessageAuthorId = messageList.getOrNull(index + 1)?.authorId

                val message = messageList[index]

                val isFirstMessageBySender = nextMessageAuthorId != message.authorId
                val isLastMessageBySender = prevMessageAuthorId != message.authorId

                val dateFormat = SimpleDateFormat("MMMM dd, yyyy")
                val date = dateFormat.format(message.messageTime)

                val prevDate = messageList.getOrNull(index + 1)?.messageTime?.let {
                    dateFormat.format(it)
                }
                val nextDate = messageList.getOrNull(index - 1)?.messageTime?.let {
                    dateFormat.format(it)
                }

                val isFirstMessageOfDay = date != prevDate
                val isLastMessageOfDay = date != nextDate

                item {
                    Message(
                        onAuthorClick = { name -> navigateToProfile(name) },
                        msg = message,
                        isUserMe = message.authorId == me.id,
                        isFirstMessageByAuthor = isFirstMessageBySender,
                        isLastMessageByAuthor = isLastMessageBySender,
                        isFirstMessageOfDay = isFirstMessageOfDay,
                        isLastMessageOfDay = isLastMessageOfDay
                    )

                    if (isFirstMessageOfDay) {
                        DayHeader(dayString = date)
                    }
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
