package com.jdiaz.parte20curso_java8_Date_Time;

import javax.imageio.plugins.tiff.TIFFDirectory;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class EjemploDuration2 {
    public static void main(String[] args) {

        Instant i1 = Instant.now();

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Instant i2 = Instant.now();
        
        Duration lapsoDeTiempo = Duration.between(i1,i2);
        System.out.println("lapsoDeTiempo = " + lapsoDeTiempo);

    }
}
