package com.jdiaz.parte18curso_api_stream.ejemplos;

import com.jdiaz.parte18curso_api_stream.ejemplos.models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamFilterCount {
    public static void main(String[] args) {

        long cantidad = Stream
                .of("Pato Gruzman", "Paco Gonzalez", "Pepa Flores", "Pepe Mena", "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                .count();

        System.out.println(cantidad);



    }
}
