package com.example.profundizacionteknova

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView

class InicioCompradorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio_comprador)

        val botonVer = findViewById<Button>(R.id.botonVerProducto)

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

        botonVer.setOnClickListener {

            val intent = Intent(this, DetalleProductoActivity::class.java)
            startActivity(intent)

        }

    }
}