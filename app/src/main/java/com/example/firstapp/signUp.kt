package com.example.firstapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.widget.Button
import android.content.Intent
import android.widget.EditText
import android.widget.Toast
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
import com.google.firebase.auth.FirebaseAuth

class signUp : ComponentActivity() {
    private lateinit var Auth: FirebaseAuth
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            setContentView(R.layout.signup)

            Auth = FirebaseAuth.getInstance()

            var name = findViewById<EditText>(R.id.name)
            var email = findViewById<EditText>(R.id.email)
            var pwd = findViewById<EditText>(R.id.pwd)
            var register = findViewById<Button>(R.id.register)
            var login = findViewById<Button>(R.id.login)

            register.setOnClickListener {
                var name = name.text.toString()
                var email = email.text.toString()
                var pwd = pwd.text.toString()

                signUp(name,email,pwd)
            }

            login.setOnClickListener {
                var i = Intent(this@signUp,login::class.java)
                startActivity(i)
            }
        }
    }
    private fun signUp(name:String,email:String,pwd:String){
        // for all signup that is registration
        Auth.createUserWithEmailAndPassword(email,pwd)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    var intent = Intent(applicationContext,MainActivity::class.java)
                    startActivity(intent)
                } else {
                Toast.makeText(applicationContext,"may already exists.",Toast.LENGTH_SHORT).show()
                }
            }
    }
}

