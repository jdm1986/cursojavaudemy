package com.jdiaz.parte18curso_api_stream.ejemplos;

import com.jdiaz.parte18curso_api_stream.ejemplos.models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamFlatMap {
    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream
                .of("Pato Gruzman","Paco Gonzalez","Pepa Flores","Pepe Mena","Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .flatMap(usuario -> {
                    if(usuario.getNombre().equalsIgnoreCase("Pepe")){
                        return Stream.of(usuario);
                    }
                    return Stream.empty();

                    /* La diferencia entre el map y el flatmap es que el map devuelve un objeto común y corriente.
                    Por ejemplo si el Stream es de usuario, devuelve un objeto usuario modificado por ejemplo.
                    Sin embargo el flatmap devuelve un Stream de ese objeto (otro flujo/salida)
                     */

                })
                .peek(System.out::println);


        //nombres.forEach(System.out::println);
        System.out.println(nombres.count());
    }
}
