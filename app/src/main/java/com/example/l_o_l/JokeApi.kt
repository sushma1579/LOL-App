package com.example.l_o_l

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Query

interface JokeApi {
    @Headers("Content-Type: application/json", "Authorization: Bearer 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")
    @POST("https://api.openai.com/v1/chat/completions")
    fun generateJoke(@Body request: JokeRequest, @Query("prompt") prompt: String): Call<JokeResponse>
}


/*
val prompt = "Tell me a joke about Dogs"
val temperature = 0.7f

val message = Message("user", prompt)
val messages = listOf(message)

val request = JokeRequest("gpt-3.5-turbo", messages, temperature)


// Prompt for button 1
val prompt1 = "Tell me a joke about dogs"

// Prompt for button 2
val prompt2 = "Tell me a joke about cats"

// Prompt for button 3
val prompt3 = "Tell me a joke about cows"

// Prompt for button 4
val prompt4 = "Tell me a joke about chickens"

// Prompt for button 5
val prompt5 = "Tell me a joke about elephants"

// Prompt for button 6
val prompt6 = "Tell me a joke about monkeys"

// Other parameters for the API request
val temperature = 0.7f
val messageRole = "user"

// Create a JokeRequest object for each button
val request1 = JokeRequest("gpt-3-turbo-003", listOf(Message(messageRole, prompt1)), temperature)
val request2 = JokeRequest("gpt-3-turbo-003", listOf(Message(messageRole, prompt2)), temperature)
val request3 = JokeRequest("gpt-3-turbo-003", listOf(Message(messageRole, prompt3)), temperature)
val request4 = JokeRequest("gpt-3-turbo-003", listOf(Message(messageRole, prompt4)), temperature)
val request5 = JokeRequest("gpt-3-turbo-003", listOf(Message(messageRole, prompt5)), temperature)
val request6 = JokeRequest("gpt-3-turbo-003", listOf(Message(messageRole, prompt6)), temperature)
*/
