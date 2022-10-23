package com.example.windowstest

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    private lateinit var editText: EditText
    private lateinit var helloTextView: TextView

    @RequiresApi(Build.VERSION_CODES.M)
    @SuppressLint("SetTextI18n", "ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {

        var counter = 0

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        helloTextView = findViewById(R.id.textView)
        editText = findViewById(R.id.editText)
        val imageButton: ImageButton = findViewById(R.id.imageButton)

        imageButton.setOnClickListener {
            if (editText.text.isEmpty()) {
                helloTextView.text = "Hello Kitty!"
            } else {
                helloTextView.text = "Привет, " + editText.text
            }
        }

        val textView: TextView = findViewById(R.id.textSayHelloKitty)

        val buttonSayHello: Button = findViewById(R.id.buttonSayHello)
        buttonSayHello.setOnClickListener {
            textView.text = "Hello Kitty!"
            it.setBackgroundColor(Color.GRAY)
        }

        val buttonCounter: Button = findViewById(R.id.buttonCounter)
        buttonCounter.setOnClickListener {
            textView.text = "Я насчитал ${++counter} ворон"
            it.setBackgroundColor(Color.DKGRAY)
        }

        val rootLayout: ConstraintLayout = findViewById(R.id.root_layout)
        val buttonChangeBackground: Button = findViewById(R.id.changeBackground)
        buttonChangeBackground.setOnClickListener {
            rootLayout.setBackgroundColor(resources.getColor(R.color.greenColor, null))
        }
    }
}
