package com.jdiaz.parte16curso_threads_o_hilos.EjemploSync;

import com.jdiaz.parte16curso_threads_o_hilos.EjemploSync.runnable.Consumidor;
import com.jdiaz.parte16curso_threads_o_hilos.EjemploSync.runnable.Panadero;

import java.util.concurrent.ThreadLocalRandom;

public class EjemploProductorConsumidorJAVA8 {
    public static void main(String[] args) {

        Panaderia p = new Panaderia();

        new Thread(()->{
            for (int i = 0; i<10;i++){
                p.hornear("Pan nº: "+ i);
                try {
                    Thread.sleep(ThreadLocalRandom.current().nextInt(500,2000));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
        new Thread(()->{
            for (int i = 0; i<10;i++){
                p.consumir();
            }
        }).start();

    }

}
