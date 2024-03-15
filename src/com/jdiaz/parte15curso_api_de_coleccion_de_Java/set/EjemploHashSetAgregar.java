package com.jdiaz.parte15curso_api_de_coleccion_de_Java.set;

import java.util.HashSet;

public class EjemploHashSetAgregar {
    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();

        System.out.println(hs.add("uno"));
        System.out.println(hs.add("dos"));
        System.out.println(hs.add("tres"));
        System.out.println(hs.add("cuatro"));
        System.out.println(hs.add("cinco"));
        System.out.println("hs = " + hs);

        boolean b = hs.add("tres");
        System.out.println("Permite elementos duplicados = " + b);
        System.out.println("hs = " + hs);


    }
}
