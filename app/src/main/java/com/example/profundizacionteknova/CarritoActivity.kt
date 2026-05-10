package com.example.profundizacionteknova

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.NumberFormat
import java.util.Locale
import android.widget.ImageView

class CarritoActivity : AppCompatActivity() {

    private var cantidad = 1
    private val precio = 2500000
    private val envio = 18000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carrito)

        val botonPago = findViewById<Button>(R.id.botonIrPago)
        val botonVolver = findViewById<Button>(R.id.botonVolver)

        val botonMas = findViewById<TextView>(R.id.botonMas)
        val botonMenos = findViewById<TextView>(R.id.botonMenos)

        val textoCantidad = findViewById<TextView>(R.id.textoCantidad)
        val textoSubtotal = findViewById<TextView>(R.id.textoSubtotal)
        val textoTotal = findViewById<TextView>(R.id.textoTotal)

        val iconoPerfil = findViewById<ImageView>(R.id.iconoPerfil)

        iconoPerfil.setOnClickListener {

            val intent = Intent(this, PerfilUsuarioActivity::class.java)
            startActivity(intent)

        }

        actualizarValores(textoCantidad, textoSubtotal, textoTotal)

        botonMas.setOnClickListener {

            cantidad++

            actualizarValores(textoCantidad, textoSubtotal, textoTotal)

        }

        botonMenos.setOnClickListener {

            if (cantidad > 1) {

                cantidad--

                actualizarValores(textoCantidad, textoSubtotal, textoTotal)

            }

        }

        botonPago.setOnClickListener {

            val subtotal = precio * cantidad
            val total = subtotal + envio

            val intent = Intent(this, PagoActivity::class.java)

            intent.putExtra("totalCompra", total)

            startActivity(intent)

        }

        botonVolver.setOnClickListener {

            finish()

        }

    }

    private fun actualizarValores(
        textoCantidad: TextView,
        textoSubtotal: TextView,
        textoTotal: TextView
    ) {

        val subtotal = precio * cantidad
        val total = subtotal + envio

        val formato = NumberFormat.getNumberInstance(Locale("es", "CO"))

        textoCantidad.text = cantidad.toString()

        textoSubtotal.text =
            "Subtotal: $" + formato.format(subtotal)

        textoTotal.text =
            "TOTAL: $" + formato.format(total)

    }
}