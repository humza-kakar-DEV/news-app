package com.example.config

class NewsApiKeyProvider (
    val newsApiKey: String
) {
    fun get() = newsApiKey
}