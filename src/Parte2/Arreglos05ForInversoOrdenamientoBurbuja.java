package Parte2;

import java.util.Arrays;

public class Arreglos05ForInversoOrdenamientoBurbuja {
    /*public static void arregloInverso (String[] arreglo){
        System.out.println(">>>>>>>>>>>>>>>>================MUTANDO ARRAY==========<<<<<<<<<<<<<<<<<<<<");

        int totalIteraciones2 = arreglo.length;
        int totalIteraciones = arreglo.length;
        for (int i = 0; i < totalIteraciones2; i++) {
            String productoActual = arreglo[i];
            System.out.println("productoActual = " + productoActual);
            String productoInverso = arreglo[totalIteraciones - 1 - i];
            System.out.println("productoInverso = " + productoInverso);
            arreglo[i] = productoInverso;
            arreglo[totalIteraciones - 1 - i] = productoActual;
            totalIteraciones2--;

        }
    }*/
    public static void main(String[] args) {



        String[] productos = {"S", "K", "D", "A",
                "M", "C", "B"};
        System.out.println("Arrays.toString(productos) = " + Arrays.toString(productos));
        int totalIteraciones = productos.length;
        int contador = 0;

        for (int i = 0; i<totalIteraciones-1;i++){
            for (int j = 0;j<totalIteraciones-1;j++){
                if(productos[j].compareTo(productos[j+1])>0){

                    String auxiliar = productos[j];
                    productos[j] = productos[j+1];
                    productos[j+1] = auxiliar;
                    /*String variableAxuiliar = productos[i];
                    productos[i]=productos[j];
                    productos[j] = variableAxuiliar;*/

                    System.out.println("Arrays.toString(productos) = " + Arrays.toString(productos));
                }
                contador++;
            }
        }
        System.out.println("contador de iteraciones = " + contador);

        //Arrays.sort(productos); //primero ordenamos
        //arregloInverso(productos); //luego cambiamos a la inversa con nuestro algoritmo.
        //Collections.reverse(Arrays.asList(productos)); Usando la api de Java

        System.out.println("================usando for convencional==========");

        for (int i = 0; i < totalIteraciones; i++) {
            System.out.println("para índice = " + i + " : " + productos[i]);
        }


    }
}
