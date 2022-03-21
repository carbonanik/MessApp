package com.massage.massenger.presentation.messaging.single_chat.component

import android.animation.ArgbEvaluator
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.LayoutCoordinates
import androidx.compose.ui.layout.boundsInParent
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.massage.massenger.model.ChatMessage
import com.massage.massenger.model.User
import com.massage.massenger.presentation.messaging.single_chat.getColorAtProgress
import com.massage.massenger.util.state.MessageStatus

fun fakeMessage(
    txt: String = "Hi, This Is A Message.Hi, This Is A Message.",
    status: MessageStatus = MessageStatus.SEEN
): ChatMessage {
    return ChatMessage(
        "",
        "",
        "",
        "",
        txt,
        timestamp = System.currentTimeMillis(),
        time = "",
        date = "",
        status = status
    )
}

@Preview
@Composable
fun MessagePreview() {
    Message(
        onAuthorClick = {},
        message = fakeMessage("Hi, big message.Hi,"),
        isUserMe = true,
        firstOfAuthor = true,
        lastOfAuthor = true,
        firstOfDay = true,
        lastOfDay = true,
        onImageClick = {}, 0f
    )
}

@Composable
fun Message(
    onAuthorClick: (User) -> Unit,
    message: ChatMessage,
    isUserMe: Boolean,
    firstOfAuthor: Boolean,
    lastOfAuthor: Boolean,
    firstOfDay: Boolean,
    lastOfDay: Boolean,
    onImageClick: (message: ChatMessage) -> Unit,
    listHeight: Float
) {
    val evaluator = remember { ArgbEvaluator() }
    val topShade = remember { Color(0xFF9200A2) }
    val bottomShade = remember { Color(0xFFFF006F) }
    var backgroundColor by remember { mutableStateOf(bottomShade) }

    Column(
        Modifier
            .onGloballyPositioned { coordinates: LayoutCoordinates ->
                if (listHeight > 0f) {
                    val topOffset = coordinates.boundsInParent().top
                    val cleanTopOffset = when {
                        topOffset < 0 -> 0f
                        topOffset > listHeight -> listHeight
                        else -> topOffset
                    }
                    backgroundColor = getColorAtProgress(
                        progress = cleanTopOffset / listHeight,
                        start = topShade,
                        end = bottomShade,
                        evaluator = evaluator
                    )
                }
            }
    ) {

        Spacer(
            modifier = Modifier.height(
                if (firstOfAuthor || firstOfDay) 8.dp
                else 2.dp
            )
        )

        Row {
            //todo author avatar
            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth(1f)
            ) {

//                if (isUserMe) backgroundColor = Color(0xFF25163A)
//
//                ChatItemBubble(
//                    message = msg,
//                    isUserMe = isUserMe,
//                    needArrow = lastOfAuthor || lastOfDay,
//                    bubbleColor = backgroundColor,
//                    authorClicked = onAuthorClick,
//                    onImageClick = onImageClick
//                )
                if (isUserMe) {
                    if (message.mediaUrl == null) {
                        SendMessage(
                            message = message,
                            needArrow = lastOfAuthor || lastOfDay,
                            authorClicked = onAuthorClick
                        )
                    } else {
                        SendMediaMessage(
                            message = message,
                            needArrow = lastOfAuthor || lastOfDay,
                            onImageClick = onImageClick
                        )
                    }
                } else {
                    if (message.mediaUrl == null) {
                        ReceivedMessage(
                            message = message,
                            needArrow = lastOfAuthor || lastOfDay,
                            authorClicked = onAuthorClick,
                            onImageClick = onImageClick,
                            backgroundColor = backgroundColor
                        )
                    } else {
                        ReceivedMediaMessage(
                            message = message,
                            needArrow = lastOfAuthor || lastOfDay,
                            onImageClick = onImageClick,
                            backgroundColor = backgroundColor.copy(alpha = .3f)
                        )
                    }
                }
            }
        }

        if (lastOfDay) Spacer(modifier = Modifier.height(10.dp))
    }
}



