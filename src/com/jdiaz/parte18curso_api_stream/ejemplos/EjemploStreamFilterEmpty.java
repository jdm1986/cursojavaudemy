package com.jdiaz.parte18curso_api_stream.ejemplos;

import com.jdiaz.parte18curso_api_stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamFilterEmpty {
    public static void main(String[] args) {

        long count = Stream
                .of("Pato Gruzman","","Pepa Flores","Pepe Mena","")
                .filter(String::isEmpty)
                .peek(System.out::println)
                .count();

        System.out.println("Cantidad de cadenas vacías: " + count);
    }
}
