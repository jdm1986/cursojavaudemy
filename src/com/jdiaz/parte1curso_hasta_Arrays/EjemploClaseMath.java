package com.jdiaz.parte1curso_hasta_Arrays;

public class EjemploClaseMath {
    public static void main(String[] args) {

        int absoluto = Math.abs(-3); //con un 3 positivo retonraría 3.
        System.out.println("absoluto = " + absoluto);

        double max = Math.max(3.5,1.2); //valor máximo entre dos valores
        System.out.println("max = " + max);

        double min = Math.min(3.5,1.2);
        System.out.println("min = " + min);//valor mínimo entre dos valores

        double rendondeoAlAlza = Math.ceil(3.5);
        System.out.println("rendondeoAlAlza = " + rendondeoAlAlza);
        double redondeoALaBaja = Math.floor(3.5);
        System.out.println("redondeoALaBaja = " + redondeoALaBaja);

        long entero = Math.round(3.5); // si fuera 3.4 redondearía a 3.
        System.out.println("entero = " + entero);
        
        double exp = Math.exp(2);
        System.out.println("exp = " + exp);

        double logaritmo = Math.log(10);
        System.out.println("logaritmo natural de 10 = " + logaritmo);

        double potencia = Math.pow(10,3);
        System.out.println("potencia de 10 elevado a 3 = " + potencia);

        double raiz = Math.sqrt(5);
        System.out.println("raiz cuadrada de 5 = " + raiz);

        //Hay mucho más con la clase Math... de grados a radianes, de radianes a grados, seno, coseno, tangente...

    }
}
