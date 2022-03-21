package com.massage.massenger.presentation.messaging.single_chat.component

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.massage.massenger.model.ChatMessage


@Composable
fun SendMediaMessage(
    message: ChatMessage,
    needArrow: Boolean,
    onImageClick: (message: ChatMessage) -> Unit,
    backgroundColor: Color = Color(0xFF25163A).copy(alpha = 0.3f)
){
    SendMediaMessage(message, needArrow, backgroundColor) {
        MediaMessageContent(message = message, onImageClick = onImageClick)
    }
}

@Composable
fun SendMediaMessage(
    message: ChatMessage,
    needArrow: Boolean,
    backgroundColor: Color = Color(0xFF25163A).copy(alpha = 0.3f),
    content: @Composable () -> Unit
) {

    val textColor = MaterialTheme.colors.primary

    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.End,
        verticalAlignment = Alignment.Bottom
    ) {

        Spacer(Modifier.width(70.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.Bottom
        ) {

            Surface(
                color = backgroundColor,
                shape = RoundedCornerShape(8.dp),
            ) {
                Column(horizontalAlignment = Alignment.End) {

                    content()

                    TimeAndStatus(
                        timestamp = message.timestamp,
                        status = message.status,
                        contentColor = textColor
                    )
                }
            }
        }

        if (needArrow) BubbleArrow(
            size = 10.dp,
            color = backgroundColor,
            isUserMe = true
        )
        else Spacer(modifier = Modifier.width(10.dp))
    }
}