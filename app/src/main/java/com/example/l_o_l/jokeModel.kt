package com.example.l_o_l

import android.content.Context
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import org.json.JSONObject

class JokeModel {
    private val API_URL = "https://api.openai.com/v1/engines/davinci-codex/completions"
    private val API_KEY = "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"

    fun generateJoke(prompt: String, context: Context, callback: (String?) -> Unit) {
        val queue = Volley.newRequestQueue(context)
        val request = object : StringRequest(
            Method.POST, API_URL,


            Response.Listener { response ->
                val joke = parseResponse(response)
                callback(joke)
            },
            Response.ErrorListener {
                callback(null)
            }) {
            override fun getHeaders(): MutableMap<String, String> {
                val headers = HashMap<String, String>()
                headers["Content-Type"] = "application/json"
                headers["Authorization"] = "Bearer $API_KEY"
                return headers
            }

            override fun getBody(): ByteArray {
                return """
                {
                    "prompt": "$prompt",
                    "temperature": 0.5,
                    "max_tokens": 50,
                    "stop": "\n"
                }
            """.trimIndent().toByteArray()
            }
        }
        queue.add(request)
    }


    private fun parseResponse(response: String): String? {
        // Parse the JSON response to extract the generated joke text
        // Here's an example implementation that extracts the first generated text
        val jsonArray = JSONObject(response).getJSONArray("choices")
        if (jsonArray.length() > 0) {
            val jsonObject = jsonArray.getJSONObject(0)
            return jsonObject.getString("text")
        }
        return null
    }
}
