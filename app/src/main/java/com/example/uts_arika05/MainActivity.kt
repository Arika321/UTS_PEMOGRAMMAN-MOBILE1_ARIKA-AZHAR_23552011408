package com.example.uts_arika05

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Inside MainActivity.kt
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_chat)

        val userMessage: TextView = findViewById(R.id.message_user)
        val botMessage: TextView = findViewById(R.id.message_bot)

        // Display user and bot messages
        userMessage.text = "Halo, Soto Bandung! Saya mau pesan Soto spesial 3 porsi."
        userMessage.visibility = TextView.VISIBLE // Set to visible

        botMessage.text = "Selamat pagi! Soto spesialnya mau ditambah koya atau tidak?"
        botMessage.visibility = TextView.VISIBLE // Set to visible
    }
    }