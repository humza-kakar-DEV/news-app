package com.example.design_system.component.loading

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import com.example.design_system.preview.AppPreview
import com.example.design_system.preview.PreviewTheme
import com.example.design_system.shape.AppShapes
import com.example.design_system.token.SizeToken

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
