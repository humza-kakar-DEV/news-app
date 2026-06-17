package com.example.common

class ApiKeyProvider(
    private val apiKey: String
) {
    fun get(): String = apiKey
}