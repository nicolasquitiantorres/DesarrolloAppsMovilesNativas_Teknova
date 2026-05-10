package com.example.profundizacionteknova

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.text.NumberFormat
import java.util.Locale
import android.content.Intent
import android.widget.ImageView

class PagoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pago)

        val total = intent.getIntExtra("totalCompra", 0)

        val formato = NumberFormat.getNumberInstance(Locale("es", "CO"))

        val textoTotal = findViewById<TextView>(R.id.textoTotalPago)

        textoTotal.text = "TOTAL: $" + formato.format(total)

        val botonVolver = findViewById<Button>(R.id.botonVolver)
        val botonFinalizar = findViewById<Button>(R.id.botonFinalizarCompra)

        val radioTarjeta = findViewById<RadioButton>(R.id.radioTarjeta)
        val radioNequi = findViewById<RadioButton>(R.id.radioNequi)
        val radioApplePay = findViewById<RadioButton>(R.id.radioApplePay)

        val layoutTarjeta = findViewById<LinearLayout>(R.id.layoutTarjeta)
        val layoutNequi = findViewById<LinearLayout>(R.id.layoutNequi)
        val layoutApplePay = findViewById<LinearLayout>(R.id.layoutApplePay)

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

        radioTarjeta.setOnClickListener {

            layoutTarjeta.visibility = View.VISIBLE
            layoutNequi.visibility = View.GONE
            layoutApplePay.visibility = View.GONE

        }

        radioNequi.setOnClickListener {

            layoutTarjeta.visibility = View.GONE
            layoutNequi.visibility = View.VISIBLE
            layoutApplePay.visibility = View.GONE

        }

        radioApplePay.setOnClickListener {

            layoutTarjeta.visibility = View.GONE
            layoutNequi.visibility = View.GONE
            layoutApplePay.visibility = View.VISIBLE

        }

        botonVolver.setOnClickListener {

            finish()

        }

        botonFinalizar.setOnClickListener {

            Toast.makeText(
                this,
                "Compra realizada correctamente",
                Toast.LENGTH_LONG
            ).show()

        }

    }
}