package com.jdiaz.parte18curso_api_stream.ejemplos;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamRange {
    public static void main(String[] args) {

        IntStream num = IntStream.range(5,20).peek(System.out::println);
        IntStream num2 = IntStream.rangeClosed(5,20).peek(System.out::println); //inclutye el 20.

                //int resultado  = num.reduce(0,(a,b)->a+b);
                //int resultado = num.sum();
                IntSummaryStatistics stats = num.summaryStatistics();
        System.out.println("stats.getMax() = " + stats.getMax());
        System.out.println("stats.getMin() = " + stats.getMin());
        System.out.println("stats.getSum() = " + stats.getSum());
        System.out.println("stats.getAverage() = " + stats.getAverage());
        System.out.println("stats.getCount() = " + stats.getCount());

        IntSummaryStatistics stats2 = num2.summaryStatistics();
        System.out.println("stats.getMax() = " + stats.getMax());
        System.out.println("stats.getMin() = " + stats.getMin());
        System.out.println("stats.getSum() = " + stats.getSum());
        System.out.println("stats.getAverage() = " + stats.getAverage());
        System.out.println("stats.getCount() = " + stats.getCount());




    }
}
