package com.rhosseini.navigationsample.dialogWithNavigateBackWithResult

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import androidx.navigation.fragment.navArgs

class SimpleDialog : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val args : SimpleDialogArgs by navArgs()

            return AlertDialog.Builder(requireActivity())
                .setTitle(args.title)
                .setMessage(args.message)
                .setPositiveButton(args.positiveBtnText) { _, which ->
                    sendResult(which)
                }
                .setNegativeButton(args.negativeBtnText) { _, which ->
                    sendResult(which)
                }
                .create()
    }

    private fun sendResult(which: Int) {
        targetFragment?.onActivityResult(targetRequestCode, which, null)
    }
}
