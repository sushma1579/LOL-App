package com.example.l_o_l

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class JokeModel {

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://api.openai.com")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val jokeApi = retrofit.create(JokeApi::class.java)

    fun generateJoke(prompt: String, callback: (String?) -> Unit) {
        val jokeRequest = JokeRequest(
            model = "gpt-3.5-turbo",
            messages = listOf(RequestMessage("user", prompt)),
            temperature = 0.7
        )

        val call = jokeApi.generateJoke(jokeRequest,prompt)

        call.enqueue(object : Callback<JokeResponse> {
            override fun onResponse(
                        call: Call<JokeResponse>,
                        response: Response<JokeResponse>
            ) {
                if (response.isSuccessful) {
                    val joke = response.body()?.choices?.get(0)?.message?.text
                    callback(joke)
                } else { callback(null) }
            }

            override fun onFailure(call: Call<JokeResponse>, t: Throwable) {
                callback(null)
            }
        })
    }
}

