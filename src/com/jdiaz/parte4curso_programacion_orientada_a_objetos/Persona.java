package com.jdiaz.parte4curso_programacion_orientada_a_objetos;

public class Persona { //aquí por ejemplo, no es necesario un get & set, nos valdría con un toString y el constructor

    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return this.nombre + " " + this.apellido;
    }
}
