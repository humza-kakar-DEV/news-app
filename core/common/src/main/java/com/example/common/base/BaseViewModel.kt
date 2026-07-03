package com.example.common.base

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch

abstract class BaseViewModel<
        STATE : BaseState,
        INTENT : BaseIntent,
        EVENT : BaseEvent
        >(
    initialState: STATE
) : ViewModel() {

    // ------------------------------------------------
    // UI STATE
    // ------------------------------------------------

    private val _uiState: MutableState<STATE> =
        mutableStateOf(initialState)

    val uiState: State<STATE>
        get() = _uiState

    val currentState: STATE
        get() = _uiState.value


    // ------------------------------------------------
    // LOADER
    // ------------------------------------------------

    private val _loaderState =
        mutableStateOf(LoaderState())

    val loaderState: State<LoaderState>
        get() = _loaderState


    // ------------------------------------------------
    // INTENTS
    // ------------------------------------------------

    private val _intent =
        MutableSharedFlow<INTENT>()

    // ------------------------------------------------
    // EVENTS
    // ------------------------------------------------

    private val _event =
        MutableSharedFlow<EVENT>()

    val event =
        _event.asSharedFlow()


    // ------------------------------------------------
    // BASE EVENTS
    // ------------------------------------------------

    private val _baseEvent =
        MutableSharedFlow<BaseUiEvent>()

    val baseEvent =
        _baseEvent.asSharedFlow()


    // ------------------------------------------------
    // INIT
    // ------------------------------------------------

    init {

        observeIntents()
    }


    // ------------------------------------------------
    // OBSERVE INTENTS
    // ------------------------------------------------

    private fun observeIntents() {

        viewModelScope.launch {

            _intent.collect {

                handleIntent(it)
            }
        }
    }


    // ------------------------------------------------
    // HANDLE INTENT
    // ------------------------------------------------

    protected abstract suspend fun handleIntent(
        intent: INTENT
    )


    // ------------------------------------------------
    // SEND INTENT
    // ------------------------------------------------

    fun onIntent(intent: INTENT) {

        viewModelScope.launch {

            _intent.emit(intent)
        }
    }


    // ------------------------------------------------
    // UPDATE STATE
    // ------------------------------------------------

    protected fun setState(
        reducer: STATE.() -> STATE
    ) {

        _uiState.value =
            currentState.reducer()
    }


    // ------------------------------------------------
    // SEND SCREEN EVENT
    // ------------------------------------------------

    protected fun sendEvent(
        event: EVENT
    ) {

        viewModelScope.launch {

            _event.emit(event)
        }
    }


    // ------------------------------------------------
    // LOADER
    // ------------------------------------------------

    protected fun showLoader() {

        _loaderState.value =
            loaderState.value.copy(
                isLoading = true
            )
    }

    protected fun hideLoader() {

        _loaderState.value =
            loaderState.value.copy(
                isLoading = false
            )
    }


    // ------------------------------------------------
    // TOAST
    // ------------------------------------------------

    protected fun showToast(
        message: String
    ) {

        viewModelScope.launch {

            _baseEvent.emit(
                BaseUiEvent.ShowToast(message)
            )
        }
    }


    // ------------------------------------------------
    // ERROR
    // ------------------------------------------------

    protected fun showError(
        message: String
    ) {

        hideLoader()

        viewModelScope.launch {

            _baseEvent.emit(
                BaseUiEvent.ShowError(message)
            )
        }
    }


    // ------------------------------------------------
    // NAVIGATION
    // ------------------------------------------------

    protected fun navigate(
        route: String
    ) {

        viewModelScope.launch {

            _baseEvent.emit(
                BaseUiEvent.Navigate(route)
            )
        }
    }

    protected fun navigateBack() {

        viewModelScope.launch {

            _baseEvent.emit(
                BaseUiEvent.NavigateBack
            )
        }
    }
}