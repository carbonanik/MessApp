package com.massage.massenger.presentation.messaging.single_chat.component

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.LocalContentAlpha
import androidx.compose.material.LocalContentColor
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.massage.massenger.util.state.MessageStatus


val ReceivedChatBubbleShape =
    RoundedCornerShape(8.dp)//RoundedCornerShape(4.dp, 8.dp, 8.dp, 4.dp)
val ReceivedLastChatBubbleShape = RoundedCornerShape(0.dp, 8.dp, 8.dp, 8.dp)

val SendChatBubbleShape =
    RoundedCornerShape(8.dp)//RoundedCornerShape(8.dp, 4.dp, 4.dp, 8.dp)
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

@Composable
fun StatusIndicator(
    modifier: Modifier = Modifier,
    status: MessageStatus,
    tint: Color = LocalContentColor.current.copy(alpha = LocalContentAlpha.current),
    singleColor: Boolean = false
) {
    val p = when (status) {
        MessageStatus.SENDING -> Icons.Default.ArrowForward
        MessageStatus.SENT -> Icons.Default.Done
        MessageStatus.DELIVERED -> Icons.Default.DoneAll
        MessageStatus.SEEN -> Icons.Default.DoneAll
        MessageStatus.FAILED -> Icons.Default.Error
        MessageStatus.RECEIVED -> Icons.Default.CallReceived
        MessageStatus.SEEN_RECEIVED -> Icons.Default.CallReceived
        MessageStatus.EMPTY_CHAT -> Icons.Default.HourglassEmpty
    }
    val tintColor = if (singleColor) tint
    else when (status) {
        MessageStatus.SEEN -> Color.Green
        MessageStatus.RECEIVED -> Color.Blue
        MessageStatus.FAILED -> Color.Red
        else -> tint
    }

    Icon(imageVector = p, contentDescription = null, modifier = modifier, tint = tintColor)
}

@Composable
fun BubbleArrow(size: Dp, color: Color, isUserMe: Boolean) {
    Column(
        Modifier
            .padding(start = 0.dp, top = 8.dp, end = 0.dp, bottom = 8.dp)
    ) {
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

