package Parte3ArraysBidimiensionales_Matrices;

public class Matrices07MatrizTraspuesta {
    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        System.out.println("Matriz Original");
        for (int i = 0;i<matriz.length;i++){
            for(int j = 0; j<matriz[i].length;j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        int auxiliar = 0;
        for (int i =1;i<matriz.length;i++){
            for (int j = 0;j<i;j++){
                auxiliar = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = auxiliar;
            }
        }
        System.out.println("Matriz TRASPUESTA");
        for (int[] fila : matriz) {
            for(int elemento:fila){
                System.out.print(elemento + "\t");
            }
            System.out.println();
        }

    }
}

