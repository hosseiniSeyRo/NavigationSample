package com.rhosseini.navigationsample.multiNavHost.listScreen


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

import com.rhosseini.navigationsample.R

/**
 * A simple [Fragment] subclass.
 */
class List1 : ListMenuFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_list1, container, false)

        view.findViewById<Button>(R.id.nextPage).setOnClickListener {
            findNavController().navigate(R.id.action_list1_to_list2)
        }

        return view
    }
}
