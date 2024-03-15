package com.jdiaz.parte15curso_api_de_coleccion_de_Java.set;

import com.jdiaz.parte15curso_api_de_coleccion_de_Java.modelo.Alumno;

import java.util.*;

public class EjemploHashSetUnicidad {
    public static void main(String[] args) {

        Set<Alumno> alumnoSet = new HashSet<>();

        //List<Alumno> alumnoSet = new ArrayList<>();

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

        System.out.println("Utilizando un for clásico");

        /*for (int i = 0; i < alumnoSet.size();i++){
            Alumno a = alumnoSet.get(i);
            System.out.println(a.getNombre());
        }*/

        System.out.println("Iterando usando un foreach");

        /*for (int i = 0; i<alumnoSet.toArray().length;i++){
            System.out.println(alumnoSet.toArray()[i]);
        }*/
        for (Alumno alumnos : alumnoSet) {
            System.out.println(alumnos);
        }

        System.out.println("Iterando usando while e iterator");

        Iterator<Alumno> iterator = alumnoSet.iterator();
        while (iterator.hasNext()){
            Alumno a = iterator.next();
            System.out.println(a.getNombre());
        }

        System.out.println("Iterando con expresión lambda");

        alumnoSet.forEach(System.out::println);

    }
}
