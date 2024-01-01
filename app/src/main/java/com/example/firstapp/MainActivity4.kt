package com.example.firstapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class MainActivity4 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.user_layout1)
        var b = findViewById<Button>(R.id.button)
        b.setOnClickListener {
            var i = Intent(Intent.ACTION_DIAL)
            i.data = Uri.parse("tel:+91 9852446617")
            startActivity(i)
        }
    }
}