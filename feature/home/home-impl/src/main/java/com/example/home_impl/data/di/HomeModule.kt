package com.example.home_impl.data.di

import com.example.home_impl.data.datasource.HomeDataSourceImpl
import com.example.home_impl.data.mapper.TopHeadlinesDtoToDomainMapper
import com.example.home_impl.data.repository.HomeRepositoryImpl
import com.example.home_impl.domain.datasource.HomeDataSource
import com.example.home_impl.domain.repository.HomeRepository
import org.koin.dsl.module

val homeModule = module {

    single {
        TopHeadlinesDtoToDomainMapper()
    }

    single<HomeDataSource> {
        HomeDataSourceImpl(
            get()
        )
    }

    single<HomeRepository> {
        HomeRepositoryImpl(
            homeDataSource = get(),
            topHeadlinesDtoToDomainMapper = get()
        )
    }

}