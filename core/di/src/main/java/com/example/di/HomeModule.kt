package com.example.di

import com.example.home.data.datasource.HomeDataSourceImpl
import com.example.home.data.mapper.TopHeadlinesDtoToDomainBaseMapper
import com.example.home.data.repository.HomeRepositoryImpl
import com.example.home.domain.datasource.HomeDataSource
import com.example.home.domain.repository.HomeRepository
import org.koin.dsl.module

val homeModule = module {

    single {
        TopHeadlinesDtoToDomainBaseMapper()
    }

    single<HomeDataSource> {
        HomeDataSourceImpl(
            get()
        )
    }

    single<HomeRepository> {
        HomeRepositoryImpl(
            get(),
            topHeadlinesDtoToDomainMapper = get()
        )
    }

}