package com.jdiaz.parte20curso_java8_Date_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class EjemploLocalDateTime {
    public static void main(String[] args) {

        LocalDateTime fechaTiempo = LocalDateTime.now();

        System.out.println("fechaTiempo = " + fechaTiempo);

        fechaTiempo = LocalDateTime.of(2020, Month.DECEMBER, 24, 20, 45, 59);
        System.out.println("fechaTiempo = " + fechaTiempo);

        fechaTiempo = LocalDateTime.parse("2020-12-24T20:45:59");
        System.out.println("fechaTiempo = " + fechaTiempo);

        fechaTiempo = fechaTiempo.plusDays(1);
        System.out.println("fechaTiempo = " + fechaTiempo);

        LocalDateTime fechaTiempo2 = LocalDateTime.now();

        Month mes = fechaTiempo2.getMonth();
        System.out.println("mes = " + mes);

        int diaDelMes = fechaTiempo2.getDayOfMonth();
        System.out.println("diaDelMes = " + diaDelMes);

        int anio = fechaTiempo2.getYear();
        System.out.println("anio = " + anio);

        int diaDelAño = fechaTiempo2.getDayOfYear();
        System.out.println("diaDelAño = " + diaDelAño);
        
        String formato1 = fechaTiempo2.format(DateTimeFormatter.ISO_DATE);
        System.out.println("formato1 = " + formato1);

        String formato2 = fechaTiempo2.format(DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss a"));
        System.out.println("formato2 = " + formato2);



    }

}
