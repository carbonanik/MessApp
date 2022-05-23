package com.massage.massenger.presentation.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val BlueThemeLight = lightColors(
    primary = green700,
    primaryVariant = green500,
    onPrimary = greenDarkPrimary,
    secondary = pink200,
    secondaryVariant = pink500,
    onSecondary = Color.White
)

private val BlueThemeDark = darkColors(
    primary = pink500,
    primaryVariant = purple700,
    onPrimary = darkBlue2,
    secondary = blue1,
    secondaryVariant = darkBlue3,
    onSecondary = Color.Black,
    surface = darkBlue2,
    onSurface = grayBlue2,
    background = darkBlue1,
    onBackground = grayBlue2,
//    error =,
//    onError =,
)

@Composable
fun MessengerTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {
    val colors = BlueThemeDark
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