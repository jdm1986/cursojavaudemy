package Parte1;

public class SentenciaIfElse {
    public static void main(String[] args) {

        float promedio = 5.8f;

        if(promedio >= 6.5){
            System.out.println("Felicitaciones");
        }else if (promedio >= 6){
            System.out.println("Esfuérzate");
            } else if (promedio >= 5.0){
            System.out.println("Mal");
        } else if(promedio >=4.0){
            System.out.println("Insuficiente");

    }else {
            System.out.println("Suspendido");
        }
        System.out.println("promedio = " + promedio);
}}
