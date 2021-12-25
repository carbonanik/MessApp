package com.massage.massenger.presentation.ui.theme

import androidx.compose.material.Colors
import androidx.compose.material.LocalElevationOverlay
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp

val Purple200 = Color(0xFFEB5185)
val Purple500 = Color(0xFF64FF00)//Color(0xFFE71B60)
val Purple700 = Color(0xFFB91EA4)
val Teal200 = Color(0xFF00FF47)


@Composable
fun Colors.elevatedSurface(elevation: Dp): Color {
    return LocalElevationOverlay.current?.apply(
        color = this.surface,
        elevation = elevation
    ) ?: this.surface
}
