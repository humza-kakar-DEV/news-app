package com.example.home_impl.presentation.navigation

import com.example.navigation.Route
import kotlinx.serialization.Serializable

internal sealed class HomeScreensRoute : Route {

    @Serializable
    data object HomeScreen : HomeScreensRoute()

}