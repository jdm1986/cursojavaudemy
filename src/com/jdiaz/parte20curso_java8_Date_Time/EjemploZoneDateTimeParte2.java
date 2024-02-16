package com.jdiaz.parte20curso_java8_Date_Time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter; // Se añade la importación que falta
import java.util.Set;

public class EjemploZoneDateTimeParte2 {

    public static void main(String[] args) {

        LocalDateTime fechalocal = LocalDateTime.parse("2021-09-23T12:45",
                DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm")); // Se corrige el formato de fecha y hora

        //ZoneId madrid = ZoneId.of("Europe/Madrid");
        ZonedDateTime zonaMadrid = ZonedDateTime.of(fechalocal, ZoneOffset.of("+02:00"));
        System.out.println("Horario de partida de Madrid = " + zonaMadrid);

        //ZoneId newYork = ZoneId.of("America/New_York");
        ZonedDateTime zonaNewYork = zonaMadrid.withZoneSameInstant(ZoneOffset.of("-04:00"));
        System.out.println("Horario  New York = " + zonaNewYork);
        ZonedDateTime zonaNewYork2 = zonaMadrid.withZoneSameInstant(ZoneOffset.of("-04:00")).plusHours(8);
        System.out.println("Horario de llegada en New York = " + zonaNewYork2);

        DateTimeFormatter f = DateTimeFormatter.ofPattern("HHmm, dd MMM yyyy");
        // Aquí deberías formatear la fecha y hora usando el formateador 'f' si deseas imprimir
        // Por ejemplo:
        System.out.println("Fecha y hora formateadas: " + zonaMadrid.format(f));

        System.out.println("Detalles del viaje a NewYork");

        System.out.println("Partida Madrid: " + f.format(zonaMadrid));
        System.out.println("Llegada a New York: " + f.format(zonaNewYork2));

        ZoneId.getAvailableZoneIds().forEach(System.out::println);

    }
}
