package com.example.home_impl.data.repository

import com.example.home_impl.data.mapper.TopHeadlinesDtoToDomainMapper
import com.example.home_impl.domain.datasource.HomeDataSource
import com.example.home_impl.domain.model.TopHeadlines
import com.example.home_impl.domain.repository.HomeRepository
import com.example.network.NetworkResult
import com.example.network.safeApiCall
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class HomeRepositoryImpl(
    private val homeDataSource: HomeDataSource,
    private val topHeadlinesDtoToDomainMapper: TopHeadlinesDtoToDomainMapper
) : HomeRepository {

    override suspend fun getTopHeadlines(): Flow<NetworkResult<TopHeadlines>> = flow {
        emit(
            safeApiCall {
                topHeadlinesDtoToDomainMapper
                    .map(homeDataSource.getTopHeadlines())
            }
        )
    }

}