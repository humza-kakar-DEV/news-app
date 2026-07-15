package com.example.home_impl.presentation.viewmodel

import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.common.base.BaseEvent
import com.example.common.base.BaseIntent
import com.example.common.base.BaseState
import com.example.common.base.BaseViewModel
import com.example.home_impl.domain.model.Article
import com.example.home_impl.domain.model.TopHeadlines
import com.example.home_impl.domain.usecase.GetTopHeadlinesUseCase
import com.example.network.NetworkResult
import kotlinx.coroutines.launch

class HomeViewModel(
    private val getTopHeadlinesUseCase: GetTopHeadlinesUseCase
) : BaseViewModel<HomeState, HomeIntent, HomeEvent>(
    HomeState()
) {

    init {
        loadData()
    }

    fun loadData() {
        loadTopHeadlines()
    }

    fun loadTopHeadlines() = viewModelScope.launch {
        setState {
            copy(isLoading = true)
        }
        getTopHeadlinesUseCase().collect { result ->
            when (result) {
                is NetworkResult.Error -> {
                    setState {
                        copy(
                            isLoading = false,
                            error = result.message
                        )
                    }
                }

                is NetworkResult.Success<TopHeadlines> -> {
                    setState {
                        copy(
                            isLoading = false,
                            articles = result.data.articles
                        )
                    }
                }
            }
        }
    }

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
    val articles: List<Article> = emptyList(),
    val error: String? = null
) : BaseState

sealed class HomeIntent : BaseIntent {
    data object OnNewsCardClick : HomeIntent()
    data object OnSearchClick : HomeIntent()
    data object OnCategoryClick : HomeIntent()
}

sealed class HomeEvent(
) : BaseEvent