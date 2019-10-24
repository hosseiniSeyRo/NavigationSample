package com.rhosseini.navigationsample.animationInNavigation


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

import androidx.navigation.NavOptions
import com.rhosseini.navigationsample.R


/**
 * A simple [Fragment] subclass.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        view.findViewById<Button>(R.id.nextPage).setOnClickListener {
            findNavController().navigate(FirstFragmentDirections.actionFirstToSecond(), getNavOptions())
        }

        return view
    }

    private fun getNavOptions(): NavOptions {
        return NavOptions.Builder()
            .setEnterAnim(R.anim.fragment_fade_enter)
            .setExitAnim(R.anim.fragment_fade_exit)
            .setPopEnterAnim(R.anim.fragment_open_enter)
            .setPopExitAnim(R.anim.fragment_open_exit)
            .build()
    }

}
