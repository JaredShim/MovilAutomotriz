package com.example.movilautomotriz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner

class GeneralesMotor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generales_motor)
        val siguiente = findViewById<Button>(R.id.buttonsiguienteGM)
        val atras = findViewById<Button>(R.id.buttonatrasGM)

        siguiente.setOnClickListener {
            val automotrices = Intent(this, Automotrices::class.java)
            startActivity(automotrices)
        }
        atras.setOnClickListener{
            val generalmotor = Intent(this, SistemasMotor::class.java)
            startActivity(generalmotor)
        }
    }
}