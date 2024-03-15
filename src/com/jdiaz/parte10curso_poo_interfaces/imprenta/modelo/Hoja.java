package com.jdiaz.parte10curso_poo_interfaces.imprenta.modelo;

public abstract class Hoja {
    String contenido;

    public Hoja(String contenido) {
        this.contenido = contenido;
    }

     public abstract String imprimir();
}
