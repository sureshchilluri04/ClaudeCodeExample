/**
 * Color.kt
 *
 * Defines the color palette used by the application's Material 3 theme.
 *
 * Colors are organized in two lightness tiers:
 *  - 80-series: lighter variants intended for dark-theme primary roles.
 *  - 40-series: darker variants intended for light-theme primary roles.
 */
package com.example.claudecodeexample.ui.theme

import androidx.compose.ui.graphics.Color

// --- Dark-theme color palette (lighter tones) ---

/** Light purple used as the primary color in dark theme. */
val Purple80 = Color(0xFFD0BCFF)

/** Muted purple-grey used as the secondary color in dark theme. */
val PurpleGrey80 = Color(0xFFCCC2DC)

/** Soft pink used as the tertiary color in dark theme. */
val Pink80 = Color(0xFFEFB8C8)

// --- Light-theme color palette (darker tones) ---

/** Deep purple used as the primary color in light theme. */
val Purple40 = Color(0xFF6650a4)

/** Muted purple-grey used as the secondary color in light theme. */
val PurpleGrey40 = Color(0xFF625b71)

/** Dark rose used as the tertiary color in light theme. */
val Pink40 = Color(0xFF7D5260)