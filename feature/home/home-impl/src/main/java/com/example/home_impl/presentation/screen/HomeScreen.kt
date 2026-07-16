package com.example.home_impl.presentation.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.design_system.preview.AppPreview
import com.example.design_system.preview.PreviewTheme

@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        
    }
}

@AppPreview
@Composable
fun HomeScreenPreview() {
    PreviewTheme {
        HomeScreen()
    }
}
