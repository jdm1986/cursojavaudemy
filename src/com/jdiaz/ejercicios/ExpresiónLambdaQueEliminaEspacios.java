package com.jdiaz.ejercicios;
import java.util.function.Function;
public class ExpresiónLambdaQueEliminaEspacios {

        public static void main(String[] args) {
            // Expresión lambda que toma una cadena, elimina espacios, comas y puntos, y la convierte en mayúsculas.
            Function<String, String> procesarFrase = frase -> frase.replaceAll("[,.\\s]+", "").toUpperCase();

            String fraseOriginal = "Hola, cómo estás. Bien, gracias por preguntar.";
            String resultado = procesarFrase.apply(fraseOriginal);

            System.out.println("Frase original: " + fraseOriginal);
            System.out.println("Resultado: " + resultado);
        }
    }


