package com.rhosseini.navigationsample.dialogWithNavigateBackWithResult

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.plusAssign
import com.rhosseini.navigationsample.R
import kotlinx.android.synthetic.main.activity_dialog.*

class DialogActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialog)

        val navController = findNavController(R.id.nav_host_container)

        val dialogNavigator = DialogNavigator(nav_host_container.childFragmentManager)
        navController.navigatorProvider += dialogNavigator

        val graph = navController.navInflater.inflate(R.navigation.dialog_graph)
        navController.graph = graph
    }
}
