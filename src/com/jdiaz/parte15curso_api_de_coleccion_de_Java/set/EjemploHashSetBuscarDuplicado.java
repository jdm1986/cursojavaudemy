package com.jdiaz.parte15curso_api_de_coleccion_de_Java.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetBuscarDuplicado {
    public static void main(String[] args) {

        String[] peces = {"Corvina", "Lenguado", "Pejerrey", "Corvina", "Robalo", "Atún", "Lenguado"};

        Set<String> unicos = new HashSet<>();

        for (int i = 0; i < peces.length; i++){
            if(!unicos.add(peces[i])){
                System.out.println("Elemento Duplicado: " + peces[i]);
            }
        }

        System.out.println(unicos.size() + " elementos no duplicados: " + unicos);
    }
}
