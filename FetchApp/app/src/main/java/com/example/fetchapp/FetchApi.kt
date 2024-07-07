package com.example.fetchapp

import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Retrofit
import retrofit2.http.GET

interface FetchApi {
    @GET("hiring.json")
    suspend fun fetchItems(): List<Item>
}
