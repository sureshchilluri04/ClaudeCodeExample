/**
 * Theme.kt
 *
 * Defines [ClaudeCodeExampleTheme], the top-level Material 3 theme composable for the app.
 *
 * Supports:
 *  - Light and dark color schemes driven by the system setting.
 *  - Dynamic color (Material You) on Android 12+ (API 31+), which extracts colors
 *    from the user's wallpaper. Falls back to static [LightColorScheme] / [DarkColorScheme]
 *    on older API levels.
 */
package com.example.claudecodeexample.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

/**
 * Static dark color scheme used when dynamic color is unavailable or disabled.
 *
 * Maps the 80-series palette entries to Material 3 color roles.
 */
private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80
)

/**
 * Static light color scheme used when dynamic color is unavailable or disabled.
 *
 * Maps the 40-series palette entries to Material 3 color roles.
 * Additional role overrides (background, surface, onPrimary, etc.) can be
 * uncommented below as the design evolves.
 */
private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40

    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

/**
 * Top-level theme composable that wraps all app UI with the correct Material 3 color scheme
 * and typography.
 *
 * Color scheme selection priority:
 * 1. **Dynamic color** (Android 12+): wallpaper-extracted colors, respecting [darkTheme].
 * 2. **Static dark scheme** ([DarkColorScheme]) when [darkTheme] is true.
 * 3. **Static light scheme** ([LightColorScheme]) as the default fallback.
 *
 * @param darkTheme Whether to use the dark color scheme. Defaults to the system setting.
 * @param dynamicColor Whether to enable Material You dynamic color (Android 12+ only).
 *                     Defaults to `true`.
 * @param content The composable content to render inside this theme.
 */
@Composable
fun ClaudeCodeExampleTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        // Use wallpaper-based dynamic colors on supported devices (API 31+)
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            // Safe: dynamicDarkColorScheme/dynamicLightColorScheme accept any Context,
            // but we guard with runCatching to prevent crashes on devices where the
            // dynamic color APIs throw unexpectedly (e.g. restricted OEM builds).
            val context = LocalContext.current
            runCatching {
                if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
            }.getOrElse {
                if (darkTheme) DarkColorScheme else LightColorScheme
            }
        }

        // Fall back to static dark scheme when dynamic color is unavailable
        darkTheme -> DarkColorScheme

        // Default to static light scheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
