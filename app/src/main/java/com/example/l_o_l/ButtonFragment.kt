package com.example.l_o_l

import JokeFragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment

class ButtonFragment : Fragment() {

    private val jokeModel = JokeModel()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_button, container, false)
        val button1 = view.findViewById<Button>(R.id.dogs_button)
        val button2 = view.findViewById<Button>(R.id.vegetable_button)
        val button3 = view.findViewById<Button>(R.id.school_button)
        val button4 = view.findViewById<Button>(R.id.hippo_button)
        val button5 = view.findViewById<Button>(R.id.dessert_button)
        val button6 = view.findViewById<Button>(R.id.random_button)

        button1.setOnClickListener {
            generateJoke("Tell me a joke about Dogs")
        }

        button2.setOnClickListener {
            generateJoke("Tell me a joke about vegetables")
        }

        button3.setOnClickListener {
            generateJoke("Tell me a joke about schools")
        }

        button4.setOnClickListener {
            generateJoke("Tell me a joke about hippos")
        }

        button5.setOnClickListener {
            generateJoke("Tell me a joke about desserts")
        }

        button6.setOnClickListener {
            generateJoke("Tell me a random joke")
        }

        return view
    }

    private fun generateJoke(prompt: String) {
        jokeModel.generateJoke(prompt) { joke ->
            if (joke != null) {
                val bundle = Bundle()
                bundle.putString("joke", joke)
                val jokeFragment = JokeFragment()
                jokeFragment.arguments = bundle
                parentFragmentManager.beginTransaction()
                    .replace(R.id.myNavHostFragment, jokeFragment)
                    .addToBackStack(null)
                    .commit()
            } else {
                Toast.makeText(
                    requireContext(),
                    "Failed to generate joke",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }

}

