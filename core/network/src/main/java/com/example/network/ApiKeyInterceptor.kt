package com.example.network

import com.example.common.util.NewsApiKeyProvider

class ApiKeyInterceptor(
    private val newsApiKeyProvider: NewsApiKeyProvider
) : okhttp3.Interceptor {

    override fun intercept(chain: okhttp3.Interceptor.Chain): okhttp3.Response {

        val originalRequest = chain.request()

        val newRequest = originalRequest.newBuilder()
            .addHeader("x-api-key", newsApiKeyProvider.get())
            .build()

        return chain.proceed(newRequest)
    }
}