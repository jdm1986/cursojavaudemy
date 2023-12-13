package Parte2;

import java.util.Arrays;
import java.util.Scanner;

public class Arreglos17InsertandoElementoMoviendoLosSiguientes {

    public static void main(String[] args) {

        int[] arregloA = new int[10];
        Scanner scanner = new Scanner(System.in);
        int elemento;
        int posicion;
        int ultimoElementoDelArregloA;

        for (int i = 0;i<arregloA.length;i++){
            System.out.print("Ingresa un número: ");
            arregloA[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arregloA));
        System.out.println();
        ultimoElementoDelArregloA = arregloA.length-1;

        System.out.println("Ingresa el valor del nuevo elemento");
        elemento = scanner.nextInt();
        System.out.println("Ingresa la posición donde quieres insertarlo de 0-9");
        posicion = scanner.nextInt();



        for (int i = arregloA.length-2;i >= posicion;i--){
            arregloA[i+1] = arregloA[i];
        }

        int [] arregloB = new int[arregloA.length+1];

        System.arraycopy(arregloA,0,arregloB,0,arregloA.length);

        arregloB[posicion] = elemento;

        arregloB[arregloB.length-1] = ultimoElementoDelArregloA;

        System.out.println(Arrays.toString(arregloB));


    }

}
