package com.example.uts_arika05

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class list_chat : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        // Inisialisasi dan set konten pesan jika diperlukan
        val userMessage = findViewById<TextView>(R.id.chat_message_user)
        val botMessage = findViewById<TextView>(R.id.chat_message_bot)
        val userReply = findViewById<TextView>(R.id.chat_reply_user)
        val botReply = findViewById<TextView>(R.id.chat_reply_bot)

        // Set pesan jika ingin dinamis
        userMessage.text = "Halo, Soto Bandung! Saya mau pesan Soto spesial 3 porsi."
        botMessage.text = "Selamat pagi! Soto specialnya mau ditambah koya atau tidak?"
        userReply.text = "Iya, saya mau tambah koya, terima kasih!"
        botReply.text = "Siap! Tunggu sebentar, ya. Soto spesialnya akan segera siap!"
    }
}