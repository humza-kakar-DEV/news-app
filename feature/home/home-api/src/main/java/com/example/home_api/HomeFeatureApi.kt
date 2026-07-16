package com.example.home_api

import com.example.navigation.FeatureApi
import com.example.navigation.Route

interface HomeFeatureApi : FeatureApi {
    fun homeEntryPoint(): Route


}
