package com.example.home_impl.presentation.navigation

import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavKey
import com.example.navigation.Navigator

fun EntryProviderScope<NavKey>.homeScreenEntry(navigator: Navigator) {
    entry<HomeScreensRoute.HomeScreen> {
//        val viewModel = koinViewModel<LoginViewModel>()
//        BaseScreen(
//            edgeToEdge = true,
//            loaderState = viewModel.loaderState,
//            baseIntent = viewModel::onBaseIntent,
//            baseUIEvents = viewModel.baseUIEvents,
//            navigation = navigator::handleNavigation,
//        ) {
//            Box(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .systemBarsPadding()
//            ) {
//
//                LoginScreen(
//                    uiState = viewModel.currentState,
//                    onIntent = viewModel::onIntent,
//                    onEvent = viewModel.event
//                )
//            }
//        }
    }
}