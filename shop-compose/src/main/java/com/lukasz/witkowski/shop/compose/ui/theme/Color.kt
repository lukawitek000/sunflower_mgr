/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lukasz.witkowski.shop.compose.ui.theme

import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

// --- Light Mode Palette ---
val LightOrangeYellow = Color(0xFFFFB300) // A vibrant orange-yellow
val LightOrangeYellowVariant = Color(0xFFFFCA28) // A slightly lighter shade
val LightBackground = Color(0xFFFFFFFF) // White background
val LightSurface = Color(0xFFFAFAFA) // Slightly off-white for surfaces like cards
val LightTextPrimary = Color(0xFF212121) // Dark grey for primary text
val LightTextSecondary = Color(0xFF757575) // Medium grey for secondary text/hints
val LightIcon = Color(0xFF424242) // Dark grey for icons
val LightInputBorder = Color(0xFFBDBDBD) // Light grey for input border
val LightInputBackground = Color(0xFFFFFFFF) // White for input background
val LightButton = LightOrangeYellow // Orange-yellow for buttons
val LightButtonText = Color(0xFFFFFFFF) // White text on buttons
val LightFloatingActionButton = LightOrangeYellow // Orange-yellow for FAB
val LightFloatingActionButtonIcon = Color(0xFFFFFFFF) // White icon on FAB
val LightRangeSliderActive = LightOrangeYellow // Orange-yellow for active part of range slider
val LightRangeSliderInactive = Color(0xFFE0E0E0) // Light grey for inactive part of range slider
val LightCard = Color(0xFFBDBDBD) // White for the item card


// --- Dark Mode Palette ---
val DarkOrangeYellow = Color(0xFFFFD54F) // A slightly softer orange-yellow for dark mode
val DarkOrangeYellowVariant = Color(0xFFFFE082) // A lighter shade for emphasis
val DarkBackground = Color(0xFF121212) // Dark grey background
val DarkSurface = Color(0xFF1E1E1E) // Slightly lighter dark grey for surfaces
val DarkTextPrimary = Color(0xFFFFFFFF) // White for primary text
val DarkTextSecondary = Color(0xFFBDBDBD) // Light grey for secondary text/hints
val DarkIcon = Color(0xFFE0E0E0) // Light grey for icons
val DarkInputBorder = Color(0xFF616161) // Medium dark grey for input border
val DarkInputBackground = Color(0xFF303030) // Darker grey for input background
val DarkButton = DarkOrangeYellow // Orange-yellow for buttons in dark mode
val DarkButtonText = Color(0xFF212121) // Dark grey text on buttons
val DarkFloatingActionButton = DarkOrangeYellow // Orange-yellow for FAB in dark mode
val DarkFloatingActionButtonIcon = Color(0xFF212121) // Dark grey icon on FAB
val DarkRangeSliderActive = DarkOrangeYellow // Orange-yellow for active part of range slider in dark mode
val DarkRangeSliderInactive = Color(0xFF424242) // Dark grey for inactive part of range slider in dark mode
val DarkCard = Color(0xFF303030) // A darker grey for the item card


// --- Color Palette Definition for your App Theme ---
data class AppColors(
    val topBar: Color,
    val statusBar: Color,
    val card: Color,
    val inputTextFieldBackground: Color,
    val inputTextFieldBorder: Color,
    val textPrimary: Color,
    val textSecondary: Color,
    val icons: Color,
    val rangeSliderActive: Color,
    val rangeSliderInactive: Color,
    val button: Color,
    val buttonText: Color,
    val floatingActionButton: Color,
    val floatingActionButtonIcon: Color,
    val background: Color,
    val surface: Color,
)

val LightColorPalette = AppColors(
    topBar = LightOrangeYellow,
    statusBar = LightOrangeYellowVariant,
    card = LightCard,
    inputTextFieldBackground = LightInputBackground,
    inputTextFieldBorder = LightInputBorder,
    textPrimary = LightTextPrimary,
    textSecondary = LightTextSecondary,
    icons = LightIcon,
    rangeSliderActive = LightRangeSliderActive,
    rangeSliderInactive = LightRangeSliderInactive,
    button = LightButton,
    buttonText = LightButtonText,
    floatingActionButton = LightFloatingActionButton,
    floatingActionButtonIcon = LightFloatingActionButtonIcon,
    background = LightBackground,
    surface = LightSurface
)

val DarkColorPalette = AppColors(
    topBar = DarkOrangeYellow,
    statusBar = DarkOrangeYellowVariant,
    card = DarkCard,
    inputTextFieldBackground = DarkInputBackground,
    inputTextFieldBorder = DarkInputBorder,
    textPrimary = DarkTextPrimary,
    textSecondary = DarkTextSecondary,
    icons = DarkIcon,
    rangeSliderActive = DarkRangeSliderActive,
    rangeSliderInactive = DarkRangeSliderInactive,
    button = DarkButton,
    buttonText = DarkButtonText,
    floatingActionButton = DarkFloatingActionButton,
    floatingActionButtonIcon = DarkFloatingActionButtonIcon,
    background = DarkBackground,
    surface = DarkSurface
)
