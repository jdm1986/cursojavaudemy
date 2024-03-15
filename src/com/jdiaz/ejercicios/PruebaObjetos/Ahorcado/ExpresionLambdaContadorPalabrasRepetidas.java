package com.jdiaz.ejercicios.PruebaObjetos.Ahorcado;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExpresionLambdaContadorPalabrasRepetidas {
    public static void main(String[] args) {

        // Expresión lambda que cuenta la cantidad de veces que se repiten las palabras en una frase.
        Function<String, String> encontrarPalabraMasRepetida = frase -> {
            String[] palabras = frase.split("\\s+");
            Map<String, Long> contadorPalabras = Arrays.stream(palabras)
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

            // Encontrar la palabra más repetida
            String palabraMasRepetida = contadorPalabras.entrySet().stream()
                    .max((entry1, entry2) -> entry1.getValue().compareTo(entry2.getValue()))
                    .get()
                    .getKey();

            return palabraMasRepetida;
        };

        String frase = "Esta es una frase de ejemplo que contiene una palabra repetida varias veces, una por cada ejecución.";
        String palabraMasRepetida = encontrarPalabraMasRepetida.apply(frase);

        System.out.println("Frase original: " + frase);
        System.out.println("Palabra más repetida: " + palabraMasRepetida);

    }

    }

