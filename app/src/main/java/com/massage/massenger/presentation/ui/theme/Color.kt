package com.massage.massenger.presentation.ui.theme

import androidx.compose.material.Colors
import androidx.compose.material.LocalElevationOverlay
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp

val yellow200 = Color(0xffffeb46)
val yellow400 = Color(0xffffc000)
val yellow500 = Color(0xffffde03)
val yellowDarkPrimary = Color(0xff242316)

val green200 = Color(0xFFAAFFB5)
val green500 = Color(0xFF57FF85)
val green700 = Color(0xFF00FF47)
val greenDarkPrimary = Color(0xFF0B3316)

val blue200 = Color(0xff91a4fc)
val blue700 = Color(0xff0336ff)
val blue800 = Color(0xff0035c9)
val blueDarkPrimary = Color(0xff1c1d24)

val pink200 = Color(0xffff7597)
val pink500 = Color(0xffff0266)
val pink600 = Color(0xffd8004d)
val pinkDarkPrimary = Color(0xff24191c)

val DarkBlue1               = Color(0xff030014) // Back-Background
val DarkBlue2               = Color(0xff07061A) // Item Background
val DarkBlue3               = Color(0xff120F20) // Over / Floating Element Background
val DarkBlue4               = Color(0xFF25163A)

val GrayBlue1               = Color(0xFF565A6B) // Sub Text /FF686D82
val GrayBlue2               = Color(0xff9DA2B8) // Text / Button

val Blue1                   = Color(0xff396DFF) // Highlighted

val Red1                    = Color(0xFFE71B60)
val LightGreen1             = Color(0xFFADFF69)
val LightYellow1            = Color(0xFFFFF9C4)

@Composable
fun Colors.elevatedSurface(elevation: Dp): Color {
    return LocalElevationOverlay.current?.apply(
        color = this.surface,
        elevation = elevation
    ) ?: this.surface
}
