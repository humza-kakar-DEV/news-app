package com.example.home_impl.data.di

import com.example.home_api.HomeFeatureApi
import com.example.home_impl.data.datasource.HomeDataSourceImpl
import com.example.home_impl.data.mapper.TopHeadlinesDtoToDomainMapper
import com.example.home_impl.data.remote.api.HomeApi
import com.example.home_impl.data.repository.HomeRepositoryImpl
import com.example.home_impl.data.util.LoginFeatureImpl
import com.example.home_impl.domain.datasource.HomeDataSource
import com.example.home_impl.domain.repository.HomeRepository
import com.example.home_impl.domain.usecase.GetTopHeadlinesUseCase
import com.example.home_impl.presentation.viewmodel.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit

val homeModule = module {

    single<HomeApi> {
        get<Retrofit>().create(HomeApi::class.java)
    }

    single<HomeFeatureApi> {
        LoginFeatureImpl()
    }

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

    factory {
        GetTopHeadlinesUseCase(get())
    }

    viewModel {
        HomeViewModel(get())
    }

}
