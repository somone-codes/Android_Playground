package com.example.android_playground

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Age(val numSides: Int) {

    fun random_age_generator(): Int {
        return (1..numSides).random()
    }
}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener(){
            val resultTextView: TextView = findViewById(R.id.textView4)
            val age = Age(100).random_age_generator()
            resultTextView.text = "I am ${age} years old !"
        var toast = Toast(this)
            val ageRevealImage: ImageView = findViewById(R.id.imageView6)
            if(age != 23){
                toast = Toast.makeText(this, "Tricked ya, keep rolling!", Toast.LENGTH_SHORT)
                ageRevealImage.setImageResource(R.drawable.oops)
            } else {
                toast = Toast.makeText(this, "Damn You got Me!", Toast.LENGTH_SHORT)
                ageRevealImage.setImageResource(R.drawable.damn_you_got_me)
            }
            toast.show()
        }
    }
}
