package com.example.l_o_l

data class JokeRequest(
    val prompt: String,
    val temperature: Double = 0.5,
    val max_tokens: Int = 50,
    val stop: String = "\n"
)

data class JokeResponse(
    val choices: List<Choice>
)

data class Choice(
    val text: String
)
