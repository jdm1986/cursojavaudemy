package com.jdiaz.parte3curso_arrays_bidimensionales_matrices.Ejercicios;

public class T18ImprimirUnaX {
    public static void main(String[] args) {

        int tamanioDeLaMatriz = 5;

        String[][] matriz = new String[tamanioDeLaMatriz][tamanioDeLaMatriz];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j || i+j == tamanioDeLaMatriz-1) {
                    matriz[i][j] = "X";
                } else {
                    matriz[i][j] = "_";
                }

            }
        }
        for (String[] fila : matriz) {
            for (String elemento : fila) {
                System.out.print(elemento + "\t");
            }
            System.out.println();
        }
    }
}

