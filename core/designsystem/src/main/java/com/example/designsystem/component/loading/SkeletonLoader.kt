package com.example.designsystem.component.loading

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import com.example.designsystem.preview.AppPreview
import com.example.designsystem.preview.PreviewTheme
import com.example.designsystem.shape.AppShapes
import com.example.designsystem.token.SizeToken

@Composable
fun SkeletonLoader(
    modifier: Modifier = Modifier,
    height: Dp = SizeToken.SkeletonHeight,
    shape: Shape = AppShapes.small,
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(height)
            .clip(shape)
            .shimmerEffect()
    )
}

@AppPreview
@Composable
fun SkeletonLoaderPreview() {
    PreviewTheme {
        SkeletonLoader()
    }
}
