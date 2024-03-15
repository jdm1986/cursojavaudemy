package com.jdiaz.parte1curso_hasta_Arrays;

import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();


        calendario.set(2023,Calendar.SEPTEMBER,25,18,25,25);
        Date fecha = calendario.getTime();

        System.out.println("calendario = " + fecha);

    }
}
