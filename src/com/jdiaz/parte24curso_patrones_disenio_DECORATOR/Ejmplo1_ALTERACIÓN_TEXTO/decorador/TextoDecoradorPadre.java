package com.jdiaz.parte24curso_patrones_disenio_DECORATOR.Ejmplo1_ALTERACIÓN_TEXTO.decorador;

import com.jdiaz.parte24curso_patrones_disenio_DECORATOR.Ejmplo1_ALTERACIÓN_TEXTO.Formateable;

public abstract class TextoDecoradorPadre implements Formateable {
    protected Formateable texto;

    public TextoDecoradorPadre(Formateable texto) {
        this.texto = texto;
    }
}
