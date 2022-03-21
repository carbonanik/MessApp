package com.massage.massenger.presentation.messaging.single_chat.component

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.massage.massenger.model.ChatMessage
import com.massage.massenger.model.User
import com.massage.massenger.util.extensions.toTime
import com.massage.massenger.util.state.MessageStatus


@Composable
fun SendMessage(
    message: ChatMessage,
    needArrow: Boolean,
    authorClicked: (User) -> Unit,
    backgroundColor: Color = Color(0xFF25163A)
) {
    val textColor = Color(0xFFFFF9C4)

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
                RowOrColumn(message.text?.length ?: 0 < 30) {

                    ClickableMessage(
                        message = message.text,
                        authorClicked = authorClicked,
                        textColor = textColor
                    )

                    TimeAndStatus(timestamp = message.timestamp, status = message.status, textColor.copy(alpha = .5f))
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

@Composable
fun TimeAndStatus(timestamp: Long, status: MessageStatus, contentColor: Color) {

    val time = remember { timestamp.toTime() ?: "time" }

    Row(verticalAlignment = Alignment.CenterVertically) {
        Text(
            text = time,
            style = MaterialTheme.typography
                .overline.copy(color = contentColor)
        )
        StatusIndicator(Modifier.size(10.dp), status, contentColor, singleColor = true)
        Spacer(modifier = Modifier.width(8.dp))
    }
}
