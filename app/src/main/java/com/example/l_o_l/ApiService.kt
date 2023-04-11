package com.example.l_o_l

import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.POST

interface ApiService {
    @POST("engines/davinci/completions")
    @Headers("Content-Type: application/json")
    fun generateJoke(
        @Body requestBody: RequestBody,
        @Header("Authorization") apiKey: String
    ): Call<JokeResponse>
}
