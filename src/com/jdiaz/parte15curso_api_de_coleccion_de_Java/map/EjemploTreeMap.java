package com.jdiaz.parte15curso_api_de_coleccion_de_Java.map;

import java.util.*;

public class EjemploTreeMap {
    public static void main(String[] args) {

        Map<String,Object> persona = new TreeMap<>(Comparator.comparing(String::length).reversed());
        persona.put("nombre","John");
        persona.put("apellido","Doe");
        persona.put("apellidoPaterno","Miliano"); // lo que no puede estar repetido es la clave.
        persona.put("email","jonh.doe@email.com");
        persona.put("edad","30");

        Map<String, String> direccion = new TreeMap<>();
        direccion.put("pasis","USA");
        direccion.put("estado","california");
        direccion.put("ciudad","santa barbara");
        direccion.put("calle", "One street");
        direccion.put("numero","120");

        persona.put("direccion",direccion);

        System.out.println("persona = " + persona);

    }
}
