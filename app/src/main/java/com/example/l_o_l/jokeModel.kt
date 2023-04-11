import com.example.l_o_l.JokeApi
import com.example.l_o_l.JokeRequest
import com.example.l_o_l.JokeResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class JokeModel {

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://api.openai.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val api = retrofit.create(JokeApi::class.java)

    fun generateJoke(prompt: String, callback: (String?) -> Unit) {
        val request = JokeRequest(prompt)
        val call = api.generateJoke(request)
        call.enqueue(object : Callback<JokeResponse> {
            override fun onResponse(call: Call<JokeResponse>, response: Response<JokeResponse>) {
                if (response.isSuccessful) {
                    val joke = response.body()?.choices?.get(0)?.text
                    callback(joke)
                } else {
                    callback(null)
                }
            }

            override fun onFailure(call: Call<JokeResponse>, t: Throwable) {
                callback(null)
            }
        })
    }
}
