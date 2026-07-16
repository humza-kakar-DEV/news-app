package com.example.home_impl.data.datasource

import com.example.home_impl.data.remote.api.HomeApi
import com.example.home_impl.data.remote.dto.TopHeadlinesDTO
import com.example.home_impl.domain.datasource.HomeDataSource

class HomeDataSourceImpl(
    val homeApi: HomeApi
): HomeDataSource {

    override suspend fun getTopHeadlines(
        country: String,
        category: String
    ): TopHeadlinesDTO {
        return homeApi.getTopHeadlines(
            country = country,
            category = category
        )
    }

}
