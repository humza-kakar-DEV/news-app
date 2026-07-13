package com.example.designsystem.util

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.widthIn
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.unit.dp

fun Modifier.noRippleClickable(
    onClick: () -> Unit
) = composed {

    clickable(
        interactionSource = remember { MutableInteractionSource() },
        indication = null,
        onClick = onClick
    )
}

fun Modifier.visible(
    visible: Boolean
): Modifier =
    alpha(if (visible) 1f else 0f)

fun Modifier.gone(
    gone: Boolean
): Modifier =
    if (gone) Modifier.alpha(0f) else this

fun Modifier.maxContentWidth() =
    fillMaxWidth()
        .widthIn(max = 600.dp)