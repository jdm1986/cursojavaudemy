package Parte2Arrays;

import java.util.Arrays;

public class Array04ForInversoMutable {
    public static void arregloInverso (String[] arreglo){
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
    }
    public static void main(String[] args) {



        String[] productos = {"Kingston Pendrive 64gb", "Samsung Galaxy", "Disco duro SSD Samgsung Externo", "Asus Notebook",
                "Macbook Air", "Chromecast 4ta generación", "Bicicleta Oxford"};

        int totalIteraciones = productos.length;


        Arrays.sort(productos); //primero ordenamos
        arregloInverso(productos); //luego cambiamos a la inversa con nuestro algoritmo.
        //Collections.reverse(Arrays.asList(productos)); Usando la api de Java

        System.out.println("================usando for convencional==========");

        for (int i = 0; i < totalIteraciones; i++) {
            System.out.println("para índice = " + i + " : " + productos[i]);
        }


    }
}
