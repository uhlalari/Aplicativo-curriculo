package com.example.curriculo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<ImageView>(R.id.button_contatos).setOnClickListener {
            var intent = Intent(this, Contatos::class.java)
            startActivity(intent)
        }

        findViewById<ImageView>(R.id.button_formacao).setOnClickListener {
            var intent = Intent(this, formacao::class.java)
            startActivity(intent)
        }

        findViewById<ImageView>(R.id.button_eu).setOnClickListener {
            var intent = Intent(this, sobremim::class.java)
            startActivity(intent)
        }

        findViewById<ImageView>(R.id.button_cursos).setOnClickListener {
            var intent = Intent(this, cursos::class.java)
            startActivity(intent)
        }
        
        findViewById<ImageView>(R.id.button_experiencia).setOnClickListener {
            var intent = Intent(this, experiencia::class.java)
            startActivity(intent)
        }

        findViewById<ImageView>(R.id.button_redes).setOnClickListener {
            var intent = Intent(this, redessociais::class.java)
            startActivity(intent)
        }
    }
}