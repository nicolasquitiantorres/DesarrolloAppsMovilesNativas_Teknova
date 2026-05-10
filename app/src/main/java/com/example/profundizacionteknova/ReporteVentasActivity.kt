package com.example.profundizacionteknova

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ReporteVentasActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reporte_ventas)

        val botonVolver = findViewById<Button>(R.id.botonVolver)

        botonVolver.setOnClickListener {

            finish()

        }

    }
}