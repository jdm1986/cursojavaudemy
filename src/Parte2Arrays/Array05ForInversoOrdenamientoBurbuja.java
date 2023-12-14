package Parte2Arrays;

import java.util.Arrays;

public class Array05ForInversoOrdenamientoBurbuja {
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

    public static void ordenamientoBurbuja(Object [] arreglo){

        int contador = 0;

        for (int i = 0; i < arreglo.length - 1; i++) {

            for (int j = 0; j < arreglo.length - 1 - i; j++) {
                if (((Comparable<Object>) arreglo[j]).compareTo(arreglo[j + 1]) > 0) {

                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = auxiliar;
                }
                contador++;
            }
        }
        System.out.println("contador de iteraciones = " + contador);
    }

    public static void main(String[] args) {


        String[] productos = {"S", "K", "D", "A",
                "M", "C", "B"};
        System.out.println("Arrays.toString(productos) = " + Arrays.toString(productos));
        int totalIteraciones = productos.length;

        ordenamientoBurbuja(productos);

        /*for (int i = 0; i < totalIteraciones - 1; i++) {

            for (int j = 0; j < totalIteraciones - 1 - i; j++) {
                if (productos[j].compareTo(productos[j + 1]) > 0) {

                    String auxiliar = productos[j];
                    productos[j] = productos[j + 1];
                    productos[j + 1] = auxiliar;
                    *//*String variableAxuiliar = productos[i];
                    productos[i]=productos[j];
                    productos[j] = variableAxuiliar;*//*

                    System.out.println("Arrays.toString(productos) = " + Arrays.toString(productos));
                }
                contador++;
            }
        }*/


        //Arrays.sort(productos); //primero ordenamos
        //arregloInverso(productos); //luego cambiamos a la inversa con nuestro algoritmo.
        //Collections.reverse(Arrays.asList(productos)); Usando la api de Java

        System.out.println("================usando for convencional==========");

        for (int i = 0; i < totalIteraciones; i++) {
            System.out.println("para índice = " + i + " : " + productos[i]);
        }
        System.out.println("Arrays.toString(productos) = " + Arrays.toString(productos));

        Integer[] numeros = new Integer[4]; //recuerda, en un arreglo String, al ser de referencia no hay problema,
                                            //pero en el caso de primitivo Int, tengo que usar Integer por referencia.

        numeros[0] = 10;
        numeros[1] = Integer.valueOf("7");
        numeros[2] = 35;
        numeros[3] = -1;

        ordenamientoBurbuja(numeros); //si el arreglo "numeros" lo hubiese dejado con Int primitvo, daría error.

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("i = " + i + " : " + numeros[i]);
        }
    }
}
