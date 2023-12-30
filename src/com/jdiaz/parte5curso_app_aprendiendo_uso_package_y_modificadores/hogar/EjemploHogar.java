package com.jdiaz.parte5curso_app_aprendiendo_uso_package_y_modificadores.hogar;

import com.jdiaz.parte5curso_app_aprendiendo_uso_package_y_modificadores.jardin.Perro;
import static com.jdiaz.parte5curso_app_aprendiendo_uso_package_y_modificadores.hogar.Persona.*;

public class EjemploHogar {
    public static void main(String[] args) {

        Persona persona = new Persona();
        Perro perro = new Perro();
        //perro.jugar no se puede invocar, solo se puede usar en su contexto, en jardín.

        String saludo = saludar();


    }
}
