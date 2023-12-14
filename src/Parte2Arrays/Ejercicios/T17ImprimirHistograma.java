package Parte2Arrays.Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class T17ImprimirHistograma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arrayA = new int[12];
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
        }
        System.out.println("Array ordenado: " + Arrays.toString(arrayA)); // Muestro array ordenado

        int contadorNumero1 = 0;
        int contadorNumero2 = 0;
        int contadorNumero3 = 0;
        int contadorNumero4 = 0;
        int contadorNumero5 = 0;
        int contadorNumero6 = 0;
        String representacioon = "*";

        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] == 1) {
                contadorNumero1++;
            } else if (arrayA[i] == 2) {
                contadorNumero2++;
            } else if (arrayA[i] == 3) {
                contadorNumero3++;
            } else if (arrayA[i]==4) {
                contadorNumero4++;
            } else if (arrayA[i] == 5) {
                contadorNumero5++;
            } else if (arrayA[i]==6) {
                contadorNumero6++;
            }
        }
        System.out.println("Histograma:");
        System.out.println("1: " + "*".repeat(contadorNumero1));
        System.out.println("2: " + "*".repeat(contadorNumero2));
        System.out.println("3: " + "*".repeat(contadorNumero3));
        System.out.println("4: " + "*".repeat(contadorNumero4));
        System.out.println("5: " + "*".repeat(contadorNumero5));
        System.out.println("6: " + "*".repeat(contadorNumero6));
    }

}

