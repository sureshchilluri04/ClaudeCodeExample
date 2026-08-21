/**
 * Type.kt
 *
 * Defines the Material 3 typography scale for the application.
 *
 * Only [bodyLarge] is explicitly customized here. All other text styles
 * ([titleLarge], [labelSmall], etc.) fall back to Material 3 defaults.
 * Commented-out examples below show how to override additional styles.
 */
package com.example.claudecodeexample.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

/**
 * Application-wide Material 3 typography configuration.
 *
 * [bodyLarge] is the default style applied to most body text throughout the app.
 * Extend this object to override additional type roles from the Material 3 scale.
 */
// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)
