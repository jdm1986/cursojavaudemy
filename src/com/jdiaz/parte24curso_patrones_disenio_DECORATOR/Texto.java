package com.jdiaz.parte24curso_patrones_disenio_DECORATOR;

public class Texto implements Formateable{

    private String texto;

    public Texto(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String darFormato() {
        return getTexto();
    }
}
