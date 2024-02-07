package com.jdiaz.parte18curso_api_stream.ejemplos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamMap {
    public static void main(String[] args) {

        Stream<String> nombres = Stream
                .of("Pato", "Paco", "Pepa", "Pepe")
                .map(String::toUpperCase)
                .peek(System.out::println) //el inspeccionador del Stream hasta aquí lo deja en Mayúscula
                .map(String::toLowerCase);

        List<String> listaDeNombres = nombres.collect(Collectors.toList()); // luego convertimos el stream en una lista a través del método collect y al recorrerlo muestra en minúscula.
        listaDeNombres.forEach(System.out::println);
        //nombres.forEach(System.out::println);




    }
}
