package com.jdiaz.parte14curso_excepciones.ejemplo;

import javax.swing.*;
import java.util.Scanner;

public class EjemploExcepciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        String numerador = JOptionPane.showInputDialog("Ingresa un entero numerador: ");
        String denominador = JOptionPane.showInputDialog("Ingresa un entero denominador: ");

        int divisor;
        double division;

        try {

            //division = calculadora.dividir(10,divisor);;
            //System.out.println("division = " + division);

            double division2 = calculadora.dividir(numerador,denominador);
            System.out.println("division2 = " + division2);
        }catch (NumberFormatException nfe){
            System.out.println("Se detectó una exepción: ingresa un valor numérico: " + nfe.getMessage());
            main(args);
        } catch (FormatoNumeroException e){
            System.out.println("Se detectó una excepción: ingresa un número válido: " + e.getMessage());
            e.printStackTrace(System.out);
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
