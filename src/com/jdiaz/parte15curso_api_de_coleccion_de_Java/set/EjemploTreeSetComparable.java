package com.jdiaz.parte15curso_api_de_coleccion_de_Java.set;

import com.jdiaz.parte15curso_api_de_coleccion_de_Java.modelo.Alumno;

import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {

        Set<Alumno> alumnoSet = new TreeSet<>((a,b)-> b.getNota().compareTo(a.getNota()));

        alumnoSet.add(new Alumno("Paco",5));
        alumnoSet.add(new Alumno("Bea",7));
        alumnoSet.add(new Alumno("Luis",9));
        alumnoSet.add(new Alumno("Jano",3));
        alumnoSet.add(new Alumno("Zeus",4));
        alumnoSet.add(new Alumno("Zeus",4));
        alumnoSet.add(new Alumno("Juan",10));
        alumnoSet.add(new Alumno("Lorena",6));

        System.out.println("alumnoSet = " + alumnoSet);

    }
}
