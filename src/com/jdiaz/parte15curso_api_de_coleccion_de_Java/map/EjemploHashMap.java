package com.jdiaz.parte15curso_api_de_coleccion_de_Java.map;

import java.util.HashMap;
import java.util.Map;

public class EjemploHashMap {
    public static void main(String[] args) {

        Map<String,String> persona = new HashMap<>();

        persona.put(null,"1234" );
        persona.put("nombre","John");
        persona.put("apellido","Doe");
        persona.put("apellidoPaterno","Doe"); // lo que no puede estar repetido es la clave.
        persona.put("email","jonh.doe@email.com");
        persona.put("edad","30");

        System.out.println("persona = " + persona);

        String nombre = persona.get("nombre");
        System.out.println("nombre = " + nombre);
        String apellido = persona.get("apellido");
        System.out.println("apellido = " + apellido);

    }
}
