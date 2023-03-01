package com.example.a5intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    val id:Int = 10
    val language:String = "Kotlin"
    lateinit var button : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
          button = findViewById(R.id.button)
    button.setOnClickListener(){
        intent = Intent(this,secondactivity::class.java)
        intent.putExtra("id_value",id)
        intent.putExtra("language_value",language)
        startActivity(intent)
    }

    }
}