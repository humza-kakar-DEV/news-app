package com.example.home.data.datasource

import com.example.home.data.remote.api.HomeApi
import com.example.home.data.remote.dto.TopHeadlinesDTO
import com.example.home.domain.datasource.HomeDataSource
import com.example.network.NetworkResult
import com.example.network.safeApiCall
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.flowOf

class HomeDataSourceImpl(
    val homeApi: HomeApi
): HomeDataSource {

    override suspend fun getTopHeadlines(): TopHeadlinesDTO {
        return homeApi.getTopHeadlines()
    }

}