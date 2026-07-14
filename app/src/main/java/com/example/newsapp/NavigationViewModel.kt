package com.example.newsapp

import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.lifecycle.ViewModel
import androidx.navigation3.runtime.NavKey
import com.example.navigation.Navigator
class NavigationViewModel(
//    loginFeatureApi: LoginFeatureApi
) : ViewModel() {

    val navigator = Navigator(loginFeatureApi.loginEntryPoint())
    val backStack: SnapshotStateList<NavKey> get() = navigator.backStack
}