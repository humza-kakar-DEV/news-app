package com.example.designsystem.component.loading

import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.layout
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.designsystem.preview.AppPreview
import com.example.designsystem.preview.PreviewTheme
import com.example.designsystem.token.SizeToken

@Composable
fun CircularLoader(
    modifier: Modifier,
    size: Dp = SizeToken.DefaultLoaderSize,
) {
    CircularProgressIndicator(
        modifier = modifier.size(size)
    )
}

@Preview
@Composable
fun CircularLoaderPreview() {
    CircularLoader(modifier = Modifier, size = 50.dp)
//    PreviewTheme {
//    }
}

