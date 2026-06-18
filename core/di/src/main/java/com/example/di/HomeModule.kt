package com.example.di

import com.example.home.data.datasource.HomeDataSourceImpl
import com.example.home.data.repository.HomeRepositoryImpl
import com.example.home.domain.datasource.HomeDataSource
import com.example.home.domain.repository.HomeRepository
import org.koin.core.scope.get
import org.koin.dsl.module

val homeModule = module {

    single<HomeRepository> {
        HomeRepositoryImpl()
    }

    single<HomeDataSource> {
        HomeDataSourceImpl(get())
    }

}