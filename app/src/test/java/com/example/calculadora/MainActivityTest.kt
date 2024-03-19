package com.example.calculadora;

import junit.framework.TestCase;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class MainActivityTest  {


        @Test
        public void suma() {
            double Respuesta = MainActivity.suma(5, 3);
            assertEquals(8.0, Respuesta, 0.01);
            System.out.println("El resultado de la suma es : " + Respuesta);
        }

    @Test
        public void resta() {
            double Respuesta = MainActivity.resta(4, 1);
            assertEquals(6.0, Respuesta, 0.01);
            System.out.println("La Respuesta de la resta es : " + Respuesta);
        }
    @Test
        public void division() {
            double Respuesta = MainActivity.division(8, 2);
            assertEquals(4.0, Respuesta, 0.01);
            System.out.println("El resultado de la division es : " + Respuesta);
        }
    @Test
        public void multiplicacion() {
            double Respuesta = MainActivity.multiplicacion(12, 2);
            assertEquals(24.0, Respuesta, 0.01);
            System.out.println("El resultado de la multiplicacion es : " +Respuesta);
        }
@Test
    public void potenciacion() {
        double Respuesta = MainActivity.potenciacion(5, 2);
        assertEquals(15.0, Respuesta, 0.01);
        System.out.println("El resultado de la potenciacion es : " +Respuesta);
    }

}