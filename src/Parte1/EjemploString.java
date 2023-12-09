package Parte1;

import java.text.Normalizer;

public class EjemploString {
    public static void main(String[] args) {

        String curso = "Programación Java";
        String curso2 = new String("Programacion Java");

        boolean esIgual = curso.equalsIgnoreCase(curso2);
        System.out.println("esIgual sin considerar tildes (antes de normalizar): " + esIgual);

        /*String textoCursoNormalizado = Normalizer.normalize(curso,Normalizer.Form.NFD);
        textoCursoNormalizado = textoCursoNormalizado.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");

        String textoCursoNormalizado2 = Normalizer.normalize(curso2,Normalizer.Form.NFD);
        textoCursoNormalizado2 = textoCursoNormalizado2.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");

        esIgual = textoCursoNormalizado.equalsIgnoreCase(textoCursoNormalizado2);
        System.out.println("esIgual sin considerar tildes (después de normalizar: " + esIgual);*/


        String curso3 = "Programación Java";

        esIgual = curso == curso3;
        System.out.println("esIgual = " + esIgual);


    }
}
