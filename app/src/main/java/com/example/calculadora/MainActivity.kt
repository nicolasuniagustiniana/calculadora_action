package com.example.calculadora

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var btnSuma: Button
    private lateinit var btnResta: Button
    private lateinit var btnDivision: Button
    private lateinit var btnMultiplicacion: Button
    private lateinit var btnPotenciacion: Button
    private lateinit var btnFibonacci: Button
    private lateinit var btnFactorizacion: Button
    private lateinit var textRespuesta: TextView
    private lateinit var editNumeroUno: EditText
    private lateinit var editNumeroDos: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textRespuesta = findViewById(R.id.Respuesta)
        editNumeroUno = findViewById(R.id.numero1)
        editNumeroDos = findViewById(R.id.numero2)

        btnSuma = findViewById(R.id.button_suma)
        btnSuma.setOnClickListener {
            textRespuesta.text = MainActivity.suma(editNumeroUno.text.toString().toInt(), editNumeroDos.text.toString().toInt()).toString()
        }

        btnResta = findViewById(R.id.button_resta)
        btnResta.setOnClickListener {
            textRespuesta.text = resta(editNumeroUno.text.toString().toInt(), editNumeroDos.text.toString().toInt()).toString()
        }

        btnDivision = findViewById(R.id.button_division)
        btnDivision.setOnClickListener {
            try {
                textRespuesta.text = division(editNumeroUno.text.toString().toInt(), editNumeroDos.text.toString().toInt()).toString()
            } catch (e: ArithmeticException) {
                textRespuesta.text = "Error: División por cero"
            }
        }

        btnMultiplicacion = findViewById(R.id.button_multiplicacion)
        btnMultiplicacion.setOnClickListener {
            textRespuesta.text = multiplicacion(editNumeroUno.text.toString().toInt(), editNumeroDos.text.toString().toInt()).toString()
        }

        btnPotenciacion = findViewById(R.id.button_potenciacion)
        btnPotenciacion.setOnClickListener {
            textRespuesta.text = potenciacion(editNumeroUno.text.toString().toInt(), editNumeroDos.text.toString().toInt()).toString()
        }

        btnFibonacci = findViewById(R.id.button_fibonacci)
        btnFibonacci.setOnClickListener {
            val intent = Intent(this@MainActivity, MainActivity3::class.java)
            startActivity(intent)
        }

        btnFactorizacion = findViewById(R.id.button_factorizacion)
        btnFactorizacion.setOnClickListener {
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            startActivity(intent)
        }
    }

    companion object {
        @JvmStatic
        fun suma(a: Int, b: Int): Double {
            return (a + b).toDouble()
        }

        fun resta(a: Int, b: Int): Double {
            return (a - b).toDouble()
        }

        fun division(a: Int, b: Int): Double {
            if (b == 0) {
                throw ArithmeticException("División por cero")
            }
            return (a / b).toDouble()
        }

        fun multiplicacion(a: Int, b: Int): Double {
            return (a * b).toDouble()
        }

        fun potenciacion(a: Int, b: Int): Double {
            return Math.pow(a.toDouble(), b.toDouble())
        }
    }
}
