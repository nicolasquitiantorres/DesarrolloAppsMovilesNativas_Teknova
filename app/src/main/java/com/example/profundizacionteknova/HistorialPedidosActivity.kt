package com.example.profundizacionteknova

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class HistorialPedidosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_historial_pedidos)

        val botonVolver = findViewById<Button>(R.id.botonVolver)
        val botonEstado = findViewById<Button>(R.id.botonEstado)

        botonVolver.setOnClickListener {

            finish()

        }

        botonEstado.setOnClickListener {

            Toast.makeText(
                this,
                "Pedido marcado como enviado",
                Toast.LENGTH_SHORT
            ).show()

        }

    }
}