package com.massage.massenger.presentation.messaging.chat_list

import android.os.Parcelable
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue

@Composable
fun NameBox(
    modifier: Modifier,
    name: String,
    textSize: TextUnit = 20.sp,
    roundedCorner: Dp = 8.dp
) {
    val brush = rememberBrush(brush = circleColorList.random())
    val nameCode = rememberSaveable { nameCode(name) }

    Box(
        modifier
            .clip(RoundedCornerShape(roundedCorner))
            .background(brush = brush), contentAlignment = Alignment.Center
    ) {
        Text(
            text = nameCode,
            fontSize = textSize,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colors.background
        )
    }
}

@Composable
fun rememberBrush(brush: Brush): Brush {
    return rememberSaveable(
        saver = Saver(
            save = { SavableBrush(it) },
            restore = { it.brush }
        )
    ) { brush }
}

fun nameCode(name: String): String {
    val splitList = name.split(" ")
    val taken = when (splitList.size) {
        0 -> "??"
        1 -> splitList[0].take(2)
        else -> splitList[0].first().toString() + splitList[1].first()
    }
    return taken.uppercase()
}

@Parcelize
data class SavableBrush(val brush: @RawValue Brush) : Parcelable

val circleColorList = listOf(

    Brush.linearGradient(
        listOf(
            Color(0xFFE7A13D),
            Color(0xFFC5742D)
        )
    ),

    Brush.linearGradient(
        listOf(
            Color(0xFFE46E40),
            Color(0xFFD14C3C)
        )
    ),

    Brush.linearGradient(
        listOf(
            Color(0xFFE66B9D),
            Color(0xFFCA456F)
        )
    ),

    Brush.linearGradient(
        listOf(
            Color(0xFFB06CD8),
            Color(0xFFAF4CBB)
        )
    ),

    Brush.linearGradient(
        listOf(
            Color(0xFF7C94EA),
            Color(0xFF5B5AC0)
        )
    ),

    Brush.linearGradient(
        listOf(
            Color(0xFF34D2A5),
            Color(0xFF22A3A3)
        )
    ),

    Brush.linearGradient(
        listOf(
            Color(0xFF4EBEE8),
            Color(0xFF348CCF)
        )
    ),

    Brush.linearGradient(
        listOf(
            Color(0xFF40E48F),
            Color(0xFF36C04E)
        )
    )
)