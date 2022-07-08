package com.sdk.cleanappwithcompose.presentation

import com.sdk.cleanappwithcompose.domain.model.Article

data class HomeStateHolder(
    val isLoading: Boolean = false,
    val data: List<Article>? = null,
    val error: String = ""
)