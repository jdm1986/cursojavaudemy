package com.jdiaz.parte17curso_expresiones_lambda;

import com.jdiaz.parte1curso_hasta_Arrays.SentenciaIfElse;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class EjemploConsumer {
    public static void main(String[] args) {

        Consumer<Date> consumidor = fecha -> {
            SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
            System.out.println(format.format(fecha));
        };
        consumidor.accept(new Date());

        BiConsumer<String,Integer> consumidorBi = (String nombre, Integer edad) ->{
            System.out.println(nombre + ", tiene " + edad + " años!");
        };
        consumidorBi.accept("pepe",20);
    }
}
