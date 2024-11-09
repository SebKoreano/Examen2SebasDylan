package com.example.examen2;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTestDylan {

    @Test
    public void testConvertirNumero() {

        // Prueba de conversión de binario a decimal
        assertEquals(5, Calculadora.convertirNumero("101", 0));

        // Prueba de base no soportada
        assertEquals(-1, Calculadora.convertirNumero("100", 4));
    }

    @Test
    public void testRealizarOperacion() {

        // Prueba de multiplicación
        assertEquals(12, Calculadora.realizarOperacion(3, 4, "*"));

        // Prueba de división
        assertEquals(2, Calculadora.realizarOperacion(8, 4, "/"));
    }

    @Test
    public void testConvertirADestino() {

        // Prueba de conversión de decimal a binario
        assertEquals("101", Calculadora.convertirADestino(5, 0));

        // Prueba de conversión de decimal a hexadecimal
        assertEquals("ff", Calculadora.convertirADestino(255, 3));

    }


}













