package com.example.firstapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.firstapp.ui.theme.FirstAppTheme

class MainActivity7 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Meenal's number saved here
            setContentView(R.layout.user_layout4)
            var b = findViewById<Button>(R.id.button)
            b.setOnClickListener {
                var i = Intent(Intent.ACTION_DIAL)
                i.data = Uri.parse("tel:+91 9136980550")
                startActivity(i)
            }

        }
    }
}
