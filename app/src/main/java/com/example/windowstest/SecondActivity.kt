package com.example.windowstest

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var user = "ЖЫвотное"
        var gift = "дырку от бублика"


        user = intent.getStringExtra("username").toString()
        gift = intent.getStringExtra("gift").toString()

        var textView_second_output: TextView = findViewById(R.id.textView_second_output)

        textView_second_output.text = user + " , вам передали " + gift
    }
}