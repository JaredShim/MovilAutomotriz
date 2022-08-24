package com.example.movilautomotriz
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AlertDialog



class SistemasMotor: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sistemas_motor)
        val spinner = findViewById<Spinner>(R.id.spinnerBateria2)
        val spinner2 = findViewById<Spinner>(R.id.spinnerBateria)
        val spinner3 = findViewById<Spinner>(R.id.spinnerBateria3)
        val spinner4 = findViewById<Spinner>(R.id.spinner4)
        val spinner5 = findViewById<Spinner>(R.id.spinner5)
        val spinner6 = findViewById<Spinner>(R.id.spinner6)
        val spinner7= findViewById<Spinner>(R.id.spinner7)
        val spinner8 = findViewById<Spinner>(R.id.spinner8)
        val spinner9 = findViewById<Spinner>(R.id.spinner9)
        val spinner10 = findViewById<Spinner>(R.id.spinner10)
        val spinner11 = findViewById<Spinner>(R.id.spinner11)
        val spinner12 = findViewById<Spinner>(R.id.spinner12)
        val spinner13 = findViewById<Spinner>(R.id.spinner13)
        val spinner14 = findViewById<Spinner>(R.id.spinner14)
        val spinner15 = findViewById<Spinner>(R.id.spinner15)
        val spinner16 = findViewById<Spinner>(R.id.spinner16)
        val spinner17 = findViewById<Spinner>(R.id.spinner17)
        val spinner18 = findViewById<Spinner>(R.id.spinner18)
        val spinner19 = findViewById<Spinner>(R.id.spinner19)
        val spinner20 = findViewById<Spinner>(R.id.spinner20)
        val spinner21 = findViewById<Spinner>(R.id.spinner21)
        val spinner22 = findViewById<Spinner>(R.id.spinner22)
        val spinner23 = findViewById<Spinner>(R.id.spinner23)
        val spinner24 = findViewById<Spinner>(R.id.spinner24)
        val siguiente = findViewById<Button>(R.id.buttonsiguiente)
        val atras = findViewById<Button>(R.id.buttonatras)
        val button = findViewById<Button>(R.id.buttonBateria)


        val lista = listOf("0","1","2","3","4","5")
        val lista2 = listOf("AU","OR","RT","RC","Ev")


        val adaptador = ArrayAdapter(this, android.R.layout.simple_spinner_item,lista)
        spinner.adapter = adaptador
        val adaptador2 = ArrayAdapter(this, android.R.layout.simple_spinner_item,lista2)
        spinner2.adapter = adaptador2
        val adaptador3 = ArrayAdapter(this, android.R.layout.simple_spinner_item,lista)
        spinner3.adapter = adaptador3
        val adaptador4 = ArrayAdapter(this, android.R.layout.simple_spinner_item,lista2)
        spinner4.adapter = adaptador4
        val adaptador5 = ArrayAdapter(this, android.R.layout.simple_spinner_item,lista)
        spinner5.adapter = adaptador5
        val adaptador6 = ArrayAdapter(this, android.R.layout.simple_spinner_item,lista)
        spinner6.adapter = adaptador6
        val adaptador7 = ArrayAdapter(this, android.R.layout.simple_spinner_item,lista2)
        spinner7.adapter = adaptador7
        val adaptador8 = ArrayAdapter(this, android.R.layout.simple_spinner_item,lista)
        spinner8.adapter = adaptador8
        val adaptador9 = ArrayAdapter(this, android.R.layout.simple_spinner_item,lista)
        spinner9.adapter = adaptador9
        val adaptador10 = ArrayAdapter(this, android.R.layout.simple_spinner_item,lista2)
        spinner10.adapter = adaptador10
        val adaptador11 = ArrayAdapter(this, android.R.layout.simple_spinner_item,lista)
        spinner11.adapter = adaptador11
        val adaptador12 = ArrayAdapter(this, android.R.layout.simple_spinner_item,lista)
        spinner12.adapter = adaptador12
        val adaptador13 = ArrayAdapter(this, android.R.layout.simple_spinner_item,lista2)
        spinner13.adapter = adaptador13
        val adaptador14 = ArrayAdapter(this, android.R.layout.simple_spinner_item,lista)
        spinner14.adapter = adaptador14
        val adaptador15 = ArrayAdapter(this, android.R.layout.simple_spinner_item,lista)
        spinner15.adapter = adaptador15
        val adaptador16 = ArrayAdapter(this, android.R.layout.simple_spinner_item,lista2)
        spinner16.adapter = adaptador16
        val adaptador17 = ArrayAdapter(this, android.R.layout.simple_spinner_item,lista)
        spinner17.adapter = adaptador17
        val adaptador18 = ArrayAdapter(this, android.R.layout.simple_spinner_item,lista)
        spinner18.adapter = adaptador18
        val adaptador19 = ArrayAdapter(this, android.R.layout.simple_spinner_item,lista2)
        spinner19.adapter = adaptador19
        val adaptador20 = ArrayAdapter(this, android.R.layout.simple_spinner_item,lista)
        spinner20.adapter = adaptador20
        val adaptador21 = ArrayAdapter(this, android.R.layout.simple_spinner_item,lista)
        spinner21.adapter = adaptador21
        val adaptador22 = ArrayAdapter(this, android.R.layout.simple_spinner_item,lista2)
        spinner22.adapter = adaptador22
        val adaptador23 = ArrayAdapter(this, android.R.layout.simple_spinner_item,lista)
        spinner23.adapter = adaptador23
        val adaptador24 = ArrayAdapter(this, android.R.layout.simple_spinner_item,lista)
        spinner24.adapter = adaptador24

        button.setOnClickListener{
            val builder = AlertDialog.Builder(this@SistemasMotor)
            val view = layoutInflater.inflate(R.layout.observaciones,null)

            builder.setView(view)

            val dialog = builder.create()
            dialog.show()

        }

        siguiente.setOnClickListener {
            val generalesMotor = Intent(this, GeneralesMotor::class.java)
            startActivity(generalesMotor)
        }
        atras.setOnClickListener{
            val general = Intent(this, Generals::class.java)
            startActivity(general)
        }

    }
}