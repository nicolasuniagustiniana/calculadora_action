package com.example.calculadora

import org.junit.Assert
import org.junit.Test

class MainActivityTest {
    @Test
    fun suma() {
        val Respuesta = MainActivity.suma(5, 3)
        Assert.assertEquals(8.0, Respuesta, 0.01)
        println("El resultado de la suma es : $Respuesta")
    }

    @Test
    fun resta() {
        val Respuesta = MainActivity.resta(4, 1)
        Assert.assertEquals(6.0, Respuesta, 0.01)
        println("La Respuesta de la resta es : $Respuesta")
    }

    @Test
    fun division() {
        val Respuesta = MainActivity.division(8, 2)
        Assert.assertEquals(4.0, Respuesta, 0.01)
        println("El resultado de la division es : $Respuesta")
    }

    @Test
    fun multiplicacion() {
        val Respuesta = MainActivity.multiplicacion(12, 2)
        Assert.assertEquals(24.0, Respuesta, 0.01)
        println("El resultado de la multiplicacion es : $Respuesta")
    }

    @Test
    fun potenciacion() {
        val Respuesta = MainActivity.potenciacion(5, 2)
        Assert.assertEquals(15.0, Respuesta, 0.01)
        println("El resultado de la potenciacion es : $Respuesta")
    }
}