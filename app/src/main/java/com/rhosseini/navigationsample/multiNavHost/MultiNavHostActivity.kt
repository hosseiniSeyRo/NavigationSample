package com.rhosseini.navigationsample.multiNavHost

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.rhosseini.navigationsample.R

class MultiNavHostActivity : AppCompatActivity() {

    lateinit var controller: Unit

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multi_nav_host)
        if (savedInstanceState == null) {
            setupBottomNavigationBar()
        }
    }

    /**
     * Called on first creation and when restoring state.
     */
    private fun setupBottomNavigationBar() {
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_nav)

        // Setup the bottom navigation view with a list of navigation graphs
        controller = NavigationUI.setupWithNavController(bottomNavigationView,
            Navigation.findNavController(this, R.id.nav_host_container))
    }
}
