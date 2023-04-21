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

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_rate, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<ImageView>(R.id.quality_zero_image).setOnClickListener {
            Toast.makeText(requireContext(), "Terrible joke, rated 0", Toast.LENGTH_SHORT).show()
            // Handle click on quality_zero_image
            findNavController().navigate(R.id.action_rateFragment2_to_buttonFragment3)
        }

        view.findViewById<ImageView>(R.id.quality_one_image).setOnClickListener {
            Toast.makeText(requireContext(), "Not so good joke, rated 1", Toast.LENGTH_SHORT).show()
            // Handle click on quality_one_image
            findNavController().navigate(R.id.action_rateFragment2_to_buttonFragment3)
        }

        view.findViewById<ImageView>(R.id.quality_two_image).setOnClickListener {
            Toast.makeText(requireContext(), "Okay joke, rated 2", Toast.LENGTH_SHORT).show()
            // Handle click on quality_two_image
            findNavController().navigate(R.id.action_rateFragment2_to_buttonFragment3)
        }

        view.findViewById<ImageView>(R.id.quality_three_image).setOnClickListener {
            Toast.makeText(requireContext(), "Good joke, rated 3", Toast.LENGTH_SHORT).show()
            // Handle click on quality_three_image
            findNavController().navigate(R.id.action_rateFragment2_to_buttonFragment3)
        }

        view.findViewById<ImageView>(R.id.quality_four_image).setOnClickListener {
            Toast.makeText(requireContext(), "Great joke, rated 4", Toast.LENGTH_SHORT).show()
            // Handle click on quality_three_image
            findNavController().navigate(R.id.action_rateFragment2_to_buttonFragment3)
        }
        view.findViewById<ImageView>(R.id.quality_five_image).setOnClickListener {
            Toast.makeText(requireContext(), "Hilarious joke, rated 5", Toast.LENGTH_SHORT).show()
            // Handle click on quality_three_image
            findNavController().navigate(R.id.action_rateFragment2_to_buttonFragment3)
        }
        }
    }