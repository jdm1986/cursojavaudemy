package com.jdiaz.parte3curso_arrays_bidimensionales_matrices.Ejercicios;

public class T19ImprimirUnaSilla {
    public static void main(String[] args) {

        int tamanioDeLaMatriz = 10;
        String[][] matriz = new String[tamanioDeLaMatriz][tamanioDeLaMatriz];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j == 0 || i == (matriz.length - 1) / 2 || j == (matriz.length - 1) && i > (matriz.length - 1) / 2) {
                    matriz[i][j] = "1";
                } else {
                    matriz[i][j] = "";
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
