package com.jdiaz.parte4curso_programacion_orientada_a_objetos;

public class Deposito {

    private int capacidad; //dos formas de crear el objeto.

    public Deposito() {
        this.capacidad = 40;
    }


    public Deposito(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }
// en vez de toString, la idea es retornar el entero que es un tipo numérico así que sol Get

}
