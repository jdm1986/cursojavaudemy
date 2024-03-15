package com.jdiaz.parte17curso_expresiones_lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploFunction {
    public static void main(String[] args) {


        Function<String, String> f1 = param -> "Hola que tal! " + param;
        String resultado = f1.apply("andrés");
        System.out.println(resultado);

        Function<String,String> f2 = String::toUpperCase;
        System.out.println(f2.apply("Andres"));

        BiFunction<String, String, String> f3 = (a,b) -> a.toUpperCase().concat(b.toUpperCase());
        String r2 = f3.apply("andres","jose");
        System.out.println(r2);

        BiFunction<String, String, Integer> f4 = String::compareTo; // f4 = (a,b)->a.compareTo(b; >>>> al pasar b por el método se puede escribir como referencia de método.
        System.out.println(f4.apply("andres","andres2"));

        BiFunction<String, String, String> f5 = String::concat;
        System.out.println(f5.apply("andres"," jose"));
    }

}
