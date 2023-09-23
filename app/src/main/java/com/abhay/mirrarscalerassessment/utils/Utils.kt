package com.abhay.mirrarscalerassessment.utils

import android.app.AlertDialog
import android.app.ProgressDialog
import android.content.Context
import java.util.Random

object Utils {

    fun getRandomNumber(startInt: Int, endInt: Int): Int {
        val random = Random()
        return random.nextInt(endInt - startInt + 1) + startInt
    }

    fun showMessageDialog(context: Context, title: String, message: String, listener: ()-> Unit) {
        val builder = AlertDialog.Builder(context)
        builder.setTitle(title)
        builder.setMessage(message)
        builder.setPositiveButton("OK") { dialog, _ ->
            dialog.dismiss()
            listener()
        }
        val dialog = builder.create()
        dialog.show()
    }

    fun showProgressDialog(context: Context): ProgressDialog{
        val progressDialog = ProgressDialog(context)
        progressDialog.setMessage("Loading...") // Set your message
        progressDialog.setCancelable(false) // Set whether it's cancelable with the back button
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER) // Choose a style
        progressDialog.show()
        return progressDialog
    }
}