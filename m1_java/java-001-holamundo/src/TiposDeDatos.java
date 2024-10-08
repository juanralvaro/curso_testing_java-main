public class TiposDeDatos {

    public static void main(String[] args) {

        // Tipos de datos

        String cliente1 = "Alan Sastre";
        String direccion = "Calle prueba 1234";

        // char es con comilla simple y solo es un caracter, no más de uno
        char grupo = 'A';
        // char grupo2 = "B";

        // Números enteros:
        byte numeroCorto = 5;
        short numeroPequeno = 5000;
        int edad = 30;
        long distanciaPlanetaria = 1000000000000000000l;

        // Números con decimales
        float precioMercadonaCarne = 15.44f;
        double salario = 1432.55; // euros

        // Booleans de verdadero o falso
        boolean clienteDadoDeAlta = true;
        boolean mayorDeEdad = false;


        // Inferencia automática de tipos de datos
        var cliente2 = "Marina Vallejo";
        var precioAlto = 6789;
        var precioConDecimales = 5500.43;
        var claseTerminada = true;

    }
}
