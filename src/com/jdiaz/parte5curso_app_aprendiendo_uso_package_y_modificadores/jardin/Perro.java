package com.jdiaz.parte5curso_app_aprendiendo_uso_package_y_modificadores.jardin;

import com.jdiaz.parte5curso_app_aprendiendo_uso_package_y_modificadores.hogar.Persona;

public class Perro {

    protected String nombre; //se puede dejar el modificador de acceso default si está la clase dentro del mismo package
    protected String raza; //se puede dejar el modificador de acceso default si está la clase dentro del mismo package

    String jugar(Persona persona){
        return persona.lanzarPelota();
    }

}
