package com.example.uts_arika05

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class register_activity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register_activity)

        val username = findViewById<EditText>(R.id.registerUsername)
        val password = findViewById<EditText>(R.id.registerPassword)
        val email = findViewById<EditText>(R.id.registerEmail)
        val signUpButton = findViewById<Button>(R.id.signUpButton)

        signUpButton.setOnClickListener {
            val user = username.text.toString()
            val pass = password.text.toString()
            val emailInput = email.text.toString()

            // Validasi dasar
            if (user.isEmpty() || pass.isEmpty() || emailInput.isEmpty()) {
                Toast.makeText(this, "Silakan isi semua kolom", Toast.LENGTH_SHORT).show()
            } else {
                // Logika pendaftaran di sini (misalnya, simpan ke database)
                Toast.makeText(this, "Akun berhasil dibuat", Toast.LENGTH_SHORT).show()
                finish() // Tutup Activity Pendaftaran
            }
        }
    }
}