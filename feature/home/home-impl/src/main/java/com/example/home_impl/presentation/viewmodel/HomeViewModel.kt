package com.example.home_impl.presentation.viewmodel

import com.example.common.base.BaseEvent
import com.example.common.base.BaseIntent
import com.example.common.base.BaseState
import com.example.common.base.BaseViewModel

class HomeViewModel: BaseViewModel<HomeState, HomeIntent, HomeEvent>(
    HomeState()
) {

    override suspend fun handleIntent(intent: HomeIntent) {
        when (intent) {
            HomeIntent.OnCategoryClick -> {
            }
            HomeIntent.OnNewsCardClick -> {

            }
            HomeIntent.OnSearchClick -> {

            }
        }
    }
}

data class HomeState(
    val isLoading: Boolean = false,
    val newsImage: String = "",
    val newsTitle: String =  "",
    val newsDescription: String = "",
    val newsAuthor: String = "",
    val newsPublishedAt: String = "",
): BaseState

sealed class HomeIntent : BaseIntent {
    data object OnNewsCardClick: HomeIntent()
    data object OnSearchClick: HomeIntent()
    data object OnCategoryClick: HomeIntent()
}

sealed class HomeEvent(
): BaseEvent