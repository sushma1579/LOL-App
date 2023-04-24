package com.example.l_o_l

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

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
            Toast.makeText(requireContext(), "Button clicked", Toast.LENGTH_SHORT).show()
            generateJoke("Tell me a joke about Dogs")
        }

        button2.setOnClickListener {
            Toast.makeText(requireContext(), "Button clicked", Toast.LENGTH_SHORT).show()
            generateJoke("Tell me a joke about vegetables")
        }

        button3.setOnClickListener {
            Toast.makeText(requireContext(), "Button clicked", Toast.LENGTH_SHORT).show()
            generateJoke("Tell me a joke about schools")
        }

        button4.setOnClickListener {
            Toast.makeText(requireContext(), "Button clicked", Toast.LENGTH_SHORT).show()
            generateJoke("Tell me a joke about hippos")
        }

        button5.setOnClickListener {
            Toast.makeText(requireContext(), "Button clicked", Toast.LENGTH_SHORT).show()
            generateJoke("Tell me a joke about desserts")
        }

        button6.setOnClickListener {
            Toast.makeText(requireContext(), "Button clicked", Toast.LENGTH_SHORT).show()
            generateJoke("Tell me a random joke")
        }

        return view
    }

    private fun generateJoke(prompt: String) {
        jokeModel.generateJoke(prompt) { joke ->
            if (joke != null) {
                Log.e("isJokeAvailable",joke.toString())
                val bundle = Bundle()
                bundle.putString("joke", joke)
                findNavController().navigate(R.id.action_buttonFragment_to_jokeFragment, bundle)
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



