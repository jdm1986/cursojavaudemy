package com.jdiaz.ejercicios;

import java.util.Scanner;

public class EjerciciosNumerosOrdenados {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------Ejercicio números ordenados--------------");
        System.out.println("Introduzca primer número");
        int num1 = 1;//scanner.nextInt();
        System.out.println("Introduzca segundo número");
        int num2 = 5;//scanner.nextInt();

        String ordenMayorAMenor = "";
        ordenMayorAMenor = num1 > num2 ? "num1: " + num1 + ", num2: " + num2 : "num2: " + num2 + ", num1: " + num1;
        System.out.println("El orden de mayor a menor es: "+ordenMayorAMenor);


    }
}
