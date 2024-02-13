package com.jdiaz.ejercicios;

import java.util.stream.IntStream;

public class EjercicioModificarFlujoYDevolverLaSuma {
    public static void main(String[] args) {

        int [] array = IntStream.rangeClosed(1,100).toArray();

        double resultado  = IntStream.of(array)
                .filter(num -> num  % 10 != 0 ) //filtro elementos no divisibles por 10
                .peek(System.out::println)
                .mapToDouble(num -> (double) num/2) //convierto a double y divido por 2
                .peek(System.out::println)
                .reduce(0,Double::sum); // sumo los elementos resultantes.

        System.out.println("resultado = " + resultado);

    }
}
