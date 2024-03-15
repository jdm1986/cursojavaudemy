package com.jdiaz.parte19curso_clase_Optional;

import com.jdiaz.parte19curso_clase_Optional.models.Computador;
import com.jdiaz.parte19curso_clase_Optional.models.Fabricante;
import com.jdiaz.parte19curso_clase_Optional.models.Procesador;
import com.jdiaz.parte19curso_clase_Optional.repositorio.ComputadorRepositorio;
import com.jdiaz.parte19curso_clase_Optional.repositorio.Repositorio;

public class EjemploRepositorioMap_Filter {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        String pc = repositorio.filtrar("asus")
                .flatMap(Computador::getProcesador)
                .flatMap(Procesador::getFabricante)
                .filter(fabricante -> "intel".equalsIgnoreCase(fabricante.getNombre()))
                .map(Fabricante::getNombre)
                .orElse("Desconocido");

        System.out.println(pc);


    }


}
