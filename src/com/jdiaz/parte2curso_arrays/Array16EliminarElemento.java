package com.jdiaz.parte2curso_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array16EliminarElemento {
    public static void main(String[] args) {

        int [] arreglo = new int[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0;i<arreglo.length;i++){
            System.out.print("Ingresa un número");
            arreglo[i] = scanner.nextInt();
        }
        System.out.println("Arreglo actual: " + Arrays.toString(arreglo));
        System.out.println();
        System.out.println("Ingresa una posición a eliminar entre 0-9");
        int posicion = scanner.nextInt();

        for (int i = posicion;i<arreglo.length-1;i++){
            arreglo[i] = arreglo[i+1];
        }
        System.out.println(Arrays.toString(arreglo));

        int [] nuevoArreglo = new int[arreglo.length-1];

        //haciendo copia de arreglo usando la clase System..

        System.arraycopy(arreglo,0,nuevoArreglo,0,nuevoArreglo.length);

        /*for (int i =0; i<nuevoArreglo.length;i++){
            nuevoArreglo[i] = arreglo[i];
        }*/ //copia con for normal

        System.out.println(Arrays.toString(nuevoArreglo));

    }
}
