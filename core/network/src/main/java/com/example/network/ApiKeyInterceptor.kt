package com.example.network

import com.example.network.BuildConfig

class ApiKeyInterceptor : okhttp3.Interceptor {

    override fun intercept(chain: okhttp3.Interceptor.Chain): okhttp3.Response {

        val originalRequest = chain.request()

        val newRequest = originalRequest.newBuilder()
            .addHeader("x-api-key", BuildConfig.NEWS_API_KEY)
            .build()

        return chain.proceed(newRequest)
    }
}