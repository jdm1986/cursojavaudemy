package com.jdiaz.parte2curso_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array09DetectandoOrden {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuántos números quieres ingresar?");
        int arregloDeNumeros = scanner.nextInt();
        int[] a = new int[arregloDeNumeros];
        System.out.println("Ingresa " + arregloDeNumeros + " números");

        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(a));

        boolean ascedente = false;
        boolean descendente = false;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                descendente = true;
            }
            if (a[i] < a[i + 1]) {
                ascedente = true;
            }
        }
        if (ascedente == true && descendente == true){
            System.out.println("Arreglo DESORDENADO");
            Arrays.sort(a);
            System.out.println("Arreglo Ordenado");
            System.out.println(Arrays.toString(a));
        }
        if (ascedente == false && descendente == false ){
            System.out.println("TODOS LOS NÚMEROS IGUALES");
        } if (ascedente == true && descendente == false){
            System.out.println("Arreglo Ascendente");
        } if (ascedente == false && descendente==true ){
            System.out.println("Arreglo Descendente");
        }
    }
}
