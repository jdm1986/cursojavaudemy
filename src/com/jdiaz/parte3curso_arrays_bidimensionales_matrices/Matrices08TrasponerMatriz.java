package com.jdiaz.parte3curso_arrays_bidimensionales_matrices;

public class Matrices08TrasponerMatriz {
    public static void main(String[] args) {

        int [][] matrizA,matrizB;
        matrizA = new int[8][4];
        matrizB = new int[4][8];

        for (int i = 0;i<matrizA.length;i++){
            for(int j = 0;j<matrizA[i].length;j++){
                matrizA[i][j] = i+j*3;
                System.out.print(matrizA[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i<matrizA.length;i++){
            for(int j = 0; j <matrizA[i].length;j++){
                matrizB[j][i] = matrizA[i][j];
            }
        }
        System.out.println("Matriz trespuesta B");
        for (int [] fila : matrizB) {for(int elemnto:fila ){
            System.out.print(elemnto + "\t");
        }
            System.out.println();
        }
    }
}
