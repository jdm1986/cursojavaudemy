package com.jdiaz.parte13curso_clases_genericas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Camion implements Iterable {

    private List objetos;
    private int max;

    public Camion(int max) {
        this.max = max;
        this.objetos = new ArrayList<>();
    }

    public void add(Objects objeto){
        if(this.objetos.size() <= max){
            this.objetos.add(objeto);
        } else {
            throw new RuntimeException("No hay más espacio");
        }
    }


    @Override
    public Iterator iterator() {
        return this.objetos.iterator();
    }
}
