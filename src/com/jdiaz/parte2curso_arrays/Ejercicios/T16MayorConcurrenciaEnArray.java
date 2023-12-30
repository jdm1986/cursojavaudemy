package com.jdiaz.parte2curso_arrays.Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class T16MayorConcurrenciaEnArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arrayA = new int[10];
        System.out.println("Construyendo array de 10 elementos");
        for (int i = 0; i < arrayA.length; i++) {
            int numero;
            do {
                System.out.print("Escriba un número del 1 al 9: ");
                numero = scanner.nextInt();
                if (numero < 1 || numero > 9) {
                    System.out.println("Por favor, escriba un número del 1 al 9");
                }
            } while (numero < 1 || numero > 9);

            // Encuentro la posición correcta para el número.
            int indiceAuxiliar = i - 1;

            while (indiceAuxiliar >= 0 && arrayA[indiceAuxiliar] > numero) {
                arrayA[indiceAuxiliar + 1] = arrayA[indiceAuxiliar];
                indiceAuxiliar--;
            }

            arrayA[indiceAuxiliar + 1] = numero; // Inserto el número en la posición encontrada.
        }
        System.out.println("Array ordenado: " + Arrays.toString(arrayA)); // Muestro array ordenado

        //Localizar Mayor número de veces que se reptie un número y su valor.
        int MayorConcurrencia = 0;
        int ValorMayorConcurrencia = 0;
        for (int i = 0; i < arrayA.length; i++) {
            int contador = 1; // Comenzamos a contar desde 1 ya que ya estamos en una ocurrencia del número
            while (i + 1 < arrayA.length && arrayA[i] == arrayA[i + 1]) { //con este while localizo concurrencias consecutivas
                contador++;
                i++;
            }

            if (contador > MayorConcurrencia) {
                MayorConcurrencia = contador;
                ValorMayorConcurrencia = arrayA[i];
            }
        }

        System.out.println("El valor con mayor concurrencia es: " + ValorMayorConcurrencia + " y aparece " + MayorConcurrencia + " veces.");
        }
    }




