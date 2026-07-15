package com.example.newsapp

import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.lifecycle.ViewModel
import androidx.navigation3.runtime.NavKey
import com.example.home_api.HomeFeatureApi
import com.example.navigation.Navigator
class NavigationViewModel(
    homeFeatureApi: HomeFeatureApi
) : ViewModel() {

    val navigator = Navigator(homeFeatureApi.homeEntryPoint())
    val backStack: SnapshotStateList<NavKey> get() = navigator.backStack
}