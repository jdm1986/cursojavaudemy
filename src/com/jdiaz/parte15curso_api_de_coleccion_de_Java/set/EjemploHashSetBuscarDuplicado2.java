package com.jdiaz.parte15curso_api_de_coleccion_de_Java.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetBuscarDuplicado2 {
    public static void main(String[] args) {

        String[] peces = {"Corvina", "Lenguado", "Pejerrey", "Corvina", "Robalo", "Atún", "Lenguado"};

        Set<String> unicos = new HashSet<>();
        Set<String> duplicados = new HashSet<>();

        for (int i = 0; i < peces.length; i++){
            if(!unicos.add(peces[i])){
                duplicados.add(peces[i]);

            }
        }
        unicos.removeAll(duplicados);

        System.out.println("Unicos: " + unicos);
        System.out.println("duplicados = " + duplicados);
    }
}
