package com.jdiaz.parte16curso_threads_o_hilos.EjemploSync;

import com.jdiaz.parte16curso_threads_o_hilos.EjemploSync.runnable.Consumidor;
import com.jdiaz.parte16curso_threads_o_hilos.EjemploSync.runnable.Panadero;

public class EjemploProductorConsumidor {
    public static void main(String[] args) {

        Panaderia p = new Panaderia();
        new Thread(new Panadero(p)).start();
        new Thread(new Consumidor(p)).start();

    }

}
