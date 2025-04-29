package com.lukasz.witkowski.shop.compose.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(
    primary = DarkColorPalette.button,
    onPrimary = DarkColorPalette.buttonText,
    secondary = DarkOrangeYellowVariant,
    onSecondary = DarkColorPalette.textPrimary,
    tertiary = DarkOrangeYellow,
    onTertiary = DarkColorPalette.textPrimary,
    background = DarkColorPalette.background,
    onBackground = DarkColorPalette.textPrimary,
    surface = DarkColorPalette.surface,
    onSurface = DarkColorPalette.textPrimary,
    secondaryContainer = DarkColorPalette.card,
)

private val LightColorScheme = lightColorScheme(
    primary = LightColorPalette.button,
    onPrimary = LightColorPalette.buttonText,
    secondary = LightOrangeYellowVariant,
    onSecondary = LightColorPalette.textPrimary,
    tertiary = LightOrangeYellow,
    onTertiary = LightColorPalette.textPrimary,
    background = LightColorPalette.background,
    onBackground = LightColorPalette.textPrimary,
    surface = LightColorPalette.surface,
    onSurface = LightColorPalette.textPrimary,
    secondaryContainer = LightColorPalette.card,
)

@Composable
fun Sunflower_mgrTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}