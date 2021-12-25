package com.massage.massenger.presentation.messaging.single_chat.component

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.massage.massenger.util.state.MessageStatus


val ReceivedChatBubbleShape =
    RoundedCornerShape(4.dp)//RoundedCornerShape(4.dp, 8.dp, 8.dp, 4.dp)
val ReceivedLastChatBubbleShape = RoundedCornerShape(0.dp, 8.dp, 8.dp, 8.dp)

val SendChatBubbleShape =
    RoundedCornerShape(4.dp)//RoundedCornerShape(8.dp, 4.dp, 4.dp, 8.dp)
val SendLastChatBubbleShape = RoundedCornerShape(8.dp, 0.dp, 8.dp, 8.dp)


fun leftArrowPath(scope: DrawScope, offset: Dp): Path {
    return with(scope) {
        Path().apply {
            moveTo(x = offset.toPx() * .2f, y = offset.toPx() / 2)
            lineTo(x = offset.toPx(), y = 0f)
            lineTo(x = offset.toPx(), y = offset.toPx())
        }
    }
}

fun rightArrowPath(scope: DrawScope, offset: Dp): Path {
    return with(scope) {
        Path().apply {
            moveTo(x = offset.toPx() * .8f, y = offset.toPx() / 2)
            lineTo(x = 0f, y = offset.toPx())
            lineTo(x = 0f, y = 0f)
        }
    }
}

fun statusIndicator(status: MessageStatus): String {
    return when (status) {
        MessageStatus.SENDING -> "~"
        MessageStatus.SENT -> ">>"
        MessageStatus.DELIVERED -> "[--]"
        MessageStatus.SEEN -> "[^^]"
        MessageStatus.FAILED -> "!!"
        MessageStatus.RECEIVED -> ""
        MessageStatus.SEEN_RECEIVED -> ""
    }
}

@Composable
fun Board() {
    Column {
        for (i in 0 until 8) {
            Row {
                for (j in 0 until 8) {
                    val isLightSquare = i % 2 == j % 2
                    val squareColor = if (isLightSquare) White else Black
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .aspectRatio(1f)
                            .background(squareColor)
                    ) {
                        Text(text = "${i + j}")
                    }
                }
            }
        }
    }
}

@Composable
fun BubbleArrow(size: Dp, color: Color, isUserMe: Boolean) {
    Column(Modifier
        .padding(start = 0.dp, top = 8.dp, end = 0.dp, bottom = 8.dp)) {
        Canvas(modifier = Modifier
            .size(size),
            onDraw = {
                drawPath(
                    if (isUserMe) rightArrowPath(this, size)
                    else leftArrowPath(this, size),
                    color = color
                )
            })
    }
}

