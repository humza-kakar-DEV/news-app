package com.example.home_impl.domain.datasource

import com.example.home_impl.data.remote.dto.TopHeadlinesDTO

interface HomeDataSource {

    suspend fun getTopHeadlines(
        country: String = "us",
        category: String = "general"
    ): TopHeadlinesDTO

}
