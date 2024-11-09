package com.example.examen2;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTestSebastian {
    @Test
    public void testConvertirNumero() {

        // Prueba de conversión de hexadecimal a decimal
        assertEquals(170, Calculadora.convertirNumero("AA", 3));

        // Prueba de conversión de octal a decimal
        assertEquals(8, Calculadora.convertirNumero("10", 1));;
    }

    @Test
    public void testRealizarOperacion() {

        // Prueba de suma
        assertEquals(10, Calculadora.realizarOperacion(6, 4, "+"));

        // Prueba de resta que da un valor negativo
        assertEquals(-3, Calculadora.realizarOperacion(4, 7, "-"));
    }

    @Test
    public void testConvertirADestino() {

        // Prueba de conversión de decimal a decimal
        assertEquals("100", Calculadora.convertirADestino(100, 2));

        // Prueba de conversión de decimal a octal
        assertEquals("14", Calculadora.convertirADestino(12, 1));

    }

}
