package com.jdiaz.parte21curso_antoniones;

import com.jdiaz.parte21curso_antoniones.models.Producto;
import com.jdiaz.parte21curso_antoniones.procesador.JasonSerializador;


import java.time.LocalDate;


public class EjemploAnotacion {
    public static void main(String[] args) {

        Producto p = new Producto();
        p.setFecha(LocalDate.now());
        p.setNombre("Mesa centro roble");
        p.setPrecio(1000L);


        System.out.println("json = " + JasonSerializador.convertirJason(p));
    }
}
