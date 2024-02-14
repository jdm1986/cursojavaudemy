package com.jdiaz.parte20curso_java8_Date_Time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class EjemploLocalTime {
    public static void main(String[] args) {

        LocalTime ahora = LocalTime.now();
        System.out.println("ahora = " + ahora);
        System.out.println("Hora: " + ahora.getHour());
        System.out.println("Minutos: " + ahora.getMinute());
        System.out.println("Segundos: " + ahora.getSecond());
        
        LocalTime seisConTreinta = LocalTime.of(6,30,59);
        System.out.println(seisConTreinta);
        seisConTreinta = LocalTime.parse("06:30");
        System.out.println("seisConTreinta = " + seisConTreinta);

        LocalTime sieteConTreina = LocalTime.of(6,30,59).plusHours(1);
        System.out.println("sieteConTreina = " + sieteConTreina);
        LocalTime sieteConTreina2 = LocalTime.of(6,30,59).plus(1,ChronoUnit.HOURS);
        System.out.println("sieteConTreina forma 2 = " + sieteConTreina);

        boolean esAnterior = LocalTime.of(6,30,59).isBefore(LocalTime.parse("07:30"));
        System.out.println("esAnterior = " + esAnterior);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String ahoraFormateado = ahora.format(dateTimeFormatter);
        System.out.println("ahoraFormateado = " + ahoraFormateado);
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("hh:mm:ss a");
        String ahoraFormateado2 = ahora.format(dateTimeFormatter2);
        System.out.println("ahoraFormateado2 = " + ahoraFormateado2);

        ahoraFormateado = dateTimeFormatter.format(ahora);
        System.out.println("ahoraFormateado = " + ahoraFormateado);

        LocalTime max = LocalTime.MAX;
        LocalTime min = LocalTime.MIN;

        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }
}
