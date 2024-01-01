package com.example.firstapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class MainActivity3 : ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            setContentView(R.layout.activity3)
            var b1 = findViewById<Button>(R.id.button1)
            var b2= findViewById<Button>(R.id.button2)
            var b3 = findViewById<Button>(R.id.button3)
            var b4 = findViewById<Button>(R.id.button4)
            var b5 = findViewById<Button>(R.id.button5)
            var b6 = findViewById<Button>(R.id.button6)
            var b7 = findViewById<Button>(R.id.button7)
            var b8 = findViewById<Button>(R.id.button8)
            var b9 = findViewById<Button>(R.id.button9)
            var b10 = findViewById<Button>(R.id.button10)
            var b11 = findViewById<Button>(R.id.button11)

            b1.setOnClickListener {
                var i = Intent(applicationContext,MainActivity4::class.java)
                startActivity(i)
            }

            b2.setOnClickListener {
                var i = Intent(applicationContext,MainActivity5::class.java)
                startActivity(i)
            }
            b3.setOnClickListener {
                var i = Intent(applicationContext,MainActivity6::class.java)
                startActivity(i)
            }
            b4.setOnClickListener {
                var i = Intent(applicationContext,MainActivity7::class.java)
                startActivity(i)
            }
            b5.setOnClickListener {
                var i = Intent(applicationContext,MainActivity8::class.java)
                startActivity(i)
            }
            b6.setOnClickListener {
                var i = Intent(applicationContext,MainActivity9::class.java)
                startActivity(i)
            }
            b7.setOnClickListener {
                var i = Intent(applicationContext,MainActivity10::class.java)
                startActivity(i)
            }
            b8.setOnClickListener {
                var i = Intent(applicationContext,MainActivity11::class.java)
                startActivity(i)
            }
            b9.setOnClickListener {
                var i = Intent(applicationContext,MainActivity12::class.java)
                startActivity(i)
            }
            b10.setOnClickListener {
                var i = Intent(applicationContext,MainActivity13::class.java)
                startActivity(i)
            }
            b11.setOnClickListener {
                var i = Intent(applicationContext,MainActivity14::class.java)
                startActivity(i)
            }




        }
    }
}
