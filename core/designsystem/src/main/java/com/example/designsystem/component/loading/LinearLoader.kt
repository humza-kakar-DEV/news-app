package com.example.designsystem.component.loading

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun LinearLoader(
    modifier: Modifier
) {
    LinearProgressIndicator(
        modifier = modifier.fillMaxWidth()
    )
}