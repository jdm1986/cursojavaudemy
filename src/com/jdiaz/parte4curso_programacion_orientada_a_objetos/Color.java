package com.jdiaz.parte4curso_programacion_orientada_a_objetos;

public enum Color { //Un enumerador es una colección de valores constantes, o atributos constantes.
    //Como estandar se escribe siempre en Mayúscula
    //Conjunto de constantes que a su vez, el valor, es el mismo nombre de la constante.
    //Es otra forma de implementar un conjunto de valores constantes, con ENUM queda más desacoplado y más ordenador, separado de la clase Automovil.

    ROJO("Rojo"),
    AMARILLO("Amarillo"),
    AZUL("Azul"),
    BLANCO("Blanco"),
    GRIS("Gris oscuro"),
    PÚRPURA("Púrpura");

    private  final String Color;

    Color(String color) {
        this.Color = color;
    }

    public String getColor() {
        return Color;
    }

    @Override
    public String toString() {
        return this.Color;
    }
}
//el toString es para dar una representación al valor de cada constante.
