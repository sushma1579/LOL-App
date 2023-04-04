package com.example.l_o_l

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.findNavController

class ButtonFragment : Fragment() {
    private lateinit var school_button: Button
    private lateinit var dog_button: Button
    private lateinit var vegetable_button: Button
    private lateinit var dessert_button: Button
    private lateinit var hippo_button: Button
    private lateinit var random_button: Button

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_button, container, false)

        school_button = view.findViewById(R.id.school_button)
        dog_button = view.findViewById(R.id.dogs_button)
        vegetable_button = view.findViewById(R.id.vegetable_button)
        dessert_button = view.findViewById(R.id.dessert_button)
        hippo_button = view.findViewById(R.id.hippo_button)
        random_button = view.findViewById(R.id.random_button)

        school_button.setOnClickListener {
            Toast.makeText(requireContext(), "button clicked", Toast.LENGTH_SHORT).show()
            view.findNavController().navigate(R.id.action_buttonFragment_to_jokeFragment)
        }

        dog_button.setOnClickListener {
            Toast.makeText(requireContext(), "button clicked", Toast.LENGTH_SHORT).show()
            view.findNavController().navigate(R.id.action_buttonFragment_to_jokeFragment)
        }

        vegetable_button.setOnClickListener {
            Toast.makeText(requireContext(), "button clicked", Toast.LENGTH_SHORT).show()
            view.findNavController().navigate(R.id.action_buttonFragment_to_jokeFragment)
        }

        dessert_button.setOnClickListener {
            Toast.makeText(requireContext(), "button clicked", Toast.LENGTH_SHORT).show()
            view.findNavController().navigate(R.id.action_buttonFragment_to_jokeFragment)
        }

        hippo_button.setOnClickListener {
            Toast.makeText(requireContext(), "button clicked", Toast.LENGTH_SHORT).show()
            view.findNavController().navigate(R.id.action_buttonFragment_to_jokeFragment)
        }

        random_button.setOnClickListener {
            Toast.makeText(requireContext(), "button clicked", Toast.LENGTH_SHORT).show()
            view.findNavController().navigate(R.id.action_buttonFragment_to_jokeFragment)
        }

        return view
    }
}
