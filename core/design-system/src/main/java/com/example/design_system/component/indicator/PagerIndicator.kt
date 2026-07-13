package com.example.design_system.component.indicator

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import com.example.design_system.animation.AnimationDuration
import com.example.design_system.preview.AppPreview
import com.example.design_system.preview.PreviewTheme
import com.example.design_system.token.SizeToken
import com.example.design_system.token.SpacingToken

@Composable
fun PagerIndicator(
    count: Int,
    selectedIndex: Int,
    modifier: Modifier = Modifier,
    activeColor: Color = MaterialTheme.colorScheme.primary,
    inactiveColor: Color = MaterialTheme.colorScheme.outlineVariant
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(SpacingToken.XSmall)
    ) {
        repeat(count) { index ->
            val isSelected = index == selectedIndex
            
            val color by animateColorAsState(
                targetValue = if (isSelected) activeColor else inactiveColor,
                animationSpec = tween(AnimationDuration.Normal),
                label = "indicator_color"
            )

            Box(
                modifier = Modifier
                    .size(SizeToken.IndicatorSize)
                    .clip(CircleShape)
                    .background(color)
            )
        }
    }
}

@AppPreview
@Composable
fun PagerIndicatorPreview() {
    PreviewTheme {
        PagerIndicator(
            count = 3,
            selectedIndex = 0
        )
    }
}
