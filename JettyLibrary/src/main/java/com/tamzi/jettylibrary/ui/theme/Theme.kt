package com.tamzi.kahawabucks.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import com.tamzi.kahawabucks.ui.theme.atoms.kahawaBeige
import com.tamzi.kahawabucks.ui.theme.atoms.kahawaBlack
import com.tamzi.kahawabucks.ui.theme.atoms.kahawaBoldGreen
import com.tamzi.kahawabucks.ui.theme.atoms.kahawaDeepBrown
import com.tamzi.kahawabucks.ui.theme.atoms.kahawaGrey

private val DarkColorPalette = darkColors(
    primary = kahawaBlack,
    primaryVariant = kahawaDeepBrown,
    secondary = kahawaBoldGreen
)

private val LightColorPalette = lightColors(
    primary = kahawaGrey,
    primaryVariant = kahawaBeige,
    secondary = Teal200

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun KahawaBucksTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography   ,
        shapes = Shapes,
        content = content
    )
}