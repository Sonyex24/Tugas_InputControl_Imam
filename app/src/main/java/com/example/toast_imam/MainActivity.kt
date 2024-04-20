package com.example.toast_imam

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btn_click_me = findViewById(R.id.btn_click_me) as Button
        btn_click_me.setOnClickListener {
            // make a toast on button click event
            Toast.makeText(this, "Hi there! This is a Toast.", Toast.LENGTH_LONG).show()
        }
        title = "KotlinApp"
        var textView = findViewById(R.id.testalert) as TextView
        textView.setOnClickListener { showAlertDialog() }
    }
    private fun showAlertDialog() {
        val alertDialog: AlertDialog.Builder = AlertDialog.Builder(this@MainActivity)
        alertDialog.setTitle("AlertDialog")
        alertDialog.setMessage("Do you wanna close this Dialog?")
        alertDialog.setPositiveButton(
            "yes"
        ) { _, _ ->
            Toast.makeText(this@MainActivity, "Alert dialog closed.", Toast.LENGTH_LONG).show()
        }
        alertDialog.setNegativeButton(
            "No"
        ) { _, _ -> }
        val alert: AlertDialog = alertDialog.create()
        alert.setCanceledOnTouchOutside(false)
        alert.show()
    }

}