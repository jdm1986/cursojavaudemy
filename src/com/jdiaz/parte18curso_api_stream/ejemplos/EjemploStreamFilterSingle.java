package com.jdiaz.parte18curso_api_stream.ejemplos;

import com.jdiaz.parte18curso_api_stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamFilterSingle {
    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream.of("Pato Gruzman","Paco Gonzalez","Pepa Flores","Pepe Mena","Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .filter(usuario -> usuario.getNombre().equals("Pepex"))
                .peek(System.out::println);


        Optional<Usuario> usuario = nombres.findFirst();
        //System.out.println("usuario = " + usuario.orElse(new Usuario("John","Doe")).getNombre());
        //System.out.println("usuario = " + usuario.orElseGet(()-> new Usuario("John","Doe")).getNombre());
        if (usuario.isPresent()){
            System.out.println(usuario.get().getNombre());
        } else {
            System.out.println("No se encontró el objeto");
        }


    }
}
