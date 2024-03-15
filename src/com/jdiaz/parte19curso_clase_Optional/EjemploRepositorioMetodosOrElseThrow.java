package com.jdiaz.parte19curso_clase_Optional;

import com.jdiaz.parte19curso_clase_Optional.models.Computador;
import com.jdiaz.parte19curso_clase_Optional.repositorio.ComputadorRepositorio;
import com.jdiaz.parte19curso_clase_Optional.repositorio.Repositorio;

import java.util.Optional;

public class EjemploRepositorioMetodosOrElseThrow {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        Computador pc = repositorio.filtrar("rog").orElseThrow(()-> new IllegalStateException());

        System.out.println("pc = " + pc);

        String archivo = "documento.pdf";
        String extension = Optional.ofNullable(archivo)
                .filter(a -> a.contains("."))
                .map(a -> a.substring(archivo.lastIndexOf(".") + 1))
                .orElseThrow();
        System.out.println("extension = " + extension);

    }
}

