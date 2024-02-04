package com.jdiaz.parte16curso_threads_o_hilos;

import com.jdiaz.parte16curso_threads_o_hilos.threads.NombreThread;

public class EjemploExtenderThread {
    public static void main(String[] args) throws InterruptedException {

        Thread hilo = new NombreThread("John Doe");
        Thread hilo2 = new NombreThread("María");
        Thread hilo3 = new NombreThread("Pepe");
        hilo.start();
        hilo2.start();
        hilo3.start();
        //Thread.sleep(3);
        System.out.println(hilo.getState());

    }
}
