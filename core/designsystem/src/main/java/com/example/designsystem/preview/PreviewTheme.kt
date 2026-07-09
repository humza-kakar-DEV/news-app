package com.example.designsystem.preview

import androidx.compose.runtime.Composable
import com.example.designsystem.theme.NewsAppTheme

@Composable
fun PreviewTheme(
    content: @Composable () -> Unit
) {
    NewsAppTheme {
        content()
    }
}