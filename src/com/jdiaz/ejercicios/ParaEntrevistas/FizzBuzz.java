package com.jdiaz.ejercicios.ParaEntrevistas;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {

        /*FizzBuzz: Este es un ejercicio clásico que implica imprimir números del 1 al 100, pero imprimir "Fizz" en
        lugar de aquellos que son divisibles por 3, "Buzz" en lugar de aquellos divisibles por 5, y "FizzBuzz" en
        lugar de aquellos divisibles por ambos 3 y 5.*/

        int contadorFizz = 0;
        int contadorBuzz = 0;
        int contadorFizzBuzz = 0;
        int contadorNumerosNoDivisiblees = 0;

                // Iterar sobre los números del 1 al 100
                for (int i = 1; i <= 100; i++) {
                    // Verificar si el número es divisible por 3 y por 5
                    if (i % 3 == 0 && i % 5 == 0) {
                        contadorFizzBuzz++;
                        System.out.println("FizzBuzz");
                    }
                    // Verificar si el número es divisible solo por 3
                    else if (i % 3 == 0) {
                        contadorFizz++;
                        System.out.println("Fizz");
                    }
                    // Verificar si el número es divisible solo por 5
                    else if (i % 5 == 0) {
                        contadorBuzz++;
                        System.out.println("Buzz");
                    }
                    // Si no es divisible ni por 3 ni por 5, imprimir el número
                    else {
                        contadorNumerosNoDivisiblees++;
                        System.out.println(i);
                    }
                }
        System.out.println("contadorNumerosNoDivisiblees = " + contadorNumerosNoDivisiblees);
        System.out.println("contadorFizzBuzz = " + contadorFizzBuzz);
        System.out.println("contadorFizz = " + contadorFizz);
        System.out.println("contadorBuzz = " + contadorBuzz);
            }
        }


        /*int contadorFizz = 0;
        int contadorBuzz = 0;
        int contadorFizzBuzz = 0;

        for (int i = 0; i<= 100;i++){
            if (i%3== 0){
                contadorFizz++;
                System.out.println("Fizz");
            } else if (i%5 == 0) {
                contadorBuzz++;
                System.out.println("Buzz");
            } else if( i%3 == 0 && i%5 == 0){
                contadorFizzBuzz++;
                System.out.println("FizzBuzz");
            }
        }
        System.out.println("contadorFizz = " + contadorFizz);
        System.out.println("contadorBuzz = " + contadorBuzz);
        System.out.println("contadorFizzBuzz = " + contadorFizzBuzz);*/

