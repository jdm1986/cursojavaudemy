package com.jdiaz.parte18curso_api_stream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamReduce {
    public static void main(String[] args) {

        Stream <String> nombres = Stream.of("Pato Gruzman","Paco Gonzalez","Pepa Flores","Pepe Mena","Pepe Garcia","Pato Gruzman","Pato Gruzman","Pato Gruzman")
                .distinct();

                String resultado  = nombres.reduce("",(a,b)-> a+ ", "+b);
                System.out.println("resultado = " + resultado);




    }
}
