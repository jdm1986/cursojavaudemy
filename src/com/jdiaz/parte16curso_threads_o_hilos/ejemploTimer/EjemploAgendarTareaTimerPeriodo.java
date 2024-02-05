package com.jdiaz.parte16curso_threads_o_hilos.ejemploTimer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class EjemploAgendarTareaTimerPeriodo {
    public static void main(String[] args) {


        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            private int contador = 3;
            @Override
            public void run() {
                if (contador > 0){
                System.out.println("Tarea " + contador + " peródica en " + new Date() + " nombre del Thread"
                        + Thread.currentThread().getName());
                contador--;
                } else {
                    System.out.println("Finaliza el tiempo");
                    timer.cancel();
                }
            }
        },5000,10000);

        System.out.println("Agendamos una tarea para 5 segundos más ...");
    }
}
