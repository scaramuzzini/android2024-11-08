package com.oceanbrasil.introandroid_2024_11_06

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //1. Recuperar o botao - fazer o bind entre a view e o kt
        val btSalvar = findViewById<Button>(R.id.buttonSalvar)
        val tvMensagem = findViewById<TextView>(R.id.textViewMensagem)
        val etNome = findViewById<EditText>(R.id.editNome)
        //2. Definir o listener(ouvinte) do evento de click do botão
        btSalvar.setOnClickListener {
            Log.d("APPOCEAN", "Clicou no botão!!!")
            // tvMensagem.text = "Samsung OCEAN"
            val nome = etNome.text.toString()

            if (nome.isEmpty()) {
                //Apresentar mensagem de erro
                etNome.error = "Nome é obrigatório"
            } else {
                tvMensagem.text = """O nome digitado foi ${etNome.text}"""
            }

        }

    }
}