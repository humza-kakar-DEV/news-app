package com.example.home.domain.usecase

import com.example.home.domain.model.TopHeadlines
import com.example.home.domain.repository.HomeRepository
import com.example.network.NetworkResult
import kotlinx.coroutines.flow.Flow

class GetTopHeadlinesUseCase(
    private val homeRepository: HomeRepository
) {
    suspend operator fun invoke(): Flow<NetworkResult<TopHeadlines>> {
        return homeRepository.getTopHeadlines()
    }
}