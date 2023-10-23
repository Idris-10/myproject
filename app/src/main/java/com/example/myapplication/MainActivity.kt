package com.example.myapplication

import android.R
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity




abstract class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val button: Button = findViewById(R.Id.button)
        button.setOnClickListener(this)

        val resultTextView: TextView = findViewById(R.Id.textView)
        resultTextView.text = "Goodbye!"

    }
        fun OnClick(v: View?) {
            TODO("not implemented")

    }
}



