package com.jdiaz.parte18curso_api_stream.ejemplos;

import com.jdiaz.parte18curso_api_stream.ejemplos.models.Usuario;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamFilterAnyMatch {
    public static void main(String[] args) {

        boolean existe = Stream
                .of("Pato Gruzman", "Paco Gonzalez", "Pepa Flores", "Pepe Mena", "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                .anyMatch(u -> u.getId().equals(1));

        System.out.println(existe);

        /*List<Usuario> lista = Arrays.asList(new Usuario("Pato", "Gruzman"),
                new Usuario("Paco", "Gonzalez"),
                new Usuario("Pepa", "Flores"),
                new Usuario("Pepe", "Mena"),
                new Usuario("Pepe", "Garcia"));
        
        boolean resultado = false;
        for (Usuario u : lista) {
            if (u.getId().equals(3)) {
                resultado = true;
                break;
            }
            System.out.println(resultado);
        }*/

    }
}
