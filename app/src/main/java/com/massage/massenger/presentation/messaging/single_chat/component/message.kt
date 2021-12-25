package com.massage.massenger.presentation.messaging.single_chat.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.massage.massenger.model.ChatMessage
import com.massage.massenger.model.User
import com.massage.massenger.util.state.MessageStatus
import java.text.SimpleDateFormat
import java.util.*

fun fakeMessage(
    txt: String = "Hi, This Is A Message.",
    status: MessageStatus = MessageStatus.SEEN
): ChatMessage {
    return ChatMessage(
        "",
        "",
        "",
        "",
        txt,
        null,
        System.currentTimeMillis(),
        status
    )
}

@Preview
@Composable
fun MessagePreview() {
    Message(
        onAuthorClick = {},
        msg = fakeMessage("Hi, big message.Hi,"),
        isUserMe = true,
        isFirstMessageByAuthor = true,
        isLastMessageByAuthor = true,
        isFirstMessageOfDay = true,
        isLastMessageOfDay = true
    )
}

@Composable
fun Message(
    onAuthorClick: (User) -> Unit,
    msg: ChatMessage,
    isUserMe: Boolean,
    isFirstMessageByAuthor: Boolean,
    isLastMessageByAuthor: Boolean,
    isFirstMessageOfDay: Boolean,
    isLastMessageOfDay: Boolean
) {

//    val spaceBetweenAuthors = if (isLastMessageByAuthor) Modifier.padding(bottom = 8.dp) else Modifier
    Column {
        if (isFirstMessageOfDay) Box2(Color.Yellow)
        else if (isFirstMessageByAuthor) Box2(Color.Red)
        else Box2(Color.Blue)
        Row {
            //todo author avatar
//        Spacer(modifier = Modifier.width(16.dp))

            Column(
                modifier = Modifier
//                .padding(end = 16.dp)
                    .weight(1f)
                    .fillMaxWidth(1f)
            ) {
                ChatItemBubble(
                    message = msg,
                    isUserMe = isUserMe,
                    needArrow = isLastMessageByAuthor || isLastMessageOfDay,
                    authorClicked = onAuthorClick
                )
//            if (isFirstMessageByAuthor)
//                Spacer(modifier = Modifier.height(80.dp))
//            else
//                Spacer(modifier = Modifier.height(4.dp))
            }
        }
        if (isLastMessageOfDay) Box2(Color.Yellow)
    }
}

@Composable
fun ChatItemBubble(
    message: ChatMessage,
    isUserMe: Boolean,
    needArrow: Boolean,
    authorClicked: (User) -> Unit,
) {

    val bubbleShape: Shape
    val horizontalArrangement: Arrangement.Horizontal
    val backgroundBubbleColor: Color
    val textColor: Color

    if (isUserMe) {
        bubbleShape = SendChatBubbleShape
        horizontalArrangement = Arrangement.End
        backgroundBubbleColor = Color(0xFF25163A)
        textColor = Color(0xFFADFF69)
    } else {
        bubbleShape = ReceivedChatBubbleShape
        horizontalArrangement = Arrangement.Start
        backgroundBubbleColor = Color(0xFFE71B60)
        textColor = Color(0xFFFFF9C4)
    }

    val timeFormat = SimpleDateFormat("h:mm a", Locale.getDefault())
    val time = timeFormat.format(message.messageTime)

    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = horizontalArrangement,
        verticalAlignment = Alignment.Bottom
    ) {

        if (needArrow && !isUserMe) BubbleArrow(
            size = 10.dp,
            color = backgroundBubbleColor,
            isUserMe = false,
        )
        else Spacer(modifier = Modifier.width(10.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            horizontalArrangement = horizontalArrangement,
            verticalAlignment = Alignment.Bottom
        ) {

            Surface(
                color = backgroundBubbleColor,
                shape = bubbleShape,
            ) {

                @Composable
                fun bubbleContent() {
                    Column {
                        ClickableMessage(
                            message = message.text,
                            authorClicked = authorClicked,
                            textColor = textColor
                        )
                        message.image?.let {
                            Spacer(modifier = Modifier.height(4.dp))
                            Surface(color = Color.Green, shape = bubbleShape) {
                                Image(
                                    painter = rememberImagePainter(it),
                                    contentScale = ContentScale.Fit,
                                    modifier = Modifier.size(160.dp),
                                    contentDescription = "AttachedImage"
                                )
                            }
                        }
                    }

                    val timeAndStatus = if (isUserMe) {
                        "$time . ${statusIndicator(message.messageStatus)}"
                    } else time

                    Text(
                        text = timeAndStatus,
                        style = MaterialTheme.typography
                            .overline.copy(color = textColor),
                        modifier = Modifier.padding(end = 8.dp)
                    )
                }

                /**
                 * select time will be in side or below depending on message text size
                 */
                if (message.text?.length ?: 0 < 30) {
                    Row(verticalAlignment = Alignment.Bottom) {
                        bubbleContent()
                    }
                } else {
                    Column(horizontalAlignment = Alignment.End) {
                        bubbleContent()
//                Spacer(modifier = Modifier.height(2.dp))
                    }
                }
            }
        }

        if (needArrow && isUserMe) BubbleArrow(
            size = 10.dp,
            color = backgroundBubbleColor,
            isUserMe = true
        )
        else Spacer(modifier = Modifier.width(10.dp))
    }
//    }
}

@Composable
fun ClickableMessage(
    message: String?,
    authorClicked: (User) -> Unit,
    textColor: Color
) {
    message ?: return
    val uriHandler = LocalUriHandler.current
    val styledMessage = messageFormatter(text = message)

    ClickableText(
        text = styledMessage,
        style = MaterialTheme.typography.body1.copy(color = textColor), //LocalContentColor.current
        modifier = Modifier.padding(8.dp),
        onClick = {
            styledMessage
                .getStringAnnotations(start = it, end = it)
                .firstOrNull()
                ?.let { annotation ->
                    when (annotation.tag) {
                        SymbolAnnotationType.LINK.name -> uriHandler.openUri(annotation.item)
                        SymbolAnnotationType.PERSON.name -> {
                        } //todo //authorClicked(annotation.item)
                        else -> Unit
                    }
                }
        }
    )
}


@Composable
fun Box2(color: Color) {
    Box(
        Modifier
            .fillMaxWidth()
            .height(8.dp)
            .background(color),
    ) {

    }
}



