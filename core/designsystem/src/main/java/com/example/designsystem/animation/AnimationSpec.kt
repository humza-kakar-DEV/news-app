package com.example.designsystem.animation

import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.Spring.DampingRatioMediumBouncy
import androidx.compose.animation.core.Spring.StiffnessMedium
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.ui.unit.IntOffset

object AnimationSpec {

    val FastTween = tween<Float>(
        durationMillis = AnimationDuration.Fast,
        easing = FastOutSlowInEasing
    )

    val NormalTween = tween<Float>(
        durationMillis = AnimationDuration.Normal,
        easing = FastOutSlowInEasing
    )

    val SlowTween = tween<Float>(
        durationMillis = AnimationDuration.Slow,
        easing = FastOutSlowInEasing
    )

    val Spring = spring<Float>(
        dampingRatio = DampingRatioMediumBouncy,
        stiffness = StiffnessMedium
    )

    val DefaultTween = tween<IntOffset>(
        durationMillis = AnimationDuration.Normal,
        easing = FastOutSlowInEasing
    )
}