package com.example.l_o_l

import retrofit2.Call
import retrofit2.http.*

interface ApiService {
    @POST("/engines/gpt-3-turbo-003/completions")
    @Headers("Content-Type: application/json")
    fun generateJoke(
        @Body requestBody: JokeRequest,
        @Header("Authorization") apiKey: String,
        @Query("prompt") prompt: String
    ): Call<JokeResponse>
}