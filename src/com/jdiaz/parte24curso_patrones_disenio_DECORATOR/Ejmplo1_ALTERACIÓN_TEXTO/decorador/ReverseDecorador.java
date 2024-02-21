package com.jdiaz.parte24curso_patrones_disenio_DECORATOR.Ejmplo1_ALTERACIÓN_TEXTO.decorador;

import com.jdiaz.parte24curso_patrones_disenio_DECORATOR.Ejmplo1_ALTERACIÓN_TEXTO.Formateable;

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
