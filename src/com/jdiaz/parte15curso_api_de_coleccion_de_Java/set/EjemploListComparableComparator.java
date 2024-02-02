package com.jdiaz.parte15curso_api_de_coleccion_de_Java.set;

import com.jdiaz.parte15curso_api_de_coleccion_de_Java.modelo.Alumno;

import java.util.*;

public class EjemploListComparableComparator {
    public static void main(String[] args) {



        List<Alumno> alumnoSet = new ArrayList<>();

        alumnoSet.add(new Alumno("Paco",5));
        alumnoSet.add(new Alumno("Bea",7));
        alumnoSet.add(new Alumno("Luis",9));
        alumnoSet.add(new Alumno("Jano",3));
        alumnoSet.add(new Alumno("Juan",10));
        alumnoSet.add(new Alumno("Lorena",6));
        alumnoSet.add(new Alumno("Zeus",2));
        alumnoSet.add(new Alumno("Zeus",3));
        alumnoSet.add(new Alumno("Lucas",2));
        alumnoSet.add(new Alumno("Laura",10));

        System.out.println("alumnoSet = " + alumnoSet);

        //Collections.sort(alumnoSet, (a,b)->a.getNota().compareTo(b.getNota())); hasta 3 formas de ordenar
        //alumnoSet.sort((a, b) -> a.getNota().compareTo(b.getNota())); con cambiar a por b de sitio te lo ordena al revés
        //alumnoSet.sort(Comparator.comparing(Alumno::getNota));
        alumnoSet.sort(Comparator.comparing(Alumno::getNota).reversed());

        System.out.println("Iterando con expresión lambda");

        alumnoSet.forEach(System.out::println);

    }
}
