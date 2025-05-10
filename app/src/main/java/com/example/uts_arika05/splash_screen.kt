package com.example.uts_arika05

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class splash_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splashscreen) // Gunakan R.layout.splash_screen

        // Menunggu beberapa detik sebelum berpindah ke register_activity
        Handler().postDelayed({
            val intent = Intent(this@splash_screen, register_activity::class.java)
            startActivity(intent)
            finish() // Menutup splash_screen agar tidak bisa kembali
        }, 2000) // Durasi splash screen dalam milidetik (2000 ms = 2 detik)
    }
}