package com.jdiaz.parte20curso_java8_Date_Time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
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
        
        LocalTime seisConTreinta = LocalTime.of(6,30);
        System.out.println(seisConTreinta);
        seisConTreinta = LocalTime.parse("06:30");
        System.out.println("seisConTreinta = " + seisConTreinta);

        LocalTime sieteConTreina = LocalTime.of(6,30).plusHours(1);
        System.out.println("sieteConTreina = " + sieteConTreina);
        LocalTime sieteConTreina2 = LocalTime.of(6,30).plus(1,ChronoUnit.HOURS);
        System.out.println("sieteConTreina forma 2 = " + sieteConTreina);

        boolean esAnterior = LocalTime.of(6,30).isBefore(LocalTime.parse("07:30"));
        System.out.println("esAnterior = " + esAnterior);

    }
}
