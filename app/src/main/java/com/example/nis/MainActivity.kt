package com.example.nis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonUpload= findViewById<Button>(R.id.btnUpload)
        val buttonDownload= findViewById<Button>(R.id.btnDownload)

        buttonUpload.setOnClickListener {
            Toast.makeText(applicationContext,"Uploading..",Toast.LENGTH_SHORT).show()
        }
        buttonDownload.setOnClickListener {
            Toast.makeText(applicationContext, "Downloading..", Toast.LENGTH_SHORT).show()
        }
        val buttonDark=findViewById<Button>(R.id.bthDark)
        val buttonRead=findViewById<Button>(R.id.btnRead)
        val layout= findViewById<LinearLayout>(R.id.linearlayout)

                //change to light mode
        buttonRead.setOnClickListener {
            layout.setBackgroundResource(R.color.yellow)
        }
        buttonDark.setOnClickListener {
            //change to black color
            layout.setBackgroundResource(R.color.black)
        }

        val btnIntern = findViewById<Button>(R.id.button)
        btnIntern.setOnClickListener {
            //open a new activity

            intent=Intent(applicationContext,MainActivity2::class.java)
            startActivity(intent)

        }
    }
}