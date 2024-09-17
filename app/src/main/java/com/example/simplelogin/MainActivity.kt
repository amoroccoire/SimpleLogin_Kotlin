package com.example.simplelogin

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.simplelogin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view: View = binding.root
        setContentView(view)

        val edtUsername = binding.edtUsername
        val edtPassword = binding.edtPassword
        val btnLogin = binding.btnLogin

        btnLogin.setOnClickListener {
            if (edtUsername.text.toString() == "admin" && edtPassword.text.toString() == "admin") {
                Toast.makeText(applicationContext, "Bienvenido a mi App", Toast.LENGTH_SHORT).show()
                Log.d(TAG, "Bienvenido a mi App")
            } else {
                Toast.makeText(applicationContext, "Error en la autenticacion", Toast.LENGTH_SHORT).show()
                Log.d(TAG, "Error en la autenticacion")
            }
        }
    }
}