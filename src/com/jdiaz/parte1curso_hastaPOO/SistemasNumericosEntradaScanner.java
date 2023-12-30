package com.jdiaz.parte1curso_hastaPOO;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        // Solicitar un número al usuario
        System.out.println("Ingrese un número entero: \n");
        //String numeroStr = scanner.nextLine();
        int numeroDecimal = 0;

        try {
            numeroDecimal = scanner.nextInt(); //Integer.parseInt(numeroStr);
        } catch (Exception e){
            System.out.println("Error,debes ingeresar un número entero: ");
            main(args);
            System.exit(0 );
        }


        // Convertir a binario
        String resultadoMensajeBinario = "Número binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);


        // Convertir a octal
        String resultadoMensajeOctal = "Número octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);


        // Convertir a hexadecimal
        String resultadoMensajeHexadecimal = "Número hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);


        // Mostrar los resultados en un mensaje
        String mensaje = resultadoMensajeBinario;
        mensaje += "\n" + resultadoMensajeOctal;
        mensaje += "\n" + resultadoMensajeHexadecimal;

        System.out.println(mensaje);
    }
}
