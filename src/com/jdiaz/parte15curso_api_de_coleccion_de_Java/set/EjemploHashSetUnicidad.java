package com.jdiaz.parte15curso_api_de_coleccion_de_Java.set;

import com.jdiaz.parte15curso_api_de_coleccion_de_Java.modelo.Alumno;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class EjemploHashSetUnicidad {
    public static void main(String[] args) {

        Set<Alumno> alumnoSet = new HashSet<>();

        alumnoSet.add(new Alumno("Paco",5));
        alumnoSet.add(new Alumno("Bea",7));
        alumnoSet.add(new Alumno("Luis",9));
        alumnoSet.add(new Alumno("Jano",3));
        alumnoSet.add(new Alumno("Juan",10));
        alumnoSet.add(new Alumno("Lorena",6));
        alumnoSet.add(new Alumno("Zeus",2));
        alumnoSet.add(new Alumno("Zeus",3));
        alumnoSet.add(new Alumno("Lucas",2));

        System.out.println("alumnoSet = " + alumnoSet);

    }
}
