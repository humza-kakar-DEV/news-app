package com.example.navigation

import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavKey

fun EntryProviderScope<NavKey>.registerEntries(featureApi: FeatureApi, navigator: Navigator) {
    featureApi.registerEntries(navigator, this)
}