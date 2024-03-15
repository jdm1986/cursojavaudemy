package com.jdiaz.parte1curso_hasta_Arrays;

public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        
        
        String archivo = "alguna_imagen.pdf";
        int i = archivo.lastIndexOf(".");
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(archivo.length()-4) = " + archivo.substring(archivo.length()-4));
        System.out.println("archivo teniendo en cuenta el indexof = " + archivo.substring(i));


        
    }
}
