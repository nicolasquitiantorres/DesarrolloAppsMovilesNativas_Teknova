package com.example.profundizacionteknova

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import androidx.biometric.BiometricManager
import androidx.biometric.BiometricPrompt
import androidx.core.content.ContextCompat

class InicioSesionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio_sesion)

        val botonIngresar = findViewById<Button>(R.id.botonIngresar)
        val textoRecuperar = findViewById<TextView>(R.id.textoRecuperar)

        val botonAdmin = findViewById<Button>(R.id.botonAdmin)
        val botonVendedor = findViewById<Button>(R.id.botonVendedor)

        val botonBiometrico = findViewById<Button>(R.id.botonBiometrico)

        val executor = ContextCompat.getMainExecutor(this)

        val biometricPrompt = BiometricPrompt(
            this,
            executor,
            object : BiometricPrompt.AuthenticationCallback() {

                override fun onAuthenticationSucceeded(
                    result: BiometricPrompt.AuthenticationResult
                ) {

                    super.onAuthenticationSucceeded(result)

                    val intent = Intent(
                        this@InicioSesionActivity,
                        InicioCompradorActivity::class.java
                    )

                    startActivity(intent)

                }

            })

        val promptInfo = BiometricPrompt.PromptInfo.Builder()
            .setTitle("Acceso biométrico")
            .setSubtitle("Usa tu huella o rostro")
            .setNegativeButtonText("Cancelar")
            .build()

        textoRecuperar.setOnClickListener {

            val intent = Intent(this, RecuperarContrasenaActivity::class.java)
            startActivity(intent)

        }

        botonIngresar.setOnClickListener {

            val intent = Intent(this, InicioCompradorActivity::class.java)
            startActivity(intent)

        }

        botonBiometrico.setOnClickListener {

            biometricPrompt.authenticate(promptInfo)

        }

        botonAdmin.setOnClickListener {

            val intent = Intent(
                this,
                DashboardAdministradorActivity::class.java
            )

            startActivity(intent)

        }

        botonVendedor.setOnClickListener {

            val intent = Intent(
                this,
                PanelVendedorActivity::class.java
            )

            startActivity(intent)

        }
    }
}