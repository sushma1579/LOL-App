package com.example.l_o_l

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Query

interface JokeApi {
    @Headers("Content-Type: application/json", "Authorization: Bearer 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")
    @POST("chat/completions")
    fun generateJoke(@Body request: JokeRequest, @Query("prompt") prompt: String): Call<JokeResponse>
}
