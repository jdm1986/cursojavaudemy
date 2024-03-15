package com.jdiaz.parte19curso_clase_Optional;

import com.jdiaz.parte19curso_clase_Optional.models.Computador;
import com.jdiaz.parte19curso_clase_Optional.repositorio.ComputadorRepositorio;
import com.jdiaz.parte19curso_clase_Optional.repositorio.Repositorio;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class EjemploRepositorioMetodosOrElse {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        //Computador defecto = new Computador("Hp Omen", "La0001");

        Computador pc = repositorio.filtrar("rog2").orElse(valorDefecto());

        System.out.println("pc = " + pc);
        
        pc = repositorio.filtrar("macbook pro").orElseGet(()->{return valorDefecto();}); //el orElseGet es mucho más optimizado y no gasta tanto recurso en caso de que encuentre el objeto en el repositorio.
        System.out.println("pc = " + pc);



    }

    public static Computador valorDefecto(){
        System.out.println("Obteniendo valor por defecto!");
        return new Computador("Hp Omen", "La0001");
    }
}
