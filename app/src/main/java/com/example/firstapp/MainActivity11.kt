package com.example.firstapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class MainActivity11 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.user_layout8)
        var b = findViewById<Button>(R.id.button)
        b.setOnClickListener {
            var i = Intent(Intent.ACTION_DIAL)
            i.data = Uri.parse("tel:+91 8585697230")
            startActivity(i)
        }
    }
}