package com.example.home_impl.data.datasource

import com.example.home_impl.data.remote.api.HomeApi
import com.example.home_impl.data.remote.dto.TopHeadlinesDTO
import com.example.home.domain.datasource.HomeDataSource

class HomeDataSourceImpl(
    val homeApi: HomeApi
): HomeDataSource {

    override suspend fun getTopHeadlines(): TopHeadlinesDTO {
        return homeApi.getTopHeadlines()
    }

}