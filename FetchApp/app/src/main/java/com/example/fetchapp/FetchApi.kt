package com.example.fetchapp

import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Retrofit
import retrofit2.http.GET

// Interface for the API endpoint
interface FetchApi {
    @GET("hiring.json")
    suspend fun fetchItems(): List<Item>    // Function to fetch the list of items
}
