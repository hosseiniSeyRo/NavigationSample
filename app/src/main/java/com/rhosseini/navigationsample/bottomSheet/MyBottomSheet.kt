package com.rhosseini.navigationsample.bottomSheet


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.navArgs
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

import com.rhosseini.navigationsample.R
import java.io.Serializable

/**
 * A simple [Fragment] subclass.
 */
class MyBottomSheet : BottomSheetDialogFragment() {

    var listener: MyBottomSheetListener? = null

    interface MyBottomSheetListener: Serializable {
        fun onBtnClick()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.my_bottom_sheet, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val args : MyBottomSheetArgs by navArgs()

        view?.findViewById<TextView>(R.id.tvTitle)?.text = args.title
        view?.findViewById<TextView>(R.id.tvDescription)?.text = args.description

        listener = args.bottomSheetListener
        view?.findViewById<Button>(R.id.button)?.setOnClickListener {
            listener?.onBtnClick()
            dismiss()
        }
    }
}
