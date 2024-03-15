package com.jdiaz.parte2curso_arrays;

import java.util.Arrays;

public class Array03ForInverso {
    public static void main(String[] args) {

        //String[] productos = new String[7];//recuerda, los valores por defecto serían null por defecto si no se pobla.
        String[] productos = {"Kingston Pendrive 64gb","Samsung Galaxy","Disco duro SSD Samgsung Externo","Asus Notebook",
                "Macbook Air","Chromecast 4ta generación","Bicicleta Oxford"};
        int totalIteraciones = productos.length;
        ;

        /*productos[0] = "Kingston Pendrive 64gb";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco duro SSD Samgsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generación";
        productos[6] = "Bicicleta Oxford";*/

        Arrays.sort(productos);

        System.out.println("================usando for convencional==========");

        for (int i = 0; i < totalIteraciones; i++) /*recuerda, también puedes poner productos.length pero menos eficiente*/ {
            System.out.println("para índice = " + i + " : " + productos[i]);
        }
        System.out.println("================usando for convencional INVERSO ==========");
        for (int i = 0; i< totalIteraciones;i++){
            System.out.println("Para índice i " + (totalIteraciones-1-i) + " VALOR ===>>> " + productos[totalIteraciones-1-i]);
        }
        System.out.println("================usando for convencional INVERSO 2 con OPERADOR DECREMENTO ==========");
        for (int i = totalIteraciones-1; i >= 0;i--){
            System.out.println(" para i = " + i + " valor " + productos[i]);
        }

    }
}
