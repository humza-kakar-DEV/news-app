package com.example.design_system.component.loading

import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.design_system.preview.AppPreview
import com.example.design_system.preview.PreviewTheme
import com.example.design_system.token.SizeToken

@Composable
fun CircularLoader(
    modifier: Modifier,
    size: Dp = SizeToken.DefaultLoaderSize,
) {
    CircularProgressIndicator(
        modifier = modifier.size(size)
    )
}

@AppPreview
@Composable
fun CircularLoaderPreview() {
    PreviewTheme {
        CircularLoader(modifier = Modifier, size = 50.dp)
    }
}

