package com.jdiaz.parte2curso_arrays;

import java.util.Arrays;

public class Array17InsertandoElementoMoviendoLosSiguientes {

    public static void main(String[] args) {
//un solo bucle

        int[] arrayA = {1, 2, 3, 4, 5};
        int nuevoElemento = 20;
        int posicion = 2;
        int[] arrayB = new int[arrayA.length + 1];
        System.out.println("ArrayA = " + Arrays.toString(arrayA));

        for (int i = 0; i < arrayB.length - 1; i++) {
            if (i < posicion) {
                arrayB[i] = arrayA[i];
            } else {
                if (i == posicion) {
                    arrayB[i] = nuevoElemento;
                }
                arrayB[i + 1] = arrayA[i];
            }

        }
        System.out.println("ArrayB = " + Arrays.toString(arrayB));
    }

}
//