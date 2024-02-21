package com.jdiaz.parte24curso_patrones_disenio_DECORATOR.Ejmplo1_ALTERACIÓN_TEXTO.decorador;

import com.jdiaz.parte24curso_patrones_disenio_DECORATOR.Ejmplo1_ALTERACIÓN_TEXTO.Formateable;

public class SubrayadoDecorador extends TextoDecoradorPadre{
    public SubrayadoDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        int largo = texto.darFormato().length();
        StringBuilder stringBuilder = new StringBuilder(texto.darFormato());
        stringBuilder.append("\n");
        for(int i = 0; i < largo;i++){
            stringBuilder.append("_");
        }
        return stringBuilder.toString();
    }
}
