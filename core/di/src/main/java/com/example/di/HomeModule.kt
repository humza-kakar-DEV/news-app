package com.example.di

import com.example.home_impl.data.datasource.HomeDataSourceImpl
import com.example.home_impl.data.mapper.TopHeadlinesDtoToDomainBaseMapper
import com.example.home_impl.data.repository.HomeRepositoryImpl
import com.example.home_impl.domain.datasource.HomeDataSource
import com.example.home_impl.domain.repository.HomeRepository
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