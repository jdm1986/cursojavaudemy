package com.jdiaz.parte16curso_threads_o_hilos;

import com.jdiaz.parte16curso_threads_o_hilos.runnable.ViajeTarea;

public class EjemploInterfaceRunnableJava8_funcional {
    public static void main(String[] args) {

        Runnable viaje = () -> {
            for (int i = 0;i <10;i++){
                System.out.println(i + " - " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Finalmente me voy de viaje a: " +Thread.currentThread().getName());
        };
        new Thread(viaje,"Isla de Pascua").start();
        new Thread(viaje,"Robinson Cruseo").start();
        new Thread(viaje,"Juan Fernandez").start();
        new Thread(viaje,"Isla de Chiloe").start();

    }
}
