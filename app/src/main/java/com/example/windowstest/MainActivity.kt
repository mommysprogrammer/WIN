package com.example.windowstest

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var buttonAbout: Button = findViewById(R.id.button_About)
        var buttonSendData: Button = findViewById(R.id.button_sendData)
        var inputName: EditText = findViewById(R.id.textInput_name)
        var inputDescription: EditText = findViewById(R.id.textInput_description)

        buttonAbout.setOnClickListener {
            val intent = Intent(this@MainActivity, AboutActivity::class.java)
            startActivity(intent)
        }

        buttonSendData.setOnClickListener {
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            // в ключ username кладём текст из первого текстового поля
            intent.putExtra("username", inputName.text.toString())
            // в ключ gift кладём текст из второго текстового поля
            intent.putExtra("gift", inputDescription.text.toString())
            startActivity(intent)
        }
    }
}
