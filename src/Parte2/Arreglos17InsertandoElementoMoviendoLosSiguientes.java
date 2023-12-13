package Parte2;

import javax.swing.table.AbstractTableModel;
import java.util.Arrays;
import java.util.Scanner;

public class Arreglos17InsertandoElementoMoviendoLosSiguientes {

    public static void main(String[] args) {
//un solo bucle

        int[] arrayA = {1, 2, 3, 4, 5};
        int nuevoElemento = 20;
        int posicion = 2;
        int[] arrayB = new int[arrayA.length + 1];

        System.arraycopy(arrayA, 0, arrayB, 0, arrayA.length);

        System.out.println(Arrays.toString(arrayB));

        for (int i = arrayA.length - 1; i >= posicion; i--) {
            arrayB[i + 1] = arrayA[i];
        }
        arrayB[posicion] = nuevoElemento;

        System.out.println(Arrays.toString(arrayB));

    }

}
