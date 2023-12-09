package Parte2;

import java.util.Arrays;

public class ArreglosForIterando {
    public static void main(String[] args) {

        String[] productos = new String[7];//recuerda, los valores por defecto serían null por defecto si no se pobla.

        int totalIteraciones = productos.length;
        ;

        productos[0] = "Kingston Pendrive 64gb";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco duro SSD Samgsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generación";
        productos[6] = "Bicicleta Oxford";

        Arrays.sort(productos);

        System.out.println("================usando for convencional==========");

        for (int i = 0; i < totalIteraciones; i++) /*recuerda, también puedes poner productos.length pero menos eficiente*/ {
            System.out.println("para índice = " + i + " : " + productos[i]);
        }

        System.out.println("================usando foreach==========");

        for (String producto : productos
        ) {
            System.out.println("producto = " + producto);

        }

        System.out.println("================usando while==========");

        int i = 0;
        while (i < totalIteraciones) {
            System.out.println("para índice = " + i + " : " + productos[i]);
            i++;
        }

        System.out.println("================usando do while==========");

        int j = 0;
        do {
            System.out.println("para índice = " + j + " : " + productos[j]);
            j++;
        } while (j < totalIteraciones);

        System.out.println("================Poblando Array Vacío con For==========");

        int[] numeros = new int[10]; //recuerda, los valores por defecto son 0

        int totalNumerosArray = numeros.length;

        for (int k = 0; k < totalNumerosArray; k++) {
            numeros[k] = k * 3;
            System.out.println("numeros[k] = " + numeros[k]);


        }
    }
}
