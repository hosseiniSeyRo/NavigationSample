package com.rhosseini.navigationsample.dialogWithCallback


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.findNavController

import com.rhosseini.navigationsample.R
import com.rhosseini.navigationsample.dialogWithNavigateBackWithResult.MainFragment
import com.rhosseini.navigationsample.dialogWithNavigateBackWithResult.SimpleDialogDirections

/**
 * A simple [Fragment] subclass.
 */
class DialogWithCallbackFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dialog_with_callback, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val myListener = object : CostumeDialog.MyOnBtnClickListener {
            override fun onPositiveButtonClick() {
                Toast.makeText(activity, "yes", Toast.LENGTH_SHORT).show()
            }

            override fun onNegativeButtonClick() {
                Toast.makeText(activity, "no", Toast.LENGTH_SHORT).show()
            }

            override fun onNeutralButtonClick() {
                Toast.makeText(activity, "cancel", Toast.LENGTH_SHORT).show()
            }
        }

        view?.findViewById<Button>(R.id.btnShowDialog)?.setOnClickListener { view ->
            val action = CostumeDialogDirections.actionGlobalCostumeDialog(
                R.drawable.ic_home,
                "my title",
                "my message",
                "ok",
                "no",
                "cancel",
                myListener
            )

            view.findNavController().navigate(action)
        }
    }
}
