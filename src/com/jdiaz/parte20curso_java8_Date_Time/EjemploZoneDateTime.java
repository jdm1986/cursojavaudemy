package com.jdiaz.parte20curso_java8_Date_Time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class EjemploZoneDateTime {

    public static void main(String[] args) {

        LocalDateTime fechalocal = LocalDateTime.now();


        ZoneId madrid = ZoneId.of("Europe/Madrid");
        ZonedDateTime zonaMadrid = ZonedDateTime.of(fechalocal,madrid);
        System.out.println("Horario de partida de Madrid = " + zonaMadrid);

        ZoneId newYork = ZoneId.of("America/New_York");
        ZonedDateTime zonaNewYork = zonaMadrid.withZoneSameInstant(newYork);
        System.out.println("Horario  New York = " + zonaNewYork);
        ZonedDateTime zonaNewYork2 = zonaMadrid.withZoneSameInstant(newYork).plusHours(8);
        System.out.println("Horario de llegada en New York = " + zonaNewYork2);

        
    }


}
