package com.jdiaz.parte3curso_arrays_bidimensionales_matrices;

public class Matrices06MatricesSimétricas {
    public static void main(String[] args) {

        boolean simetrica = true;

        int[][] matriz = {
                {1, 2, 3, 4},
                {2, 1, 0, 5},
                {3, 0, 1, 6},
                {4, 5, 6, 7}
        };
        // SE PODRÍA HACER CON FOR, PERO EN ESTE CASO USO WHILE.
        int i,j;
        i=0;
        while (i<matriz.length && simetrica==true){
            j=0;
            while (j <i && simetrica == true){
                if(matriz[i][j] != matriz[j][i]){
                    simetrica = false;
                }
                j++;
            }
            i++;
        }
        if (simetrica){
            System.out.println("La matriz es simética");
        } else {
            System.out.println("La matriz no es simética");
        }
    }
}
