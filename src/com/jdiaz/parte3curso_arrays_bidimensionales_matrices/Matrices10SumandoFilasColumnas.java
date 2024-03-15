package com.jdiaz.parte3curso_arrays_bidimensionales_matrices;

public class Matrices10SumandoFilasColumnas {
    public static void main(String[] args) {

        int sumaFila = 0, sumaColumna = 0;

        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };


        for (int i = 0; i < a.length; i++) {
            sumaFila = 0;
            sumaColumna =0;
            for (int j = 0; j < a[i].length; j++) {
            sumaFila += a[i][j];
            sumaColumna += a[j][i];
            }
            System.out.println("sumaFila = " + sumaFila);
            System.out.println("sumaColumna = " + sumaColumna);
        }


    }
}

