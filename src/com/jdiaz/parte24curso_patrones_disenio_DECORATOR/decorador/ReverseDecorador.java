package com.jdiaz.parte24curso_patrones_disenio_DECORATOR.decorador;

import com.jdiaz.parte24curso_patrones_disenio_DECORATOR.Formateable;

public class ReverseDecorador extends TextoDecoradorPadre{
    public ReverseDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        StringBuilder stringBuilder = new StringBuilder(texto.darFormato());
        return stringBuilder.reverse().toString();
    }
}
