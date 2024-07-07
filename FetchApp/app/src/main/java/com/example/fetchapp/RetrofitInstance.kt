package com.example.fetchapp

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

// Object to create a singleton instance of Retrofit
object RetrofitInstance {
    private const val BASE_URL = "https://fetch-hiring.s3.amazonaws.com/"

    val api: FetchApi by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()) // Gson converter for JSON parsing
            .build()
            .create(FetchApi::class.java)       // Create the FetchApi implementation
    }
}