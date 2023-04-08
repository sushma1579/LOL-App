package com.example.l_o_l

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class ButtonFragment : Fragment() {

    private lateinit var model: JokeModel
    private lateinit var school_button: Button
    private lateinit var dog_button: Button
    private lateinit var vegetable_button: Button
    private lateinit var dessert_button: Button
    private lateinit var hippo_button: Button
    private lateinit var random_button: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_button, container, false)

        school_button = view.findViewById(R.id.school_button)
        dog_button = view.findViewById(R.id.dogs_button)
        vegetable_button = view.findViewById(R.id.vegetable_button)
        dessert_button = view.findViewById(R.id.dessert_button)
        hippo_button = view.findViewById(R.id.hippo_button)
        random_button = view.findViewById(R.id.random_button)

        school_button.setOnClickListener {
            model.generateJoke("Tell me a joke on Schools", requireContext()) { joke ->
                if (joke != null) {
                    displayJoke(joke)
                }
            }
        }

        dog_button.setOnClickListener {
            model.generateJoke("Tell me a joke on Dogs", requireContext()) { joke ->
                if (joke != null) {
                    displayJoke(joke)
                }
            }
        }

        vegetable_button.setOnClickListener {
            model.generateJoke("Tell me a joke on Vegetables", requireContext()) { joke ->
                if (joke != null) {
                    displayJoke(joke)
                }
            }
        }

        dessert_button.setOnClickListener {
            model.generateJoke("Tell me a joke on Desserts", requireContext()) { joke ->
                if (joke != null) {
                    displayJoke(joke)
                }
            }
        }

        hippo_button.setOnClickListener {
            model.generateJoke("Tell me a joke on Hippos", requireContext()) { joke ->
                if (joke != null) {
                    displayJoke(joke)
                }
            }
        }

        random_button.setOnClickListener {
            model.generateJoke("Tell me a RANDOM joke", requireContext()) { joke ->
                if (joke != null) {
                    displayJoke(joke)
                }
            }
        }

        return view
    }

    private fun displayJoke(joke: String) {
        val bundle = Bundle()
        bundle.putString("joke_text", joke)
        val jokeFragment = JokeFragment()
        jokeFragment.arguments = bundle
        view?.findNavController()?.navigate(R.id.action_buttonFragment_to_jokeFragment)
    }

}

