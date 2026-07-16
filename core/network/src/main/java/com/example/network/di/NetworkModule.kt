package com.example.network.di

import com.chuckerteam.chucker.api.ChuckerInterceptor
import com.example.network.ApiKeyInterceptor
import com.example.network.BASE_URL_LIVE
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

val networkModule = module {
    single {
        HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }
    }

    single {
        ChuckerInterceptor.Builder(androidContext()).build()
    }

    single {
        ApiKeyInterceptor()
    }

    single {
        OkHttpClient.Builder()
            .addInterceptor(get<HttpLoggingInterceptor>())
            .addInterceptor(get<ChuckerInterceptor>())
            .addInterceptor(get<ApiKeyInterceptor>())
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .build()
    }

    single<Retrofit> {
        Retrofit.Builder()
            .baseUrl(BASE_URL_LIVE)
            .client(get())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}
