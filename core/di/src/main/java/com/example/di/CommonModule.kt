package com.example.di

import com.example.common.BuildConfig
import com.example.config.NewsApiKeyProvider
import org.koin.dsl.module

val commonModule = module {

    single {
        NewsApiKeyProvider(newsApiKey = BuildConfig.NEWS_API_KEY)
    }

}