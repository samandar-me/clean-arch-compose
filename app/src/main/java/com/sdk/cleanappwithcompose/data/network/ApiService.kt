package com.sdk.cleanappwithcompose.data.network


import com.sdk.cleanappwithcompose.data.model.NewsDto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("top-headlines")
    suspend fun getNewsArticles(
        @Query("country") country: String = "us",
        @Query("apiKey") apiKey: String = "8056d2d8ec904cbeaeadf807a9e509fa"
    ): Response<NewsDto>
}