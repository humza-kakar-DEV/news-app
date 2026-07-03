package com.example.common.base

sealed interface BaseUiEvent {

    data class ShowToast(
        val message: String
    ) : BaseUiEvent

    data class ShowError(
        val message: String
    ) : BaseUiEvent

    data class Navigate(
        val route: String
    ) : BaseUiEvent

    data object NavigateBack : BaseUiEvent
}