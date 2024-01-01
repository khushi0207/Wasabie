package com.example.firstapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class rate_us : ComponentActivity() {
    @SuppressLint("MissingInflatedId")
   //private lateinit var database : DatabaseReference
    //private  var database = Firebase.database
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            setContentView(R.layout.rate_us)
            var r = findViewById<RatingBar>(R.id.ratingBar2)
            var b = findViewById<Button>(R.id.btnhome)
            var ratingScale = findViewById<TextView>(R.id.textView)
            b.setOnClickListener {

                var i = Intent(applicationContext,MainActivity::class.java)
                startActivity(i)
            }
            r.setOnRatingBarChangeListener { rBar, f1, b ->
                ratingScale.text = f1.toString()
                when (rBar.rating.toInt()){
                    1-> ratingScale.text = "very bad"
                    2-> ratingScale.text = "Satisfactory"
                    3-> ratingScale.text = "Average"
                    4-> ratingScale.text = "Vey good"
                    5-> ratingScale.text = "Excellent!!"
                    else -> ratingScale.text =" "
                }
                var m = r.rating.toString()
                Toast.makeText(applicationContext,""+m,Toast.LENGTH_LONG).show()
               /* database = FirebaseDatabase.getInstance().getReference("User's Rating")
                val User = User(m)
                database.child(m).setValue(User)*/

            }

        }
    }
}
