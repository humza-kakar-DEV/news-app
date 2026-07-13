package com.example.design_system.component.image

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun CircularImage(
    imageUrl: String?,
    modifier: Modifier = Modifier,
    size: Dp = 40.dp,
    placeholderColor: Color = MaterialTheme.colorScheme.surfaceVariant
) {
    AsyncImage(
        model = imageUrl,
        contentDescription = null,
        modifier = modifier
            .size(size)
            .clip(CircleShape)
            .background(placeholderColor),
        contentScale = ContentScale.Crop
    )
}
