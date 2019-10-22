package com.rhosseini.navigationsample.simpleNavigation


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.navArgs

import com.rhosseini.navigationsample.R

class WinnFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_winn, container, false)

//        arguments?.let {
//            val passedArguments = WinnFragmentArgs.fromBundle(it)
//            view.findViewById<TextView>(R.id.tvAnswer).text = passedArguments.answer
//        }
        val safeArgs: WinnFragmentArgs by navArgs()
        view.findViewById<TextView>(R.id.tvAnswer)?.text = safeArgs.answer

        return view
    }


}
