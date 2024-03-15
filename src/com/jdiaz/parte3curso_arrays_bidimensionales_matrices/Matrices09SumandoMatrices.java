package com.jdiaz.parte3curso_arrays_bidimensionales_matrices;

public class Matrices09SumandoMatrices {
    public static void main(String[] args) {

        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] b = {
                {10, 20, 30},
                {40, 50, 60,},
                {70, 80, 90}
        };

        int[][] suma = new int[3][3];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                suma[i][j] = (a[i][j]) + (b[i][j]);
            }
        }
        for (int[] fila : suma) {
            for (int elemento : fila) {
                System.out.print(elemento + "\t");
            }
            System.out.println();

        }
    }
}
