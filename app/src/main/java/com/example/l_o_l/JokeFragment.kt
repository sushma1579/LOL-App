import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.l_o_l.R

class JokeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_joke, container, false)
        val jokeTextView: TextView = view.findViewById(R.id.scrollable_textview)
        val jokeText = arguments?.getString("joke_text")
        jokeTextView.text = jokeText

        val moreButton = view.findViewById<Button>(R.id.more_button)

        moreButton.setOnClickListener {
            Toast.makeText(requireContext(), "More button clicked", Toast.LENGTH_SHORT).show()
            findNavController().navigate(R.id.action_jokeFragment2_to_buttonFragment)
        }

        val rateButton = view.findViewById<Button>(R.id.rate_button)

        // Set click listener for the "Rate" button
        rateButton.setOnClickListener {
            Toast.makeText(requireContext(), "Let's Rate the joke", Toast.LENGTH_SHORT).show()
            // Navigate to RateFragment
            findNavController().navigate(R.id.action_jokeFragment2_to_rateFragment2)
        }
        return view
    }

}
