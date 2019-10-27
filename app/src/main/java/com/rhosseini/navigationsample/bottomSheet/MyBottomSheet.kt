package com.rhosseini.navigationsample.bottomSheet


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

import com.rhosseini.navigationsample.R

/**
 * A simple [Fragment] subclass.
 */
class MyBottomSheet : BottomSheetDialogFragment() {

    var listener: MyBottomSheetListener? = null

    interface MyBottomSheetListener {
        fun onBtnClick()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.my_bottom_sheet, container, false)

        view?.findViewById<Button>(R.id.button)?.setOnClickListener {
            listener?.onBtnClick()
            dismiss()
        }

        return view
    }

}
