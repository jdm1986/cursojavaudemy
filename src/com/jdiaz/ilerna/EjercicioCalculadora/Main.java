package com.jdiaz.ilerna.EjercicioCalculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("Introduzca el primer número");
        int num1 = scanner.nextInt();
        System.out.println("Introduzca la operación: +,-,*,/");
        String operacion = scanner.next();
        System.out.println("Introduzca el segundo número");
        int num2 = scanner.nextInt();

        if (num1 != 0 && num2 != 0){
            calculadora.operacion(num1,num2,operacion);
            System.out.println(calculadora.getNumOperaciones());
        }


    }
}
