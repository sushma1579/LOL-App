package com.example.l_o_l

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class ButtonFragment : Fragment() {
    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var button3: Button
    private lateinit var button4: Button
    private lateinit var button5: Button
    private lateinit var button6: Button

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_button, container, false)

        button1 = view.findViewById(R.id.school_button)
        button2 = view.findViewById(R.id.dogs_button)
        button3 = view.findViewById(R.id.vegetable_button)
        button4 = view.findViewById(R.id.dessert_button)
        button5 = view.findViewById(R.id.hippo_button)
        button6 = view.findViewById(R.id.random_button)

        button1.setOnClickListener {
            view.findNavController().navigate(R.id.action_buttonFragment_to_jokeFragment)
        }

        button2.setOnClickListener {
            view.findNavController().navigate(R.id.action_buttonFragment_to_jokeFragment)
        }

        button3.setOnClickListener {
            view.findNavController().navigate(R.id.action_buttonFragment_to_jokeFragment)
        }

        button4.setOnClickListener {
            view.findNavController().navigate(R.id.action_buttonFragment_to_jokeFragment)
        }

        button5.setOnClickListener {
            view.findNavController().navigate(R.id.action_buttonFragment_to_jokeFragment)
        }

        button6.setOnClickListener {
            view.findNavController().navigate(R.id.action_buttonFragment_to_jokeFragment)
        }

        return view
    }
}
