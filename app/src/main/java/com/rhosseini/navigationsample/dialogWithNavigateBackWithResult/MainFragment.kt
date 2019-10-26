package com.rhosseini.navigationsample.dialogWithNavigateBackWithResult


import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.findNavController

import com.rhosseini.navigationsample.R

/**
 * A simple [Fragment] subclass.
 */
class MainFragment : Fragment() {

    companion object {
        private const val DIALOG_REQUEST_CODE = 1
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        view?.findViewById<Button>(R.id.btnDialogWithResult)?.setOnClickListener { view ->
            val action = SimpleDialogDirections.actionGlobalSimpleDialog(
                "my title",
                "my message",
                "ok",
                "no",
                DIALOG_REQUEST_CODE
            )

            view.findNavController().navigate(action)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (DIALOG_REQUEST_CODE == requestCode && DialogInterface.BUTTON_POSITIVE == resultCode) {
            Toast.makeText(activity, "=Ok", Toast.LENGTH_SHORT).show()
        }

        if (DIALOG_REQUEST_CODE == requestCode && DialogInterface.BUTTON_NEGATIVE == resultCode) {
            Toast.makeText(activity, "=No", Toast.LENGTH_SHORT).show()
        }
    }

}
