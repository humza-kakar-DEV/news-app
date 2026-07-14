package com.example.navigation

import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavKey

interface FeatureApi {
    fun registerEntries(navigator: Navigator, providerScope: EntryProviderScope<NavKey>)
}