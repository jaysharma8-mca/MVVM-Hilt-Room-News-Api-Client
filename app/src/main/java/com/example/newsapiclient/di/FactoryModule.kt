package com.example.newsapiclient.di

import android.app.Application
import com.example.newsapiclient.domain.usecase.GetNewsHeadlinesUseCase
import com.example.newsapiclient.domain.usecase.GetSearchedUseCase
import com.example.newsapiclient.domain.usecase.SaveNewsUseCase
import com.example.newsapiclient.presentation.viewmodelfactory.NewsViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class FactoryModule {

    @Singleton
    @Provides
    fun provideNewsViewModelFactory(
        application: Application,
        getNewsHeadlinesUseCase: GetNewsHeadlinesUseCase,
        getSearchedUseCase: GetSearchedUseCase,
        saveNewsUseCase: SaveNewsUseCase,
    ):NewsViewModelFactory{
        return NewsViewModelFactory(
            application,
            getNewsHeadlinesUseCase,
            getSearchedUseCase,
            saveNewsUseCase
        )
    }
}