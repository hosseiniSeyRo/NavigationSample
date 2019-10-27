package com.rhosseini.navigationsample.dialogWithCallback

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.plusAssign
import com.rhosseini.navigationsample.R
import kotlinx.android.synthetic.main.activity_dialog.*

class DialogWithCallbackActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialog_with_callback)
    }
}
