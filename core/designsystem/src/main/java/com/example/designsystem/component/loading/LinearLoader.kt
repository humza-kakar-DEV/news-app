package com.example.designsystem.component.loading

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.designsystem.preview.AppPreview
import com.example.designsystem.preview.PreviewTheme

@Composable
fun LinearLoader(
    modifier: Modifier
) {
    LinearProgressIndicator(
        modifier = modifier.fillMaxWidth()
    )
}

@AppPreview
@Composable
fun LinearLoaderPreview() {
    PreviewTheme {
        LinearLoader(modifier = Modifier)
    }
}