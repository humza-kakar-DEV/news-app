package com.example.home_impl.data.remote.api

import com.example.home_impl.data.remote.dto.TopHeadlinesDTO
import retrofit2.http.GET

interface HomeApi {

    @GET
    suspend fun getTopHeadlines(): TopHeadlinesDTO

}