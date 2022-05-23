package com.massage.massenger.presentation.ui.theme

import androidx.compose.material.Colors
import androidx.compose.material.LocalElevationOverlay
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp


val green200 = Color(0xFFAAFFB5)
val green500 = Color(0xFF57FF85)
val green700 = Color(0xFF00FF47)
val greenDarkPrimary = Color(0xFF0B3316)


val pink200 = Color(0xffff7597)
val pink500 = Color(0xffff0266)
val pink600 = Color(0xffd8004d)

val darkBlue1               = Color(0xff030014) // Back-Background
val darkBlue2               = Color(0xff07061A) // Item Background
val darkBlue3               = Color(0xff120F20) // Over / Floating Element Background
val darkBlue4               = Color(0xFF25163A)

val grayBlue1               = Color(0xFF565A6B) // Sub Text /FF686D82
val grayBlue2               = Color(0xff9DA2B8) // Text / Button

val purple700               = Color(0xFF3700B3)

val blue1                   = Color(0xff396DFF) // Highlighted


val TextFieldOutlineColor = Color(0xff9079E4)
val CardButtonColor = Color(0xff3D4770)


val ButtonGradientColorBrash = Brush.horizontalGradient(
    colors = listOf(
        Color(0xFFF05E9E),
        Color(0xFFB870CC)
    )
)


@Composable
fun Colors.elevatedSurface(elevation: Dp): Color {
    return LocalElevationOverlay.current?.apply(
        color = this.surface,
        elevation = elevation
    ) ?: this.surface
}
