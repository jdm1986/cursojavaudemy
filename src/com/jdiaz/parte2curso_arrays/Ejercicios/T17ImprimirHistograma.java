package com.jdiaz.parte2curso_arrays.Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class T17ImprimirHistograma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arrayA = new int[12];
        int[] contador = new int[6];
        System.out.println("Construyendo array de 12 elementos");
        for (int i = 0; i < arrayA.length; i++) {
            int numero;
            do {
                System.out.print("Escriba un número del 1 al 6: ");
                numero = scanner.nextInt();
                if (numero < 1 || numero > 6) {
                    System.out.println("Por favor, escriba un número del 1 al 6");
                }
            } while (numero < 1 || numero > 6);

            // Encuentro la posición correcta para el número.
            int indiceAuxiliar = i - 1;

            while (indiceAuxiliar >= 0 && arrayA[indiceAuxiliar] > numero) {
                arrayA[indiceAuxiliar + 1] = arrayA[indiceAuxiliar];
                indiceAuxiliar--;
            }

            arrayA[indiceAuxiliar + 1] = numero; // Inserto el número en la posición encontrada.
            contador[numero - 1]++;

        }
        System.out.println("Array ordenado: " + Arrays.toString(arrayA)); // Muestro array ordenado

        System.out.println("********* HISTOGRAMA ************");

        for (int i = 0; i < contador.length; i++) {
            System.out.print((i + 1) + ": "); // Imprime el número evaluado del array y los dos puntos

            for (int j = 0; j < contador[i]; j++) {
                System.out.print("*");
            }

            System.out.println(); // Salto de línea al final de cada histograma
        }
    }
}

