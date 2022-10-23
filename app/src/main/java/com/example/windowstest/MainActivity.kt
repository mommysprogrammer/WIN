package com.example.windowstest

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    companion object {
        const val REQUEST_CHOOSE_THIEF = 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var buttonChoose: Button = findViewById(R.id.button_choose)

        buttonChoose.setOnClickListener {
            val questionIntent = Intent(
                this@MainActivity,
                SecondActivity::class.java
            )
            startActivityForResult(questionIntent, REQUEST_CHOOSE_THIEF)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        var textview_info: TextView = findViewById(R.id.textview_label)

        if (resultCode == Activity.RESULT_OK) {
            when (requestCode) {
                REQUEST_CHOOSE_THIEF -> {
                    val thiefName = data?.getStringExtra(THIEF)
                    textview_info.text = thiefName.toString()
                }
            }
        } else {
            textview_info.text = "" // стираем текст
        }
    }
}
