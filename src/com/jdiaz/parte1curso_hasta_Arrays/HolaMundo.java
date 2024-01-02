package com.jdiaz.parte1curso_hasta_Arrays;

public class HolaMundo {

    public static void main(String[] args) {

        String saludar = "Hola mundo";

        System.out.println(saludar);
        System.out.println("Saludar en mayúsculas " + saludar.toUpperCase());


        int numero = 11;

        boolean valor = true;
        int numero22 = 5;


        if (valor) {
            System.out.println("numero = " + numero);
            numero22 = 10;
        }
        System.out.println("numero22 = " + numero22);

        var numero3 = 15;

        String nombre;

        nombre = "Andrés";

        if (numero > 10){
            nombre = "Juan";
        }
        System.out.println("nombre = " + nombre);
    }

}
