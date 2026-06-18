package com.example.home.domain.repository

import com.example.home.domain.model.TopHeadlines
import com.example.network.NetworkResult
import kotlinx.coroutines.flow.Flow

interface HomeRepository {

    suspend fun getTopHeadlines(): Flow<NetworkResult<TopHeadlines>>

}