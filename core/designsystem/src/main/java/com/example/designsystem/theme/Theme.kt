package com.example.designsystem.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.example.designsystem.color.DarkColorScheme
import com.example.designsystem.color.LightColorScheme
import com.example.designsystem.shape.AppShapes
import com.example.designsystem.typography.AppTypography

@Composable
fun NewsAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {

    val colorScheme =
        if (darkTheme)
            DarkColorScheme
        else
            LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = AppTypography,
        shapes = AppShapes,
        content = content
    )
}