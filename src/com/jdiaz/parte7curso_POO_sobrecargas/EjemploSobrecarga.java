package com.jdiaz.parte7curso_POO_sobrecargas;
import static com.jdiaz.parte7curso_POO_sobrecargas.Calculadora.*;

public class EjemploSobrecarga {
    public static void main(String[] args) {

        System.out.println("Sumar int: " + sumar(10,5));
        System.out.println("Sumar float: "  + sumar(10.0f,5f));
        System.out.println("Sumar float-int: " + sumar(10f,5));
        System.out.println("Sumar int-float: " + sumar(10,5f));
        System.out.println("Sumar double: " + sumar(10.0,5.0));
        System.out.println("Sumar string: " + sumar("10","5"));
        System.out.println("Sumar tres int: " + sumar(10,5,3));
        System.out.println("Sumar 4 int: " + sumar(10,5,3,4));
        System.out.println("Sumar 4 int: " + sumar(10,5,3,4,5,6,7));
        System.out.println("Sumar float + n int: " + sumar(10.5f,5,5,5,6));
        System.out.println("Sumar 3 double : " + sumar(10.0,5.0,3.5,5.5));

        System.out.println("Sumar long: " + sumar(10l,5l));
        System.out.println("Sumar enteros: " + sumar(10,'@'));
        System.out.println("Sumar float-int: "+ sumar(10f,'@'));
    }
}
