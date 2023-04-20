package com.example.l_o_l

import com.google.gson.annotations.SerializedName

data class JokeRequest(
    val model: String,
    val messages: List<RequestMessage>,
    val temperature: Double
)

data class RequestMessage(
    val role: String,
    @SerializedName("content")
    val text: String
)

data class JokeResponse(
    val choices: List<ResponseChoice>
)

data class ResponseChoice(
    val message: ResponseMessage
)

data class ResponseMessage(
    val role: String,
    @SerializedName("content")
    val text: String
)

