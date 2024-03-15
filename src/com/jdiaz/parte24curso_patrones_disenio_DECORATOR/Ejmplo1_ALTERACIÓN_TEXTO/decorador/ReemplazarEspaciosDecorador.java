package com.jdiaz.parte24curso_patrones_disenio_DECORATOR.Ejmplo1_ALTERACIÓN_TEXTO.decorador;

import com.jdiaz.parte24curso_patrones_disenio_DECORATOR.Ejmplo1_ALTERACIÓN_TEXTO.Formateable;

public class ReemplazarEspaciosDecorador extends TextoDecoradorPadre{
    public ReemplazarEspaciosDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().replace(" ","_");
    }
}
