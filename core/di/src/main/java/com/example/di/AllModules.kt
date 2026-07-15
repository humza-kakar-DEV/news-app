package com.example.di

import com.example.home_impl.data.di.homeModule

val allModules = listOf(
    networkModule,
    databaseModule,
    datastoreModule,
    commonModule,
//    detailModule,
    homeModule,
//    onboardingModule,
    configModule
)