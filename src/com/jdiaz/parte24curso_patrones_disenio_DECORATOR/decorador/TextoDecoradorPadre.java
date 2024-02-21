package com.jdiaz.parte24curso_patrones_disenio_DECORATOR.decorador;

import com.jdiaz.parte24curso_patrones_disenio_DECORATOR.Formateable;

public abstract class TextoDecoradorPadre implements Formateable {
    protected Formateable texto;

    public TextoDecoradorPadre(Formateable texto) {
        this.texto = texto;
    }
}
