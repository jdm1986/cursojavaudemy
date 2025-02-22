package com.jdiaz.parte24curso_patrones_disenio_DECORATOR.Ejmplo1_ALTERACIÓN_TEXTO;

import com.jdiaz.parte24curso_patrones_disenio_DECORATOR.Ejmplo1_ALTERACIÓN_TEXTO.decorador.MayusculaDecorador;
import com.jdiaz.parte24curso_patrones_disenio_DECORATOR.Ejmplo1_ALTERACIÓN_TEXTO.decorador.ReemplazarEspaciosDecorador;
import com.jdiaz.parte24curso_patrones_disenio_DECORATOR.Ejmplo1_ALTERACIÓN_TEXTO.decorador.SubrayadoDecorador;

public class EjemploDecorador {
    public static void main(String[] args) {
        
        Formateable texto = new Texto("Hola que tal Andrés");

        MayusculaDecorador mayuscula = new MayusculaDecorador(texto);
        //ReverseDecorador reversa = new ReverseDecorador(mayuscula);
        SubrayadoDecorador subrayar = new SubrayadoDecorador(mayuscula);
        ReemplazarEspaciosDecorador reemplazar = new ReemplazarEspaciosDecorador(subrayar);

        System.out.println(reemplazar.darFormato());
        
    }

    //Para entenderlo, con solo 7 clases y uns interfaz agrego 4 características. Si hubiese usado herencia puramente
    //serían alrededor de 16 clases.
}
