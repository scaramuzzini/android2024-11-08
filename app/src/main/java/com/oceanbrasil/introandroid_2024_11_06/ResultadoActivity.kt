package com.oceanbrasil.introandroid_2024_11_06

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_resultado)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btVoltar = findViewById<Button>(R.id.btVoltar)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)
        btVoltar.setOnClickListener {
            finish()
        }

        val nomeDigitado = intent.getStringExtra("NOME_DIGITADO")
        txtResultado.text = nomeDigitado
    }
}