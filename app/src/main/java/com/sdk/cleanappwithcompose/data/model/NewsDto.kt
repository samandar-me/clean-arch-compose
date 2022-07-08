package com.sdk.cleanappwithcompose.data.model

data class NewsDto(
    val articles: List<ArticleDto>?,
    val status: String?,
    val totalResults: Int?
)