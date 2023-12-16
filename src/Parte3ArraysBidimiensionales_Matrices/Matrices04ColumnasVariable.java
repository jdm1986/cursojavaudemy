package Parte3ArraysBidimiensionales_Matrices;

public class Matrices04ColumnasVariable {

    public static void main(String[] args) {

        int[][] matriz = new int[3][]; //cuando es variable


        matriz[0] = new int[2];
        matriz[1] = new int[3]; //en cada fila se debe especificar la cantidad de elementos.
        matriz[2] = new int[4];

        System.out.println("Cantidad filas = " + matriz.length);
        System.out.println("fila 0 ===>> columnas = " + matriz[0].length);
        System.out.println("fila 1 ===>> columnas = " + matriz[1].length);
        System.out.println("fila 2 ===>> columnas = " + matriz[2].length);

        System.out.println();

        for (int i = 0;i<matriz.length;i++){
            for(int j = 0;j<matriz[i].length;j++){
                matriz[i][j] = (i*j);
            }
        }

        System.out.println("FOR-EACH");

        for (int[] fila :
                matriz) {
            for (int elemento : fila){
                System.out.print(elemento+ "\t");;
            }
            System.out.println();
        }
        System.out.println("FOR NORMAL");
        System.out.println();
        for (int i = 0;i<matriz.length;i++){
            for (int j = 0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
