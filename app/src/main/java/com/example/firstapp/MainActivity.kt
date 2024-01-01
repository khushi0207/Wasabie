package com.example.firstapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.cardview.widget.CardView
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.drawerlayout.widget.DrawerLayout
import com.example.firstapp.ui.theme.FirstAppTheme
import com.google.android.material.navigation.NavigationView

class MainActivity : ComponentActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
        setContentView(R.layout.activity1)

            var app = findViewById<TextView>(R.id.appname)
            var rate = findViewById<CardView>(R.id.rate)
            var account = findViewById<CardView>(R.id.account)
            var tech = findViewById<CardView>(R.id.tech)
            var complain = findViewById<CardView>(R.id.complain)

            rate.setOnClickListener {
                var i = Intent(applicationContext,rate_us::class.java)
                startActivity(i)
            }
            account.setOnClickListener {
                var i = Intent(applicationContext,ActivityAccount::class.java)
                startActivity(i)
            }

            tech.setOnClickListener {
                var i = Intent(applicationContext,MainActivity3::class.java)
                startActivity(i)
            }

            complain.setOnClickListener {
                var i = Intent(applicationContext,MainActivity2::class.java)
                startActivity(i)
            }

        }
    }
}
