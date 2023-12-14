package Parte2Arrays;

import java.util.Scanner;

public class Array12BuscarNumero {

    public static void main(String[] args) {

        int[] arregloNumeros = new int[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arregloNumeros.length; i++) {
            System.out.println("Ingresa el número " + (i + 1) + ":");
            arregloNumeros[i] = scanner.nextInt();
        }
        System.out.println("Ingresa un número a buscar");
        int numeroABuscar = scanner.nextInt();

        int i = 0;
        while (i < arregloNumeros.length && numeroABuscar != arregloNumeros[i]){
            i++;
        }
        if (i == arregloNumeros.length){
            System.out.println("No se ha encontrado "+ numeroABuscar);
        } else if (numeroABuscar == arregloNumeros[i]) {
            System.out.println("Se ha encontrado el " + numeroABuscar + " en la posición " + i);

        }


/*

        boolean encontrado = false;
        for (int i = 0; i < arregloNumeros.length; i++) {
            if (numeroABuscar == arregloNumeros[i]) {
                System.out.println("numeroABuscar = " + numeroABuscar + " y está en la posición " + i);
                encontrado = true;
                break;
            }
        }
        if(!encontrado) {
            System.out.println("No se ha encontrado el número");
        }
*/ //Usando For
    }
}
