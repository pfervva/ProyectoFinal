package com.example.proyecto_final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView7: TextView = findViewById(R.id.textView7)
        textView7.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)

        }
    }
}