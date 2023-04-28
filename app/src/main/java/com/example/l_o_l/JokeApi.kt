package com.example.l_o_l

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Query

interface JokeApi {
    // change the API Key if the app is failing to generate jokes ,API Key might be disabled
    @Headers("Content-Type: application/json",
             "Authorization: Bearer " + BuildConfig.API_KEY)
    @POST("chat/completions")
    fun generateJoke(@Body request: JokeRequest, @Query("prompt") prompt: String): Call<JokeResponse>
}
