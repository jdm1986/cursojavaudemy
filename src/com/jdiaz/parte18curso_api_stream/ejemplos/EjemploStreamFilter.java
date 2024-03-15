package com.jdiaz.parte18curso_api_stream.ejemplos;

import com.jdiaz.parte18curso_api_stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamFilter {
    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream.of("Pato Gruzman","Paco Gonzalez","Pepa Flores","Pepe Mena","Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .filter(usuario -> usuario.getNombre().equals("Pepe"))
                .peek(System.out::println);


        List<Usuario> lista = nombres.collect(Collectors.toList());
        lista.forEach(System.out::println);

    }
}
