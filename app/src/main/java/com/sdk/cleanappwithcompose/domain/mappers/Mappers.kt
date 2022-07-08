package com.sdk.cleanappwithcompose.domain.mappers

import com.sdk.cleanappwithcompose.data.model.ArticleDto
import com.sdk.cleanappwithcompose.domain.model.Article

fun List<ArticleDto>.toDomain(): List<Article> {
    return map {
        Article(
            content = it.content ?: "",
            description = it.description ?: "",
            title = it.title ?: "",
            urlToImage = it.urlToImage ?: ""
        )
    }
}