package natalia.example.myfirst

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import android.widget.TextView
import kotlin.random.Random


class RollFragment : Fragment() {


    lateinit var textV: TextView
    lateinit var rollButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_roll, container, false)
        textV = view.findViewById(R.id.textViewRoll)
        rollButton = view.findViewById(R.id.rollButton)

        rollButton.setOnClickListener {
            val randomValues = List(10) { Random.nextInt(0, 100) }
            textV.text = randomValues.random().toString()
        }

        return view
    }



}