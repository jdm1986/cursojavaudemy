package com.jdiaz.parte18curso_api_stream.ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStream {
    public static void main(String[] args) {

        //Stream<String> nombres = Stream.of("Pato", "Paco", "Pepa", "Pepe");
        //nombres.forEach(System.out::println);

        //String[] arrayDeNombres = {"Pato", "Paco", "Pepa", "Pepe"};
        //Stream <String >nombres = Arrays.stream(arrayDeNombres);
        //nombres.forEach(System.out::println);

        //Stream<String> nombres = Stream.<String>builder().add("Pato").add("Paco").add("Pepa").add("Pepe").build();
        //nombres.forEach(System.out::println);

        List<String> lista = new ArrayList<>();
        lista.add("Paco");
        lista.add("Pato");
        lista.add("Pepa");
        lista.add("Pepe");

        //Stream<String> nombres = lista.stream();
        //nombres.forEach(System.out::println);

        lista.stream().forEach(System.out::println);


    }
}
