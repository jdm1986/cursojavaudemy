package com.jdiaz.parte1curso_hasta_Arrays;

import java.util.Scanner;

public class OperadorTernarioNumeroMayor {
    public static void main(String[] args) {

        int max = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingres un número");
        int num1 = scanner.nextInt();

        System.out.println("Ingres un número");
        int num2 = scanner.nextInt();

        System.out.println("Ingres un número");
        int num3 = scanner.nextInt();

        System.out.println("Ingres un número");
        int num4 = scanner.nextInt();

        max = (num1>num2)?num1:num2;
        max = (max > num3)?max:num3;
        max = (max > num4)?max:num4;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num3 = " + num4);
        System.out.println("El número mayor es " + max);
    }
}
