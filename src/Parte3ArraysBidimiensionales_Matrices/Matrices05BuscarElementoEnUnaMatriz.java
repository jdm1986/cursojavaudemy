package Parte3ArraysBidimiensionales_Matrices;

public class Matrices05BuscarElementoEnUnaMatriz {
    public static void main(String[] args) {

        int [][] matrizDeEnteros = {
                {35,90,3,1978},
                {12,2020,10,5},
                {677,127,32767,1999}};

        int elementoABuscar = 2020;
        boolean encontrado = false;

        int i = 0;
        int j = 0;
        buscar: for (i = 0; i< matrizDeEnteros.length;i++){
            for (j = 0;j<matrizDeEnteros[i].length;j++){
                if (matrizDeEnteros[i][j] == elementoABuscar){
                    encontrado = true;
                    break buscar;
                }
            }
        }
        if (encontrado){
            System.out.println("Encontrado " + elementoABuscar + " en las coordenadas " + i+ ","+j);
        } else {
            System.out.println("No se encontró " + elementoABuscar + " en la matriz");
        }

    }
}
