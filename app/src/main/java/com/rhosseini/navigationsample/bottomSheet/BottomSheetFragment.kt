package com.rhosseini.navigationsample.bottomSheet


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.fragment.findNavController

import com.rhosseini.navigationsample.R

/**
 * A simple [Fragment] subclass.
 */
class BottomSheetFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bottom_sheet, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val myBottomSheetListener = object : MyBottomSheet.MyBottomSheetListener {
            override fun onBtnClick() {
                Toast.makeText(activity, "btn clicked", Toast.LENGTH_SHORT).show()
            }
        }

        view?.findViewById<Button>(R.id.btnShowBottomSheet)?.setOnClickListener{
            val myBottomSheet = MyBottomSheet()
            myBottomSheet.listener = myBottomSheetListener
            myBottomSheet.show(childFragmentManager, "bottomSheetTag")
        }
    }
}
