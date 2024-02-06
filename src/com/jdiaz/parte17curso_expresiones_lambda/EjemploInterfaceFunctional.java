package com.jdiaz.parte17curso_expresiones_lambda;

import com.jdiaz.parte17curso_expresiones_lambda.aritmetica.Aritmetica;
import com.jdiaz.parte17curso_expresiones_lambda.aritmetica.Calculadora;

public class EjemploInterfaceFunctional {
    public static void main(String[] args) {

        Aritmetica suma = (a, b)-> a+b;
        Aritmetica resta = (a,b)-> a-b;

        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.computar(10,5,suma));
        System.out.println(calculadora.computar(10,5,resta));
        System.out.println(calculadora.computar(10,5,(a,b) -> a * b));

        System.out.println(calculadora.computarConBifunction(10,5,(a,b)-> a+b));

    }
}
