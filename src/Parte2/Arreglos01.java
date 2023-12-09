package Parte2;

import java.util.Arrays;

public class Arreglos01 {
    public static void main(String[] args) {

        String [] productos = new String[7];//recuerda, los valores por defecto serían null por defecto si no se pobla.

        productos[0] = "Kingston Pendrive 64gb";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco duro SSD Samgsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generación";
        productos[6] = "Bicicleta Oxford";

        Arrays.sort(productos);

        String producto1 = productos[0];
        String producto2 = productos[1];

        System.out.println("productos[0] = " + producto1);
        System.out.println("productos[1] = " + producto2);
        System.out.println("productos[2] = " + productos[2]);
        System.out.println("productos[3] = " + productos[3]);
        System.out.println("productos[4] = " + productos[4]);
        System.out.println("productos[5] = " + productos[5]);
        System.out.println("productos[6] = " + productos[6]);

        int[] numeros = new int[4]; //recuerda, los valores por defecto son 0

        numeros[0] = 10;
        numeros[1] = Integer.valueOf("7");
        numeros[2] = 35;
        numeros[3] = -1;
        //numeros[4] = 5; ===>> esto daría un erro en tiempo de ejecución, ya que los arreglos necesitan cumplir con un número
        //determinado de elementos

        Arrays.sort(numeros);

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[numeros.length-1];//así accedo al último elemento.

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);

        System.out.println("numeros = " + numeros[0]);






    }
}
