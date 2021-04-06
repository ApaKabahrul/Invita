package com.example.invita

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val confirm : Button = findViewById(R.id.confirm)
        confirm.setOnClickListener {
            val i = Intent(this, HomeActivity::class.java)
            startActivity(i)
        }
    }
}