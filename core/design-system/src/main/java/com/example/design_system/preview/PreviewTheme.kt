package com.example.design_system.preview

import androidx.compose.runtime.Composable
import com.example.design_system.theme.NewsAppTheme

@Composable
fun PreviewTheme(
    content: @Composable () -> Unit
) {
    NewsAppTheme {
        content()
    }
}