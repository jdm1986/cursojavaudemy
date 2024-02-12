package com.jdiaz.parte18curso_api_stream.ejemplos;

import com.jdiaz.parte18curso_api_stream.ejemplos.models.Factura;
import com.jdiaz.parte18curso_api_stream.ejemplos.models.Usuario;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamFlatMapFactura {
    public static void main(String[] args) {


        Usuario usuario1 = new Usuario("Pepe", "Garcia");
        Usuario usuario2 = new Usuario("Angel", "Lopez");

        usuario1.addFactura(new Factura("Compras Tecnologia"));
        usuario1.addFactura(new Factura("Muebles"));

        usuario2.addFactura(new Factura("Bicicleta"));
        usuario2.addFactura(new Factura("NoteBook"));

        List<Usuario> usuarios = Arrays.asList(usuario1,usuario2);

        usuarios.stream().flatMap(usuario -> usuario.getFacturas().stream())
                .forEach(factura -> System.out.println(factura.getDescripcion().concat(" : cliente ")
                        .concat(factura.getUsuario().toString())));

        /*for (Usuario u : usuarios) {
            for (Factura f : u.getFacturas()) {
                System.out.println(f.getDescripcion());
            }
        }*/ //Usando for anidado convencional se pueden listar todas las facturas.

    }
}
