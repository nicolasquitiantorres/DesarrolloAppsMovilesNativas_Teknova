package com.example.profundizacionteknova

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class GestionUsuariosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gestion_usuarios)

        val botonVolver = findViewById<Button>(R.id.botonVolver)
        val botonBloquear = findViewById<Button>(R.id.botonBloquear)
        val botonEliminar = findViewById<Button>(R.id.botonEliminar)

        botonVolver.setOnClickListener {

            finish()

        }

        botonBloquear.setOnClickListener {

            Toast.makeText(
                this,
                "Usuario bloqueado",
                Toast.LENGTH_SHORT
            ).show()

        }

        botonEliminar.setOnClickListener {

            Toast.makeText(
                this,
                "Usuario eliminado",
                Toast.LENGTH_SHORT
            ).show()

        }

    }
}