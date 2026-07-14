package com.example.navigation

import androidx.compose.runtime.Stable
import androidx.compose.runtime.mutableStateListOf
import androidx.navigation3.runtime.NavKey

@Stable
class Navigator(entryPoint: NavKey) {

    val backStack = mutableStateListOf(entryPoint)

    fun navigate(route: NavKey) {
        if (route in backStack) {
            backStack.remove(route)
            backStack.add(route)
        } else {
            backStack.add(route)
        }
    }

    fun navigateClearingStack(route: NavKey) {
        backStack.clear()
        navigate(route)
    }

    fun goBack() {
        backStack.removeLastOrNull()
    }

    fun popBackStack(route: NavKey) {
        if (route in backStack) {
            val index = backStack.indexOf(route)
            backStack.removeAll(backStack.subList(index, backStack.size))
        }
    }
}
