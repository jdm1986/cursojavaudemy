package com.jdiaz.parte14curso_excepciones.ejemplo;

import javax.swing.*;
import java.util.Scanner;

public class EjemploExcepciones {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un valor: ");
        String valor = scanner.nextLine();

        try {
            int divisor = Integer.parseInt(valor);
            int division = 10/divisor;
            System.out.println("division = " + division);
        }catch (NumberFormatException nfe){
            System.out.println("Se detectó una exepción: ingresa un valor numérico: " + nfe.getMessage());
            main(args);
        }
        catch (ArithmeticException ae){
            System.out.println("Capturamos la excepción en tiempo de ejecución" + ae.getMessage());
            main(args);
        } finally {
            System.out.println("Es opcional pero se ejecuta siempre con o sin excepción");
        }
        System.out.println("Contunuamos el fluijo del programa.");
        
    }
}
