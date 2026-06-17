package com.example.network

suspend inline fun <T> safeApiCall(
    crossinline apiCall: suspend () -> T
): NetworkResult<T> {

    return try {

        NetworkResult.Success(
            apiCall()
        )

    } catch (e: Exception) {

        NetworkResult.Error(
            e.message ?: "Unknown Error"
        )
    }
}