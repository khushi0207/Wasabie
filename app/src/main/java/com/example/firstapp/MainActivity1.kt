package com.example.firstapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class MainActivity1 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            setContentView(R.layout.layout)
            
            var l = findViewById<Button>(R.id.button2)
            var s = findViewById<Button>(R.id.button3)

            l.setOnClickListener {
                var i = Intent(applicationContext,login::class.java)
                startActivity(i)
            }

            s.setOnClickListener {
                var j = Intent(applicationContext,signUp::class.java)
                startActivity(j)
            }
        }
    }
}
