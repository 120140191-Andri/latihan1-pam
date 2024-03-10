package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var clickCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tambah = findViewById(R.id.button) as Button
        val kurang = findViewById(R.id.button2) as Button
        val tampil = findViewById(R.id.textView) as TextView

        tambah.setOnClickListener {
            clickCount += 1
            tampil.text = clickCount.toString()
        }

        kurang.setOnClickListener {
            clickCount -= 1
            tampil.text = clickCount.toString()
        }

    }
}