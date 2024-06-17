package com.example.drozdovapp

import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat



class activity_onboarding : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboarding)

        val toRegisterBtn = findViewById<Button>(R.id.toRegisterBtn)
        val toLoginBtn = findViewById<ImageButton>(R.id.loginButton)

        toRegisterBtn.setOnClickListener{
            val intent = Intent(this, reg_window::class.java)
            startActivity(intent)
        }

        toLoginBtn.setOnClickListener{
            val intent = Intent(this, activity_login::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets


        }


    }
}
