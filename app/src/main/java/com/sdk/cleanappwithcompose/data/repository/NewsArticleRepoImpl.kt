package com.sdk.cleanappwithcompose.data.repository

import com.sdk.cleanappwithcompose.data.network.ApiService
import com.sdk.cleanappwithcompose.domain.mappers.toDomain
import com.sdk.cleanappwithcompose.domain.model.Article
import com.sdk.cleanappwithcompose.domain.repository.NewsArticleRepository
import com.sdk.cleanappwithcompose.util.SafeApiRequest
import javax.inject.Inject

class NewsArticleRepoImpl @Inject constructor(private val apiService: ApiService) :
    NewsArticleRepository, SafeApiRequest() {
    override suspend fun getNewsArticle(): List<Article> {
        val response = safeApiRequest { apiService.getNewsArticles() }
        return response.articles?.toDomain()!!
    }
}