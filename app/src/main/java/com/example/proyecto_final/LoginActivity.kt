package com.example.proyecto_final

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    companion object {
        const val MYUSER = "pfer2002"
        const val MYPASS = "usuario2002"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loginlayout)

        val textView7: TextView = findViewById(R.id.textView7)
        val buttonLogin: Button = findViewById(R.id.buttonlogin)

        textView7.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        buttonLogin.setOnClickListener {
            val enteredUsername = findViewById<EditText>(R.id.editText_login).text.toString()
            val enteredPassword = findViewById<EditText>(R.id.editText_password).text.toString()

            if (enteredUsername == MYUSER && enteredPassword == MYPASS) {
                val intent = Intent(this, LogguedActivity::class.java)
                startActivity(intent)

                finish()
            } else {
                Toast.makeText(this, "Nombre de usuario o contraseña erroneo", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
