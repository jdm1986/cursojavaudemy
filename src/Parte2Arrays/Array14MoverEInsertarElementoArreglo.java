package Parte2Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array14MoverEInsertarElementoArreglo {
    public static void main(String[] args) {

        //EJEMPLO 1, {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} >>>>>> {10,1, 2, 3, 4, 5, 6, 7, 8, 9}

        int[] arregloNumeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int ultimoElemento = arregloNumeros[arregloNumeros.length - 1];
        System.out.println("valorAxuliar = " + ultimoElemento);


        for (int i = arregloNumeros.length - 1; i != 0; i--) {
            arregloNumeros[i] = arregloNumeros[i - 1];
        }
        arregloNumeros[0] = ultimoElemento;
        System.out.println(Arrays.toString(arregloNumeros));

        //EJEMPLO 2, insertar elemento y desplazar {1, 2, 3, 4, 5, 6, 7, 8, 9, 0} >>>>>>>> {1, 2, 3, 4, 5,100, 6, 7, 8, 9,}

        int[] arregloNumeros2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        int elementoAIntercambiar = arregloNumeros2[4];
        int nuevoElemento = 100;
        System.out.println("elemento a intercambiar = " + elementoAIntercambiar);

        for (int i = arregloNumeros2.length-1; i != 5; i--) {
            System.out.println("arregloNumeros2 posición = "+ i+" valor " + arregloNumeros2[i]);
            arregloNumeros2[i] = arregloNumeros2[i - 1];
            System.out.println("arregloNumeros2 posición = "+ i+" valor " + arregloNumeros2[i]);
        }
        arregloNumeros2[5] = nuevoElemento;
        System.out.println(Arrays.toString(arregloNumeros2));

        //Ejemplo 3 insertar elemento con Scanner

        Scanner scanner = new Scanner(System.in);
        System.out.println("Indique el número de elementos del array");
        int numeroElementos = scanner.nextInt();

        int [] arregloNumeros3 = new int [numeroElementos];

        for (int i = 0;i<arregloNumeros3.length-1;i++){ //solo vamos a rellenar 9 elementos, dejando el 10 por defecto en 0.
            System.out.print("Inserte elemento "+(i+1)+": ");
            arregloNumeros3[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arregloNumeros3));

        System.out.println("Indique el valor del elemento a insertar");
        int nuevoValor = scanner.nextInt();
        System.out.println("Indique la posición a insertar de 0 a "+(arregloNumeros3.length-1));
        int posicion = scanner.nextInt();
        System.out.println("posicion + nuevoValor  = " + posicion + nuevoValor );

        for (int i = arregloNumeros3.length -2; i >= posicion;i--){
            arregloNumeros3[i+1] = arregloNumeros3[i];
        }
        arregloNumeros3[posicion] = nuevoValor;
        System.out.println(Arrays.toString(arregloNumeros3));
    }



}

