package com.sdk.cleanappwithcompose.domain.use_case

import com.sdk.cleanappwithcompose.domain.model.Article
import com.sdk.cleanappwithcompose.domain.repository.NewsArticleRepository
import com.sdk.cleanappwithcompose.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetNewsArticleUseCase @Inject constructor(private val newsArticleRepository: NewsArticleRepository) {
    operator fun invoke(): Flow<Resource<List<Article>>> = flow {
        emit(Resource.Loading())
        try {
            emit(Resource.Success(newsArticleRepository.getNewsArticle()))
        } catch (e: Exception) {
            emit(Resource.Error(e.stackTraceToString()))
        }
    }
}