package com.example.profundizacionteknova

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class DashboardAdministradorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard_administrador)

        val botonUsuarios = findViewById<Button>(R.id.botonUsuarios)
        val botonProductos = findViewById<Button>(R.id.botonProductos)
        val botonCerrarSesion = findViewById<Button>(R.id.botonCerrarSesion)
        val botonReportes = findViewById<Button>(R.id.botonReportes)

        botonReportes.setOnClickListener {

            val intent = Intent(
                this,
                ReporteVentasActivity::class.java
            )

            startActivity(intent)

        }

        botonUsuarios.setOnClickListener {

            val intent = Intent(
                this,
                GestionUsuariosActivity::class.java
            )

            startActivity(intent)

        }

        botonProductos.setOnClickListener {

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