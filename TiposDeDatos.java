package tiposdedatos;

public class TiposDeDatos {

    public static void main(String[] args) {
        
        // Tipo int: Enteros
        int edad = 25;
        System.out.println("Edad: " + edad);

        // Tipo long: Enteros grandes
        long poblacionMundial = 7900000000L; // la L indica que es un long
        System.out.println("Poblacion mundial: " + poblacionMundial);

        // Tipo short: Enteros pequeños
        short temperatura = -15;
        System.out.println("Temperatura: " + temperatura);

        // Tipo byte: Enteros muy pequeños
        byte nivelBateria = 100;
        System.out.println("Nivel de bateria: " + nivelBateria);

        // Tipo float: Números decimales con precisión simple
        float precio = 19.99f; // la f indica que es float
        System.out.println("Precio: " + precio);

        // Tipo double: Números decimales con mayor precisión
        double pi = 3.141592653589793;
        System.out.println("Numero Pi: " + pi);

        // Tipo boolean: verdadero o falso
        boolean esMayorDeEdad = true;
        System.out.println("Es mayor de edad?: " + esMayorDeEdad);
        
        // Tipo char: Un solo carácter
        char inicial = 'W';
        System.out.println("Inicial: " + inicial);
        
        // Tipo String: Cadena de texto (clase, no primitivo)
        String ciudad = "Trujillo, Peru";
        System.out.println("Ciudad: " + ciudad);
        
        // Ejemplo combinado
        System.out.println("\nEjemplo combinado:");
        System.out.println("Hola, mi inicial es " + inicial
                + ", tengo " + edad + " anios, "
                + "y soy de " + ciudad);
        
    }
}
