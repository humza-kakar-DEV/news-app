package com.example.design_system.animation

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically

object VisibilityAnimations {

    val FadeEnter: EnterTransition =
        fadeIn(animationSpec = AnimationSpec.NormalTween)

    val FadeExit: ExitTransition =
        fadeOut(animationSpec = AnimationSpec.NormalTween)

    val SlideUpEnter: EnterTransition =
        slideInVertically(
            initialOffsetY = { it },
            animationSpec = AnimationSpec.DefaultTween
        )

    val SlideDownExit: ExitTransition =
        slideOutVertically(
            targetOffsetY = { it },
            animationSpec = AnimationSpec.DefaultTween
        )
}