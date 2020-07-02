package com.example.a1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe(view: View) {
        // val myToast = Toast.makeText(this, message, duration);
        val myToast = Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun countMe(view: View) {}
}

fun countMe (view: View) {
    var count: Int
    try {
        // Get the value of the text view.
        val countString = textView.text.toString()
        // Convert value to a number and increment it
        count = Integer.parseInt(countString)
    }
    catch(e: Exception)
    {
        count = 0
    }
    count++
    // Display the new value in the text view.
    textView.text = count.toString()
}