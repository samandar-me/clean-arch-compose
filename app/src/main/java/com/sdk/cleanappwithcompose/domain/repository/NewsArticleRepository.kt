package com.sdk.cleanappwithcompose.domain.repository

import com.sdk.cleanappwithcompose.domain.model.Article

interface NewsArticleRepository {
    suspend fun getNewsArticle(): List<Article>
}