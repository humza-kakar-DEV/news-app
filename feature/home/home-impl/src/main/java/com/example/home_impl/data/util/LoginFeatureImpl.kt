package com.example.home_impl.data.util

import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavKey
import com.example.home_api.HomeFeatureApi
import com.example.home_impl.presentation.navigation.HomeScreensRoute
import com.example.home_impl.presentation.navigation.homeNavGraph
import com.example.navigation.Navigator
import com.example.navigation.Route

class LoginFeatureImpl : HomeFeatureApi {

    override fun homeEntryPoint(): Route {
        return HomeScreensRoute.HomeScreen
    }

    override fun registerEntries(
        navigator: Navigator,
        providerScope: EntryProviderScope<NavKey>
    ) {
        return providerScope.homeNavGraph(navigator)
    }
}