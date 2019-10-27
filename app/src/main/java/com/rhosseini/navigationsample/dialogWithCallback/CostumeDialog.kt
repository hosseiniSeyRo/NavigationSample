package com.rhosseini.navigationsample.dialogWithCallback

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.DialogFragment
import androidx.navigation.fragment.navArgs
import com.rhosseini.navigationsample.R
import java.io.Serializable

class CostumeDialog : DialogFragment() {

    var icon: Int = R.drawable.ic_bookmark
    var title: String? = "default Title in dialog"
    var message: String? = null
    var positiveBtnText: String? = null
    var negativeBtnText: String? = null
    var neutralBtnText: String? = null
    var listener: MyOnBtnClickListener? = null

    // This is my interface
    interface MyOnBtnClickListener : Serializable {
        fun onPositiveButtonClick()
        fun onNegativeButtonClick()
        fun onNeutralButtonClick()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        getArgs()

        val view = inflater.inflate(R.layout.costume_dialog, container, false)
        (view.findViewById(R.id.icon) as ImageView).setImageResource(icon)
        title = (title)
        (view.findViewById(R.id.myTitle) as TextView).text = title
        (view.findViewById(R.id.myDescription) as TextView).text = message
        (view.findViewById(R.id.btnPositive) as Button).text = positiveBtnText
        (view.findViewById(R.id.btnNegative) as Button).text = negativeBtnText
        (view.findViewById(R.id.btnNeutral) as Button).text = neutralBtnText

        if (positiveBtnText != null) {
            (view.findViewById(R.id.btnPositive) as Button).setOnClickListener {
                listener?.onPositiveButtonClick()
                dialog?.dismiss()
            }
        } else {
            (view.findViewById(R.id.btnPositive) as Button).visibility = View.GONE
        }

        if (negativeBtnText != null) {
            (view.findViewById(R.id.btnNegative) as Button).setOnClickListener {
                listener?.onNegativeButtonClick()
                dialog?.dismiss()
            }
        } else {
            (view.findViewById(R.id.btnNegative) as Button).visibility = View.GONE
        }

        if (neutralBtnText != null) {
            (view.findViewById(R.id.btnNeutral) as Button).setOnClickListener {
                listener?.onNeutralButtonClick()
                dialog?.dismiss()
            }
        } else {
            (view.findViewById(R.id.btnNeutral) as Button).visibility = View.GONE
        }

        return view
    }

    private fun getArgs() {
        val args: CostumeDialogArgs by navArgs()

        icon = args.icon
        if (args.title != null) title = args.title
        message = args.message
        positiveBtnText = args.positiveBtnText
        negativeBtnText = args.negativeBtnText
        neutralBtnText = args.neutralBtnText
        listener = args.listener
    }
}