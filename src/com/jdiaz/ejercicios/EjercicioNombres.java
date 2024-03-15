package com.jdiaz.ejercicios;

import java.util.Scanner;

public class EjercicioNombres {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba el nombre del familiar 1");
        String familiar1 = "Andrés";//scanner.nextLine();
        System.out.println("Escriba el nombre del familiar 2");
        String familiar2 = "María";//scanner.nextLine();
        System.out.println("Escriba el nombre del familiar 3");
        String familiar3 = "Pepe";//scanner.nextLine();


        if (familiar1.length() > 1) {
            char secondCharUpper = Character.toUpperCase(familiar1.charAt(1));
            System.out.println("secondCharUpper = " + secondCharUpper);
            familiar1 = secondCharUpper + "." + familiar1.substring(familiar1.length() - 2);
        }
        System.out.println("familiar1 = " + familiar1);

        if (familiar2.length() > 1) {
            char secondCharUpper = Character.toUpperCase(familiar2.charAt(1));
            System.out.println("secondCharUpper = " + secondCharUpper);
            familiar2 = secondCharUpper + "." + familiar2.substring(familiar2.length() - 2);
        }
        System.out.println("familiar2 = " + familiar2);

        if (familiar3.length() > 1) {
            char secondCharUpper = Character.toUpperCase(familiar3.charAt(1));
            System.out.println("secondCharUpper = " + secondCharUpper);
            familiar3 = secondCharUpper + "." + familiar3.substring(familiar3.length() - 2);
        }
        System.out.println("familiar2 = " + familiar3);

        System.out.println("El resultado final es: " + familiar1 + "_" + familiar2 + "_" + familiar3);

        String resultadoDeMiMetodo = checkNumber(5);
        System.out.println("resultadoDeMiMetodo = " + resultadoDeMiMetodo);

        System.out.println("Resultado del método: " + checkNumber(5));



    }
    public static String checkNumber ( int a){
        if (a > 3) {
            return "hola";
        }
        return "a no es mayor que 3";
    }
}
