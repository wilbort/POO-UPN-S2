package ingresodecimal;

import java.util.Scanner;

public class IngresoDecimal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero decimal: ");
        double numeroDecimal = entrada.nextDouble();

        System.out.println("El numero ingresado es: " + numeroDecimal);

        entrada.close();

    }
}
