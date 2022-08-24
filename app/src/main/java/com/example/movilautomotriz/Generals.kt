package com.example.movilautomotriz
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Generals : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generales)

        val guardar = findViewById<Button>(R.id.GuardarGenerales)

       guardar.setOnClickListener {
            val SistemasMotor = Intent(this, SistemasMotor::class.java)
            startActivity(SistemasMotor)
        }
    }
}