package com.jdiaz.parte14curso_excepciones.ejemplo;

import javax.swing.*;
import java.util.Scanner;

public class EjemploExcepciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();


        System.out.println("Ingresa un valor: ");
        int divisor = scanner.nextInt();
        double division;

        try {

            division = calculadora.dividir(10,divisor);;
            System.out.println("division = " + division);
        }catch (NumberFormatException nfe){
            System.out.println("Se detectó una exepción: ingresa un valor numérico: " + nfe.getMessage());
            main(args);
        }
        catch (DivisionPorCeroException ae){
            System.out.println("Capturamos la excepción en tiempo de ejecución" + ae.getMessage());
            main(args);
        } finally {
            System.out.println("Es opcional pero se ejecuta siempre con o sin excepción");
        }
        System.out.println("Contunuamos el fluijo del programa.");
        
    }
}
