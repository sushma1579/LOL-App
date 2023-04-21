package com.example.l_o_l

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class JokeFragment : Fragment() {

    private lateinit var jokeTextView: TextView
    private lateinit var moreButton: Button
    private lateinit var rateButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_joke, container, false)

        jokeTextView = view.findViewById(R.id.joke_displayview)
        moreButton = view.findViewById(R.id.more_button)
        rateButton = view.findViewById(R.id.rate_button)


        // get joke text from arguments
        val joke = arguments?.getString("joke")
        if (joke != null) {
            jokeTextView.text = joke
        }

        // Set click listener for "More" Button
        moreButton.setOnClickListener {
            Toast.makeText(requireContext(), "More jokes!", Toast.LENGTH_SHORT).show()
            findNavController().navigate(R.id.action_jokeFragment2_to_buttonFragment3)
        }

        // Set click listener for the "Rate" button
        rateButton.setOnClickListener {
            Toast.makeText(requireContext(), "Let's Rate the joke", Toast.LENGTH_SHORT).show()
            // Navigate to RateFragment
            findNavController().navigate(R.id.action_jokeFragment2_to_rateFragment2)
        }
        return view
    }
}
    /*override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val joke = arguments?.getString("joke")
        if (joke != null) {
            jokeTextView.text = joke
        }

        // Set click listener for "More" Button
        moreButton.setOnClickListener {
            Toast.makeText(requireContext(), "More jokes!", Toast.LENGTH_SHORT).show()
            findNavController().navigate(R.id.action_jokeFragment2_to_buttonFragment)
        }

        // Set click listener for the "Rate" button
        rateButton.setOnClickListener {
            Toast.makeText(requireContext(), "Let's Rate the joke", Toast.LENGTH_SHORT).show()
            // Navigate to RateFragment
            findNavController().navigate(R.id.action_jokeFragment2_to_rateFragment2)
        }
    }*/




