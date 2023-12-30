package com.jdiaz.parte5curso_app_aprendiendo_uso_package_y_modificadores.jardin;
import com.jdiaz.parte5curso_app_aprendiendo_uso_package_y_modificadores.hogar.*; //forma de importarlo all.

import static com.jdiaz.parte5curso_app_aprendiendo_uso_package_y_modificadores.hogar.ColorPelo.*;
import static com.jdiaz.parte5curso_app_aprendiendo_uso_package_y_modificadores.hogar.Persona.*;

public class EjemploPaquetes {
    public static void main(String[] args) {


        Persona persona = new Persona(); //es necesario importar
        persona.setNombre("Andrés");
        persona.setApellido("Guzman");
        persona.setColorPelo(CAFE);
        System.out.println(persona.getNombre());
        Perro perro = new Perro(); // solo es necesario importar cuando están en distintos package.
        perro.nombre = "tobby";
        perro.raza = "bulldog"; //

        String jugando = perro.jugar(persona);
        System.out.println("Jugando = "+jugando);
        String saludo = saludar();
        System.out.println("saludo = " + saludo);

        String generoMujer = GENERO_FEMENINO;
        String generoHombre = GENERO_MASCULINO;


    }
}
