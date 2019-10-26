package com.rhosseini.navigationsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.rhosseini.navigationsample.animationInNavigation.AnimationInNavigationActivity
import com.rhosseini.navigationsample.dialogWithNavigateBackWithResult.DialogActivity
import com.rhosseini.navigationsample.databinding.ActivityMainBinding
import com.rhosseini.navigationsample.multiNavHost.MultiNavHostActivity
import com.rhosseini.navigationsample.sharedAnimation.SharedAnimationActivity
import com.rhosseini.navigationsample.simpleNavigation.SimpleNavigationActivity
import com.rhosseini.navigationsample.splashScreen.SplashScreenActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.lifecycleOwner = this

        binding.handler = this
    }

    fun btnClickHandler(view: View) {
        when (view) {
            binding.btnSimpleNavigation -> startActivity(
                Intent(
                    this, SimpleNavigationActivity::class.java
                )
            )
            binding.btnMultiNavHost -> startActivity(Intent(this, MultiNavHostActivity::class.java))
            binding.btnSplashScreen -> startActivity(Intent(this, SplashScreenActivity::class.java))
            binding.btnAnimationInNavigation -> startActivity(
                Intent(this, AnimationInNavigationActivity::class.java)
            )
            binding.btnSharedAnimation -> startActivity(
                Intent(this, SharedAnimationActivity::class.java)
            )
            binding.btnDialogWithResult -> startActivity(
                Intent(this, DialogActivity::class.java)
            )
        }

    }
}
