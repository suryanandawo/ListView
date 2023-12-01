package com.example.login

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class LoginActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val btnPindah = findViewById<Button>(R.id.login)
        btnPindah.setOnClickListener {
            val intent = Intent(this, MainMenuActivity::class.java)
            startActivity(intent)
        }
        val btnBelum = findViewById<TextView>(R.id.belum)
        btnBelum.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
        // init widget (komponen UI)
        var iusername = findViewById<EditText>(R.id.nama)
        var ipassword = findViewById<EditText>(R.id.katasandi)
        var btnLogin = findViewById<Button>(R.id.login)

        btnLogin.setOnClickListener {

            var isianusername = iusername.text.toString()
            var isianpassword = ipassword.text.toString()

            if (isianusername != "" ||
                isianpassword != ""
            ) {
                // B - lanjut ke pengecekkan selanjutnya (username-password match?)
                if (isianusername.equals("telyutizen") &&
                    isianpassword.equals("ppbm01")
                ) {
                    // password + username cocok
                    val intent = Intent(this, MainMenuActivity::class.java)
                    startActivity(intent)
                } else {
                    // password + username mismatch
                    val alert = AlertDialog.Builder(this)
                    alert.setTitle("Pesan")
                    alert.setMessage("Waduhh, masih ada yang salah banh")
                    alert.show()
                }
            } else {
                // A - kasih peringatan jangan ada yang kosong
                Toast.makeText(this, "Wrong Username or Password!", Toast.LENGTH_LONG).show()

                val alert = AlertDialog.Builder(this)
                alert.setTitle("Pesan")
                alert.setMessage("Waduhh, masih ada yang salah banh")
                alert.show()
            }
        }
    }
}

