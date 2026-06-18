package com.example.home.data.remote.api

import com.example.home.data.remote.dto.TopHeadlinesDTO
import retrofit2.http.GET

interface HomeApi {

    @GET
    suspend fun getTopHeadlines(): TopHeadlinesDTO

}