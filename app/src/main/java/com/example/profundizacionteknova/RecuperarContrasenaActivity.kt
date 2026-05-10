package com.example.profundizacionteknova

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RecuperarContrasenaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recuperar_contrasena)

        val botonVolver = findViewById<Button>(R.id.botonVolver)
        val botonEnviar = findViewById<Button>(R.id.botonEnviar)

        botonVolver.setOnClickListener {

            finish()

        }

        botonEnviar.setOnClickListener {

            Toast.makeText(
                this,
                "Correo de recuperación enviado",
                Toast.LENGTH_LONG
            ).show()

        }

    }
}