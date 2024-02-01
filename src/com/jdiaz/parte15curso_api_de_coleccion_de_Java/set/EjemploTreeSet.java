package com.jdiaz.parte15curso_api_de_coleccion_de_Java.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {

        Set<String> treeSet = new TreeSet<>((a,b) -> b.compareTo(a));

        treeSet.add("uno");
        treeSet.add("dos");
        treeSet.add("tres");
        treeSet.add("tres");
        treeSet.add("cuatro");
        treeSet.add("cinco");

        System.out.println("treeSet = " + treeSet);

        Set<Integer> numeros = new TreeSet<>(Comparator.reverseOrder());
        numeros.add(1);
        numeros.add(5);
        numeros.add(5);
        numeros.add(4);
        numeros.add(3);
        numeros.add(2);
        numeros.add(10);

        System.out.println("numeros = " + numeros);


    }
}
