package com.rhosseini.navigationsample.simpleNavigation


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import androidx.navigation.fragment.findNavController

import com.rhosseini.navigationsample.R

class QuestionFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_question, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        val navController = Navigation.findNavController(view)
        val navController = findNavController()

        val gameOverListener: (View) -> Unit = {
            navController.navigate(QuestionFragmentDirections.actionGameOver())
        }

        view.findViewById<View>(R.id.rb1).setOnClickListener(gameOverListener)
        view.findViewById<View>(R.id.rb2).setOnClickListener(gameOverListener)
        view.findViewById<View>(R.id.rb4).setOnClickListener(gameOverListener)

        val rb3 = view.findViewById<RadioButton>(R.id.rb3)
        rb3.setOnClickListener {
//            val bundle = Bundle().also { it.putString("answer", rb3.text.toString()) }
//            navController.navigate(R.id.actionWinn, bundle)
            navController.navigate(QuestionFragmentDirections.actionWinn().setAnswer(rb3.text.toString()))
        }
    }

}
