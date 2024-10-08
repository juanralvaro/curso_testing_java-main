package com.certidevs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VariablesTest {

    @Test
    void tiposNumeroEntero() {
        byte numero1 = 5;
        short numero2 = 10;
        int numero3 = 20;
        long numero4 = 500;
        assertEquals(5, numero1);
    }

    @Test
    void tiposNumerosConDecimal(){
        float numero1 = 50.10f;
        double numero2 = 500.1111;
        assertEquals(50.10f, numero1);
    }

    @Test
    void tiposTexto() {
        String textoCorto = "Texto String para describir algo";

        String textoLargo = """
                Este es un texto de varias líneas
                Otra línea
                Otra línea
                """;

        char grupo = 'A';
    }

    @Test
    void booleanosVerdaderoFalso(){
        boolean esMayorDeEdad = true;
    }

}
