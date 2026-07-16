package com.example.home_impl.data.remote.api

import com.example.home_impl.data.remote.dto.TopHeadlinesDTO
import com.example.network.TOP_HEADLINES
import retrofit2.http.GET
import retrofit2.http.Query

interface HomeApi {

    @GET(TOP_HEADLINES)
    suspend fun getTopHeadlines(
        @Query("country") country: String = "us",
        @Query("category") category: String = "general"
    ): TopHeadlinesDTO

}
