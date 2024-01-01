package com.example.firstapp

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.google.firebase.auth.FirebaseAuth

class login : ComponentActivity() { 
    private lateinit var Auth:FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            setContentView(R.layout.login)

            Auth = FirebaseAuth.getInstance()  // initialize our firebase
            var email = findViewById<EditText>(R.id.email)
            var pwd = findViewById<EditText>(R.id.pwd)
            var login = findViewById<Button>(R.id.btnl)
            var signup = findViewById<Button>(R.id.btns)
            val sharedPreferences: SharedPreferences = getSharedPreferences("login", Context.MODE_PRIVATE)
            val isLoggedIn = sharedPreferences.getBoolean("isLoggedIn", false)

            if (isLoggedIn) {
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }
            else
            {
               //Toast.makeText(this,"no account exists",Toast.LENGTH_LONG).show()
                var i = Intent(applicationContext,MainActivity::class.java)
                startActivity(i)
            }

            signup.setOnClickListener {
                var intent = Intent(applicationContext,signUp::class.java)
                startActivity(intent)
            }
            login.setOnClickListener {
                var email = email.text.toString()
                var pwd = pwd.text.toString()

                login(email,pwd);

            }

        }

    }
    private fun login(email:String,pwd:String){
        Auth.signInWithEmailAndPassword(email, pwd)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    var intent = Intent(applicationContext,MainActivity::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(applicationContext,"Does not exists",Toast.LENGTH_SHORT).show()
                }
            }
    }
}
