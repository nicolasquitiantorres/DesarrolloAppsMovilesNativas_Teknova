package com.example.profundizacionteknova

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.ImageView

class PerfilUsuarioActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil_usuario)

        val botonVolver = findViewById<Button>(R.id.botonVolver)
        val iconoCarrito = findViewById<ImageView>(R.id.iconoCarrito)

        iconoCarrito.setOnClickListener {

            val intent = Intent(this, CarritoActivity::class.java)
            startActivity(intent)

        }

        botonVolver.setOnClickListener {

            finish()

        }

    }
}