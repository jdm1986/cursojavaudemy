package Parte2;

import java.util.Arrays;
import java.util.Scanner;

public class Arreglos17InsertandoElementoMoviendoLosSiguientes {

    public static void main(String[] args) {

        int[] arrayA = new int[10];
        Scanner scanner = new Scanner(System.in);
        int elemento;
        int posicion;
        int ultimoElementoDelArrayA;

        for (int i = 0; i < arrayA.length; i++) {
            System.out.print("Ingresa un número: ");
            arrayA[i] = scanner.nextInt();
        }


        System.out.println(Arrays.toString(arrayA));
        System.out.println();
        ultimoElementoDelArrayA = arrayA[arrayA.length - 1];

        System.out.println("Ingresa el valor del nuevo elemento");
        elemento = scanner.nextInt();
        System.out.println("Ingresa la posición donde quieres insertarlo de 1-10");
        posicion = scanner.nextInt() - 1;


        for (int i = arrayA.length - 2; i >= posicion; i--) {
            arrayA[i + 1] = arrayA[i];
        }

        int[] arrayB = new int[arrayA.length + 1];

        System.arraycopy(arrayA, 0, arrayB, 0, arrayA.length);

        arrayB[posicion] = elemento;

        arrayB[arrayB.length - 1] = ultimoElementoDelArrayA;

        System.out.println(Arrays.toString(arrayB));
    }

}
