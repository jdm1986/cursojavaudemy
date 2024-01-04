package com.jdiaz.parte8curso_poo_herencia;

public class EjemploHerencia {
    public static void main(String[] args) {

        Alumno alumno = new Alumno();

        alumno.setNombre("Andres");
        alumno.setApellido("Guzman");

        Profesor profesor = new Profesor();
        profesor.setNombre("Luci");
        profesor.setApellido("Pérez");
        profesor.setAsignatura("Matemáticas");

        System.out.println(alumno.getNombre() + " " + alumno.getApellido());
        System.out.println("Profesor de " + profesor.getAsignatura() + " " + profesor.getNombre() + " " + profesor.getApellido());


    }
}
