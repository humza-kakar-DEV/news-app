package com.example.newsapp.di

import com.example.common.ApiKeyProvider
import com.example.newsapp.BuildConfig
import org.koin.dsl.module

val appModule = module {
    single {
        ApiKeyProvider(
            apiKey = BuildConfig.API_KEY
        )
    }
}