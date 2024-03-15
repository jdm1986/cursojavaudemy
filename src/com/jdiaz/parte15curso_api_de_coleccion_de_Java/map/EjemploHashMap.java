package com.jdiaz.parte15curso_api_de_coleccion_de_Java.map;

import java.util.*;

public class EjemploHashMap {
    public static void main(String[] args) {

        Map<String,Object> persona = new HashMap<>();
        System.out.println("contiene elementos = " + !persona.isEmpty());

        persona.put(null,"1234" );
        persona.put("nombre","John");
        persona.put("apellido","Doe");
        persona.put("apellidoPaterno","Miliano"); // lo que no puede estar repetido es la clave.
        persona.put("email","jonh.doe@email.com");
        persona.put("edad","30");

        Map<String, String> direccion = new HashMap<>();
        direccion.put("pasis","USA");
        direccion.put("estado","california");
        direccion.put("ciudad","santa barbara");
        direccion.put("calle", "One street");
        direccion.put("numero","120");

        persona.put("direccion",direccion);


        System.out.println("persona = " + persona);

        String nombre = (String) persona.get("nombre");
        System.out.println("nombre = " + nombre);
        String apellido = (String) persona.get("apellido");
        System.out.println("apellido = " + apellido);

        Map<String,String> direccionPersona = (Map<String, String>) persona.get("direccion");

        String pais = direccionPersona.get("pais");
        String ciudad = direccionPersona.get("ciudad");
        String barrio = direccionPersona.getOrDefault("barrio", "La playa");

        System.out.println("El pais de " + nombre + "es: " + pais);
        System.out.println("La ciudad de " + nombre + "es: " + ciudad);
        System.out.println("El barrrio de " + nombre + "es: " + barrio);

        //String valorApellido = persona.remove("apellidoPaterno"); ---- Se puede eliminar siendo Tipo String solo mediante la clave.
        boolean valorApellido = persona.remove("apellidoPaterno","Miliano");
        System.out.println("eliminado " + valorApellido);
        System.out.println("persona = " + persona);

        boolean b2 = persona.containsKey("apellido");
        System.out.println("b2 = " + b2);

        boolean b3 = persona.containsValue("jonh.doe@email.com");
        System.out.println("b3 = " + b3);

        Collection<Object> valores = persona.values();
        System.out.println("========================================================== values");
        for (Object valor : valores) {
            System.out.println("valor = " + valor);
        }
        System.out.println("========================================================== key set");
        Set<String> llaves = persona.keySet();
        for (String llave : llaves) {
            System.out.println("llave = " + llave);
        }
        System.out.println("========================================================== entrySet");
        for (Map.Entry<String, Object> par: persona.entrySet()){
            System.out.println("par.getKey() + \" => \" + par.getValue() = " + par.getKey() + " => " + par.getValue());
        }
        System.out.println("");

        System.out.println("========================================================== keySet");
        System.out.println("");

        for (String llave : persona.keySet()) {
            String valor = (String) persona.get(llave);
            System.out.println("llave + \" => \" + valor = " + llave + " => " + valor);
        }
        System.out.println("========================================================== java8Foreach");

        persona.forEach((llave, valor) -> System.out.println("llave + \" => \" + valor = " + llave + " => " + valor));

        System.out.println("==========================================================");

        System.out.println("total: " + persona.size());
        System.out.println("contiene elementos = " + !persona.isEmpty());

        System.out.println("========================================================== Remplazar valor");

        boolean b4 = persona.replace("nombre","John","Andrés");
        System.out.println("b4 = " + b4);
        System.out.println("persona = " + persona);
    }
}
