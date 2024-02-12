package com.jdiaz.parte18curso_api_stream.ejemplos;

import com.jdiaz.parte18curso_api_stream.ejemplos.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamListToStream {
    public static void main(String[] args) {

        List<Usuario> lista = new ArrayList<>();

        lista.add(new Usuario("Andres","Guzman"));
        lista.add(new Usuario("Luci","Martinez"));
        lista.add(new Usuario("Lalo","Mena"));
        lista.add(new Usuario("Exequiel","Doe"));
        lista.add(new Usuario("Pepe","Fernández"));
        lista.add(new Usuario("Cata","Perez"));
        lista.add(new Usuario("Bruce","Lee"));
        lista.add(new Usuario("Bruce","Willis"));

        Stream <String> nombres = lista.stream()
                .map(usuario -> usuario.getNombre().toUpperCase()
                .concat(" ")
                .concat(usuario.getApellido().toUpperCase()))
                .flatMap(nombre ->{
                    if(nombre.contains("bruce".toUpperCase())){
                        return Stream.of(nombre);
                    }
                    return Stream.empty();
                })
                .map(String::toLowerCase)
                .peek(System.out::println);
        System.out.println(nombres.count());

    }
}
