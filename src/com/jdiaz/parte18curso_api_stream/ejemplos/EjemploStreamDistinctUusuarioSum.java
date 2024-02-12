package com.jdiaz.parte18curso_api_stream.ejemplos;

import com.jdiaz.parte18curso_api_stream.ejemplos.models.Usuario;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamDistinctUusuarioSum {
    public static void main(String[] args) {

        IntStream largonombres = Stream
                .of("Pato Gruzman", "Paco Gonzalez", "Pepa Flores", "Pepe Mena", "Pepe Garcia", "Pato Gruzman")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .distinct()
                .mapToInt(u -> u.toString().length())
                        .peek(System.out::println);


        //largonombres.forEach(System.out::println);
        IntSummaryStatistics stats = largonombres.summaryStatistics();
        System.out.println("stats.getSum() = " + stats.getSum());
        System.out.println("stats.getMax() = " + stats.getMax());
        System.out.println("stats.getMin() = " + stats.getMin());
        System.out.println("stats.getAverage() = " + stats.getAverage());
    }


}

