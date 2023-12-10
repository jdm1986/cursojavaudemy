package Parte2;

import java.util.Arrays;

public class Arreglos06OrdenPrincipioFinal {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }
        System.out.println(" Poblando Array ");
        System.out.println(Arrays.toString(numeros));
        System.out.println(" Mostrando Principio A fin (solo print, sin modificar ");

        for (int i = 0; i < numeros.length - i; /*o dividimos entre 2*/i++) {
            System.out.print(numeros[i] + " ");
            System.out.println(numeros[numeros.length - 1 - i]);
        }
        System.out.println(" Array Sin modificar ");
        System.out.println(Arrays.toString(numeros));
        System.out.println(" Modificando Array ");

        int[] a = new int[10];
        int aux = 0;
        for (int i = 0; i < numeros.length-i; i++) {
            a[aux++] = numeros[i];
            a[aux++] = numeros[numeros.length-1-i];
            System.out.print(numeros[i] + " ");
            System.out.println(numeros[numeros.length - 1 - i]);
        }
        System.out.println(" Array modificado ");
        System.out.println(Arrays.toString(a));

    }
}
