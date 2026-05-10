package com.example.profundizacionteknova

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class PanelVendedorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_panel_vendedor)

        val botonCrud = findViewById<Button>(R.id.botonCrud)
        val botonCerrarSesion = findViewById<Button>(R.id.botonCerrarSesion)

        val botonPedidos = findViewById<Button>(R.id.botonPedidos)

        botonPedidos.setOnClickListener {

            val intent = Intent(
                this,
                HistorialPedidosActivity::class.java
            )

            startActivity(intent)

        }


        botonCrud.setOnClickListener {

            val intent = Intent(
                this,
                CrudProductosActivity::class.java
            )

            startActivity(intent)

        }

        botonCerrarSesion.setOnClickListener {

            val intent = Intent(
                this,
                InicioSesionActivity::class.java
            )

            startActivity(intent)

            finish()

        }

    }
}