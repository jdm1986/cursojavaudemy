package com.jdiaz.parte24curso_patrones_disenio_DECORATOR.decorador;

import com.jdiaz.parte24curso_patrones_disenio_DECORATOR.Formateable;

public class MayusculaDecorador extends TextoDecoradorPadre {


    public MayusculaDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().toUpperCase();
    }
}
