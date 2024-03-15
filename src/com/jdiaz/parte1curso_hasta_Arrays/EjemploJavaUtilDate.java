package com.jdiaz.parte1curso_hasta_Arrays;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {

        Date fecha = new Date();

        System.out.println("fecha = " + fecha);

        SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd-MM-yyyy");
        String fechaStr = dateFormat1.format(fecha);

        long j = 0;

        for (int i = 0; i < 100000000;i++){
            j +=i;
        }
        System.out.println("j = " + j);


        Date fecha2 = new Date();
        long tiempoFinal = fecha2.getTime()- fecha.getTime();
        System.out.println("tiempo transcurrido en el for = " + tiempoFinal+"mls");

        System.out.println(fechaStr);

    }
}
