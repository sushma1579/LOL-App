package com.example.l_o_l

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST


interface JokeApi {
        @Headers("Content-Type: application/json", "Authorization: Bearer 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")
        @POST("v1/engines/davinci-codex/completions")
        fun generateJoke(@Body request: JokeRequest): Call<JokeResponse>
    }
