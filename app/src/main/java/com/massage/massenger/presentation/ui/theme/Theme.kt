package com.massage.massenger.presentation.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val YellowThemeLight = lightColors(
    primary = green700,
    primaryVariant = green500,
    onPrimary = greenDarkPrimary,
    secondary = pink200,
    secondaryVariant = pink500,
    onSecondary = Color.White
)

private val YellowThemeDark = darkColors(
    primary = GrayBlue2,
    primaryVariant = GrayBlue1,
    onPrimary = DarkBlue2,
    secondary = Blue1,
    secondaryVariant = DarkBlue3,
    onSecondary = Color.Black,
    surface = DarkBlue2,
    onSurface = GrayBlue2,
    background = DarkBlue1,
    onBackground = GrayBlue2,
//    error =,
//    onError =,
)

@Composable
fun MessengerTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {
    val colors = YellowThemeDark
//        if (darkTheme) {
//        YellowThemeDark
//    } else {
//        YellowThemeLight
//    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}