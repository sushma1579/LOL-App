package com.example.l_o_l

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class RateFragment : Fragment() {

    private lateinit var jokeQuality0: ImageView
    private lateinit var jokeQuality1: ImageView
    private lateinit var jokeQuality2: ImageView
    private lateinit var jokeQuality3: ImageView
    private lateinit var jokeQuality4: ImageView
    private lateinit var jokeQuality5: ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_rate, container, false)

        // local variables for each joke quality ImageView
        jokeQuality0 = view.findViewById(R.id.rate_zero_image)
        jokeQuality1 = view.findViewById(R.id.rate_one_image)
        jokeQuality2 = view.findViewById(R.id.rate_two_image)
        jokeQuality3 = view.findViewById(R.id.rate_three_image)
        jokeQuality4 = view.findViewById(R.id.rate_four_image)
        jokeQuality5 = view.findViewById(R.id.rate_five_image)

        // set onClickListeners for all Image views
        jokeQuality0.setOnClickListener {
            Toast.makeText(requireContext(), "Terrible joke, rated 0", Toast.LENGTH_SHORT).show()
            // Handle click on rate_zero_image
            findNavController().navigate(R.id.action_rateFragment_to_buttonFragment)
        }

        jokeQuality1.setOnClickListener {
            Toast.makeText(requireContext(), "Bad joke, rated 1", Toast.LENGTH_SHORT).show()
            // Handle click on rate_one_image
            findNavController().navigate(R.id.action_rateFragment_to_buttonFragment)
        }

        jokeQuality2.setOnClickListener {
            Toast.makeText(requireContext(), "Not so good joke, rated 2", Toast.LENGTH_SHORT).show()
            // Handle click on rate_two_image
            findNavController().navigate(R.id.action_rateFragment_to_buttonFragment)
        }

        jokeQuality3.setOnClickListener {
            Toast.makeText(requireContext(), "Good joke, rated 3", Toast.LENGTH_SHORT).show()
            // Handle click on rate_three_image
            findNavController().navigate(R.id.action_rateFragment_to_buttonFragment)
        }

        jokeQuality4.setOnClickListener {
            Toast.makeText(requireContext(), "Great joke, rated 4", Toast.LENGTH_SHORT).show()
            // Handle click on rate_four_image
            findNavController().navigate(R.id.action_rateFragment_to_buttonFragment)
        }
        jokeQuality5.setOnClickListener {
            Toast.makeText(requireContext(), "Hilarious joke, rated 5", Toast.LENGTH_SHORT).show()
            // Handle click on rate_five_image
            findNavController().navigate(R.id.action_rateFragment_to_buttonFragment)
        }
        return view
    }
    }