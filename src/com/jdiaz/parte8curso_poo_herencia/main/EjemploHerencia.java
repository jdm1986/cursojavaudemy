package com.jdiaz.parte8curso_poo_herencia.main;
import com.jdiaz.parte8curso_poo_herencia.*;

public class EjemploHerencia {
    public static void main(String[] args) {

        System.out.println("============= Creando la instancia de la clase Alumno ==============");

        Alumno alumno = new Alumno();
        alumno.setNombre("Andrés"); // alumno.nombre = "Andres" ==>> podría accceder a atributos protegidos siempre que estén dentro del mismo package
        alumno.setApellido("Guzman");
        alumno.setInstituto("Instituto Nacional");
        alumno.setNotaLengua(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematicas(4.9);

        System.out.println("============= Creando la instancia de la clase Alumno Internacional ==============");

        AlumnoInternacional alumnoInt = new AlumnoInternacional();

        alumnoInt.setNombre("Peter");
        alumnoInt.setApellido("Maison");
        alumnoInt.setPais("Autralia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstituto("Instituto Nacional");
        alumnoInt.setNotasIdiomas(6.8);
        alumnoInt.setNotaLengua(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematicas(6.5);

        System.out.println("============= Creando la instancia de la clase Profesor ==============");

        Profesor profesor = new Profesor();
        profesor.setNombre("Luci");
        profesor.setApellido("Pérez");
        profesor.setAsignatura("Matemáticas");

        System.out.println("============== --- ===========");

        System.out.println(alumno.getNombre()
                + " " + alumno.getApellido()
                + " " + alumno.getInstituto());
        System.out.println(alumnoInt.getNombre()
                + " " + alumnoInt.getApellido()
                + " " + alumnoInt.getInstituto()
                + " " + alumnoInt.getPais());


        System.out.println("Profesor de " + profesor.getAsignatura()
                + " " + profesor.getNombre()
                + " " + profesor.getApellido());

        Class clase = alumnoInt.getClass();

        while(clase.getSuperclass() != null){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " es una clase hija de la clase padre " + padre);
            clase = clase.getSuperclass();
        }
    }
}
