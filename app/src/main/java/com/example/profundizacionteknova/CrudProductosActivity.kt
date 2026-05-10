package com.example.profundizacionteknova

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CrudProductosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crud_productos)

        val botonVolver = findViewById<Button>(R.id.botonVolver)
        val botonAgregar = findViewById<Button>(R.id.botonAgregar)
        val botonEditar = findViewById<Button>(R.id.botonEditar)
        val botonEliminar = findViewById<Button>(R.id.botonEliminar)

        botonVolver.setOnClickListener {

            finish()

        }

        botonAgregar.setOnClickListener {

            Toast.makeText(
                this,
                "Producto agregado",
                Toast.LENGTH_SHORT
            ).show()

        }

        botonEditar.setOnClickListener {

            Toast.makeText(
                this,
                "Producto editado",
                Toast.LENGTH_SHORT
            ).show()

        }

        botonEliminar.setOnClickListener {

            Toast.makeText(
                this,
                "Producto eliminado",
                Toast.LENGTH_SHORT
            ).show()

        }

    }
}