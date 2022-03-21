package com.massage.massenger.presentation.messaging.single_chat.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.massage.massenger.model.ChatMessage
import com.massage.massenger.model.User
import com.massage.massenger.util.extensions.toTime
import com.massage.massenger.util.state.AttachedMedia

@Preview
@Composable
fun ChatBPre() {
    ChatItemBubble(
        message = fakeMessage(),
        isUserMe = true,
        needArrow = true,
        authorClicked = {},
        onImageClick = {}
    )
}

@Preview
@Composable
fun ChatBPre2() {
    ChatItemBubble(
        message = fakeMessage(),
        isUserMe = true,
        needArrow = false,
        authorClicked = {},
        onImageClick = {}
    )
}

@Preview
@Composable
fun ChatBPre3() {
    ChatItemBubble(
        message = fakeMessage(),
        isUserMe = false,
        needArrow = true,
        authorClicked = {},
        onImageClick = {}
    )
}

@Preview
@Composable
fun ChatBPre4() {
    ChatItemBubble(
        message = fakeMessage(),
        isUserMe = false,
        needArrow = false,
        authorClicked = {},
        onImageClick = {}
    )
}

@Composable
fun ChatItemBubble(
    message: ChatMessage,
    isUserMe: Boolean,
    needArrow: Boolean,
    bubbleColor: Color = Color(0xFFE71B60),
    authorClicked: (User) -> Unit,
    onImageClick: (message: ChatMessage) -> Unit
) {

    val bubbleShape: Shape = RoundedCornerShape(8.dp)
    val textColor: Color = Color(0xFFFFF9C4)

    val horizontalArrangement: Arrangement.Horizontal =
        if (isUserMe) Arrangement.End
        else Arrangement.Start

    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = horizontalArrangement,
        verticalAlignment = Alignment.Bottom
    ) {

        if (needArrow && !isUserMe)
            BubbleArrow(
                size = 10.dp,
                color = bubbleColor,
                isUserMe = false,
            )
        else {
            if (isUserMe) Spacer(Modifier.width(70.dp))
            else Spacer(Modifier.width(10.dp))
        }


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            horizontalArrangement = horizontalArrangement,
            verticalAlignment = Alignment.Bottom
        ) {

            Surface(
                color = bubbleColor,
                shape = bubbleShape,
            ) {
                RowOrColumn(message.text?.length ?: 0 < 30) {
                    Column {
                        ClickableMessage(
                            message = message.text,
                            authorClicked = authorClicked,
                            textColor = textColor
                        )
                        if (message.mediaUrl != null && message.mediaType == AttachedMedia.IMAGE) {

                            Spacer(modifier = Modifier.height(4.dp))
                            Surface(color = Color.Green, shape = bubbleShape) {
                                Image(
                                    painter = rememberImagePainter(message.mediaUrl),
                                    contentScale = ContentScale.Fit,
                                    modifier = Modifier
                                        .size(160.dp)
                                        .clickable {
                                            onImageClick(message)
                                        },
                                    contentDescription = "AttachedImage"
                                )
                            }
                        }
                    }

                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            text = message.timestamp.toTime() ?: "time",
                            style = MaterialTheme.typography
                                .overline.copy(color = textColor),
//                            modifier = Modifier.padding(end = 8.dp)
                        )
                        if (isUserMe) {
                            StatusIndicator(Modifier.size(10.dp), message.status)
                        }
                        Spacer(modifier = Modifier.width(8.dp))
                    }
                }
            }
        }

        if (needArrow && isUserMe)
            BubbleArrow(
                size = 10.dp,
                color = bubbleColor,
                isUserMe = true
            )
        else {
            if (isUserMe) {
                Spacer(modifier = Modifier.width(10.dp))
            } else {
                Spacer(modifier = Modifier.width(70.dp))
            }
        }
    }
}

@Composable
fun RowOrColumn(
    isRow: Boolean = true,
    content: @Composable () -> Unit
) {
    if (isRow) Row(verticalAlignment = Alignment.Bottom) { content() }
    else Column(horizontalAlignment = Alignment.End) { content() }
}