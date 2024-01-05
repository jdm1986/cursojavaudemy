package com.jdiaz.parte8curso_poo_herencia.main;

import com.jdiaz.parte8curso_poo_herencia.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class EjemploHerenciaConstructores {
    public static void main(String[] args) {

        System.out.println("============= Creando la instancia de la clase Alumno ==============");

        Alumno alumno = new Alumno("Andres", "Guzman", 13, "Instituto nacional");
        alumno.setNotaLengua(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematicas(4.9);
        alumno.setEmail("andres@correo.org");


        System.out.println("============= Creando la instancia de la clase Alumno Internacional ==============");

        AlumnoInternacional alumnoInt = new AlumnoInternacional("Peter", "Maison", "Autralia");

        alumnoInt.setEdad(15);
        alumnoInt.setInstituto("Instituto Nacional");
        alumnoInt.setNotasIdiomas(6.8);
        alumnoInt.setNotaLengua(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematicas(6.5);
        alumnoInt.setEmail("petermaison@gmail.com");

        System.out.println("============= Creando la instancia de la clase Profesor ==============");

        Profesor profesor = new Profesor("Luci", "Perez", "Matemáticas");
        profesor.setEdad(37);
        profesor.setEmail("profeseraluciperez@gmail.com");

        System.out.println("==================== SEPARADOR DE IMPRIMIR ====================");

        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);


    }

    public static void imprimir(Persona persona) {
        System.out.println("@@@@ IMPRIMIR DATOS EN COMÚN CON TIPO PERSONA @@@@");
        System.out.println("nombre: " + persona.getNombre()
                + ", apellido: " + persona.getApellido()
                + ", edad " + persona.getEdad()
                + ", email " + persona.getEmail());
        if (persona instanceof Alumno) {
            System.out.println("-----Imprimiendo los datos del Tipo Alumno----");
            System.out.println("Instituto: " + ((Alumno) persona).getInstituto());
            System.out.println("Nota matemáticas: " + ((Alumno) persona).getNotaMatematicas());
            System.out.println("Nota historia: " + ((Alumno) persona).getNotaHistoria());
            System.out.println("Nota lengua: " + ((Alumno) persona).getNotaLengua());

            if (persona instanceof AlumnoInternacional) {
                System.out.println("----Imprimiendo los datos del Tipo ALUMNO INTERNACIONAL----");
                System.out.println("Nota idiomas: " + ((AlumnoInternacional) persona).getNotasIdiomas());
                System.out.println("Pais: " + ((AlumnoInternacional) persona).getPais());
            }
        }

        if (persona instanceof Profesor) {
            System.out.println("----Imprimiendo los datos del Tipo Profesor----");
            System.out.println("Asignatura: " + ((Profesor) persona).getAsignatura());
        }
        System.out.println("============================ SEPARADOR ================================");
    }
}

