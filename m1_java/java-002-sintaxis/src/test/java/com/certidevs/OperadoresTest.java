
package com.certidevs;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
Aserciones utilizadas:

assertEquals(variable1, variable2);

assertTrue(variable1);

assertFalse(variable1);
 */
public class OperadoresTest {

    @Test
    void operadoresAritmeticos_suma() {
        int suma = 5 + 5;
        int suma2 = suma + suma;
        int suma3 = suma2 + 10;
        assertEquals(30, suma3);
    }

    @Test
    void operadoresAritmeticos_resta() {
        int resta = 10 - 6;
        assertEquals(4, resta);
    }

    @Test
    void operadoresAritmeticos_multiplicacion() {
        int multiplicacion = 10 * 10;
        assertEquals(100, multiplicacion);
    }

    @Test
    void operadoresAritmeticos_division() {
        int resultado1 = 10 / 5;

        // se pierde la parte decimal
        int resultado2 = 5 / 3;

        // conserva y respeta la parte decimal solo los primeros decimales
        float resultado3 = 5f / 3;

        // conserva y respeta la parte decimal todos los decimales
        double resultado4 = 5f / 3;

        double resultado5 = 6f / 0;

        double suma = resultado5 + 10;
    }

    @Test
    void operadoresComparadores_mayor() {

        // Mayor que: >
        // Mayor o igual que: >=
        int edad = 22;
        boolean esMayorDeEdad = edad >= 18;

        assertTrue(esMayorDeEdad);
        assertTrue(edad > 18);
    }

    @Test
    void operadoresComparadores_menor() {
        // Menor que: <
        // Menor o igual que: <=
        int edad = 22;
        boolean esMenorDeEdad = edad < 18;

        assertFalse(esMenorDeEdad);
        assertTrue(edad < 100);
    }
}
