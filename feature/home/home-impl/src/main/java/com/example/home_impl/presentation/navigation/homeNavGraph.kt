package com.example.home_impl.presentation.navigation

import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavKey
import com.example.navigation.Navigator

fun EntryProviderScope<NavKey>.homeNavGraph(navigator: Navigator) {
    homeScreenEntry(navigator)
}