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
