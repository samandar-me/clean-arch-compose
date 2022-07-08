package com.sdk.cleanappwithcompose.domain.di

import com.sdk.cleanappwithcompose.data.network.ApiService
import com.sdk.cleanappwithcompose.data.repository.NewsArticleRepoImpl
import com.sdk.cleanappwithcompose.domain.repository.NewsArticleRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DomainModule {
    @Provides
    fun provideNewsRepository(apiService: ApiService): NewsArticleRepository {
        return NewsArticleRepoImpl(apiService)
    }
}