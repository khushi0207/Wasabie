package com.example.firstapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            setContentView(R.layout.activity2)
            var no = findViewById<Button>(R.id.btnno)
            var yes = findViewById<Button>(R.id.btnyes)

            yes.setOnClickListener {
                var i = Intent(applicationContext,MainActivity3::class.java)
                startActivity(i)
            }
            no.setOnClickListener {
                var j = Intent(applicationContext,rate_us::class.java)
                startActivity(j)
            }
        }
    }
}

