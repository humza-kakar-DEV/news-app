package com.example.home_impl.domain.datasource

import com.example.home.data.remote.dto.TopHeadlinesDTO

interface HomeDataSource {

    suspend fun getTopHeadlines(): TopHeadlinesDTO

}