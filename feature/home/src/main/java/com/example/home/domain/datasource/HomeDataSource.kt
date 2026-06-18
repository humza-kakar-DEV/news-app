package com.example.home.domain.datasource

import com.example.home.data.remote.dto.TopHeadlinesDTO

interface HomeDataSource {

    suspend fun getTopHeadlines(): TopHeadlinesDTO

}