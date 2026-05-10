package com.example.profundizacionteknova

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView

class DetalleProductoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_producto)

        val botonAgregar = findViewById<Button>(R.id.botonAgregarCarrito)
        val botonVolver = findViewById<Button>(R.id.botonVolver)

        val iconoPerfil = findViewById<ImageView>(R.id.iconoPerfil)
        val iconoCarrito = findViewById<ImageView>(R.id.iconoCarrito)

        iconoPerfil.setOnClickListener {

            val intent = Intent(this, PerfilUsuarioActivity::class.java)
            startActivity(intent)

        }

        iconoCarrito.setOnClickListener {

            val intent = Intent(this, CarritoActivity::class.java)
            startActivity(intent)

        }

        botonAgregar.setOnClickListener {

            val intent = Intent(this, CarritoActivity::class.java)
            startActivity(intent)

        }

        botonVolver.setOnClickListener {

            finish()

        }

    }
}