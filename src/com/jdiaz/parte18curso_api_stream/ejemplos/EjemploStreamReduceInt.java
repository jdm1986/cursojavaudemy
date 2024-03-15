package com.jdiaz.parte18curso_api_stream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamReduceInt {
    public static void main(String[] args) {

        Stream <Integer> nombres = Stream.of(5,10,15,20);

                int resultado  = nombres.reduce(0,(a,b)->a+b);
                System.out.println("resultado = " + resultado);




    }
}
