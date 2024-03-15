package com.jdiaz.parte18curso_api_stream.ejemplos;

import com.jdiaz.parte18curso_api_stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamDistinctUusuario {
    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream.of("Pato Gruzman", "Paco Gonzalez", "Pepa Flores", "Pepe Mena", "Pepe Garcia", "Pato Gruzman")

                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .distinct();


        nombres.forEach(System.out::println);
    }


}

