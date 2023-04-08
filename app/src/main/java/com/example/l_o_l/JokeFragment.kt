package com.example.l_o_l

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.fragment.findNavController

class JokeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_joke, container, false)
        val jokeTextView: TextView = view.findViewById(R.id.scrollable_textview)
        val jokeText = arguments?.getString("joke_text")
        jokeTextView.text = jokeText

        val moreButton = view.findViewById<Button>(R.id.more_button)

        moreButton.setOnClickListener {
            Toast.makeText(requireContext(), "More button clicked", Toast.LENGTH_SHORT).show()
            findNavController().navigate(R.id.action_jokeFragment_to_buttonFragment)
        }

        val rateButton = view.findViewById<Button>(R.id.rate_button)

        // Set click listener for the "Rate" button
        rateButton.setOnClickListener {
            Toast.makeText(requireContext(), "Let's Rate the joke", Toast.LENGTH_SHORT).show()
            // Navigate to RateFragment
            findNavController().navigate(R.id.action_jokeFragment_to_rateFragment)
        }
        return view
    }


    companion object {
        fun newInstance(joke: String): JokeFragment {
            val fragment = JokeFragment()
            val args = Bundle()
            args.putString("joke", joke)
            fragment.arguments = args
            return fragment
        }
    }

}
