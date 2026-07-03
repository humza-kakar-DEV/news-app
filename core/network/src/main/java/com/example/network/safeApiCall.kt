package com.example.network

suspend fun <T> safeApiCall(
    apiCall: suspend () -> T
): NetworkResult<T> {
    return try {
        val response = apiCall()
        NetworkResult.Success(response)
    } catch (e: retrofit2.HttpException) {
        NetworkResult.Error(
            message = e.message ?: "HTTP Error"
        )
    } catch (e: java.io.IOException) {
        NetworkResult.Error("Network Error: Check Internet")
    } catch (e: Exception) {
        NetworkResult.Error("Unexpected Error: ${e.localizedMessage}")
    }
}