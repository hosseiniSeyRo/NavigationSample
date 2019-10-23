package com.rhosseini.navigationsample.multiNavHost.homeScreen

import android.os.Bundle
import android.view.*
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.rhosseini.navigationsample.R

/**
 * Shows the main title screen with a button that navigates to [About].
 */
class WelcomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_welcome, container, false)

        setHasOptionsMenu(true)

        view.findViewById<Button>(R.id.about_btn).setOnClickListener {
            findNavController().navigate(WelcomeFragmentDirections.actionWelcomeToAbout())
        }
        return view
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.main_option, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_settings -> {
                Toast.makeText(activity, "settings", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.action_favorite -> {
                Toast.makeText(activity, "favorite", Toast.LENGTH_SHORT).show()
                return true
            }
        }

        return super.onOptionsItemSelected(item)
    }
}
