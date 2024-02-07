package com.jdiaz.parte18curso_api_stream.ejemplos;

import com.jdiaz.parte18curso_api_stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamDistinct {
    public static void main(String[] args) {

        Stream <String> nombres = Stream.of("Pato Gruzman","Paco Gonzalez","Pepa Flores","Pepe Mena","Pepe Garcia","Pato Gruzman","Pato Gruzman","Pato Gruzman")
                .distinct();
                nombres.forEach(System.out::println);




    }
}
