package com.rhosseini.navigationsample.splashScreen

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController

import com.rhosseini.navigationsample.R

/**
 * A simple [Fragment] subclass.
 */
class SplashScreenFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_splash_screen, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Handler().postDelayed({
            findNavController().navigate(R.id.action_splashScreen_to_home, null,
                NavOptions.Builder()
                    .setPopUpTo(R.id.splashScreenFragment,
                        true).build())
        },4000)
    }
}
