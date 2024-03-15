package com.jdiaz.parte19curso_clase_Optional;

import com.jdiaz.parte19curso_clase_Optional.models.Computador;
import com.jdiaz.parte19curso_clase_Optional.repositorio.ComputadorRepositorio;
import com.jdiaz.parte19curso_clase_Optional.repositorio.Repositorio;

import java.util.Optional;

public class EjemploRepositorio {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        repositorio.filtrar("rog").ifPresentOrElse(System.out::println,()-> System.out.println("No se encontró"));

        /*Optional <Computador> pc = repositorio.filtrar("asus og");

        if (pc.isPresent()){
            System.out.println(pc.get());
        } else {
            System.out.println("No se encontró");
        }*/



    }
}
