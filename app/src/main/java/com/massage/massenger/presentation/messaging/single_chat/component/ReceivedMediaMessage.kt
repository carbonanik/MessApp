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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.massage.massenger.model.ChatMessage
import com.massage.massenger.util.extensions.toTime
import com.massage.massenger.util.state.AttachedMedia

@Composable
fun ReceivedMediaMessage(
    message: ChatMessage,
    needArrow: Boolean,
    onImageClick: (message: ChatMessage) -> Unit,
    backgroundColor: Color = Color(0xFFE71B60)
){
    ReceivedMediaMessage(message, needArrow, backgroundColor){
        MediaMessageContent(message = message, onImageClick = onImageClick)
    }
}

@Composable
fun ReceivedMediaMessage(
    message: ChatMessage,
    needArrow: Boolean,
    backgroundColor: Color = Color(0xFFE71B60),
    content: @Composable () -> Unit
) {
    val textColor = Color(0xFFFFF9C4)

    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.Bottom
    ) {

        if (needArrow) BubbleArrow(
            size = 10.dp,
            color = backgroundColor,
            isUserMe = false,
        )
        else Spacer(Modifier.width(10.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.Bottom
        ) {

            Surface(
                color = backgroundColor,
                shape = RoundedCornerShape(8.dp),
            ) {
                Column {

                    content()

                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            text = message.timestamp.toTime() ?: "time",
                            style = MaterialTheme.typography
                                .overline.copy(color = textColor),
                        )

                        Spacer(modifier = Modifier.width(8.dp))
                    }
                }
            }
        }

        Spacer(modifier = Modifier.width(70.dp))
    }
}

@Composable
fun MediaMessageContent(message: ChatMessage, onImageClick: (message: ChatMessage) -> Unit){
    when (message.mediaType) {
        null, AttachedMedia.IMAGE -> {
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
        AttachedMedia.VIDEO -> TODO()
        AttachedMedia.AUDIO -> TODO()
        AttachedMedia.FILE -> TODO()
    }
}