package com.example.newsapp

import androidx.compose.animation.ContentTransform
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.SizeTransform
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.ui.NavDisplay
import com.example.home_api.HomeFeatureApi
import com.example.navigation.Navigator
import com.example.navigation.registerEntries
import org.koin.androidx.compose.koinViewModel
import org.koin.compose.koinInject
import kotlin.collections.removeLastOrNull

@Composable
fun AppNavGraph() {
    val homeFeatureApi = koinInject<HomeFeatureApi>()

    val navigationViewModel: NavigationViewModel = koinViewModel()

    val entryProvider = entryProvider {
        registerEntries(homeFeatureApi, navigationViewModel.navigator)
    }

    NavDisplay(
        backStack = navigationViewModel.backStack,
        entryProvider = entryProvider,
        onBack = {
            navigationViewModel.backStack.removeLastOrNull()
        },
        popTransitionSpec = {
            ContentTransform(
                targetContentEnter = EnterTransition.None,
                initialContentExit = ExitTransition.None,
                sizeTransform = SizeTransform(clip = false)
            )
        },
        transitionSpec = {
            ContentTransform(
                targetContentEnter = EnterTransition.None,
                initialContentExit = ExitTransition.None,
                sizeTransform = SizeTransform(clip = false)
            )
        }
    )
}