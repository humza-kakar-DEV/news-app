package com.example.home.data.repository

import com.example.home.domain.datasource.HomeDataSource
import com.example.home.domain.model.TopHeadlines
import com.example.home.domain.repository.HomeRepository
import com.example.network.NetworkResult
import com.example.network.safeApiCall
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class HomeRepositoryImpl(
    private val homeDataSource: HomeDataSource
): HomeRepository {

    override suspend fun getTopHeadlines(): Flow<NetworkResult<TopHeadlines>> = flow {

        emit(NetworkResult.Loading)

        try {
            emit(
                NetworkResult.Success(
                    safeApiCall { homeDataSource.getTopHeadlines() }
                )
            )
        } catch (e: Exception) {
            emit(NetworkResult.Error(e.message ?: "Unknown Error"))
        }
    }

}