package com.jdiaz.parte25curso_patrones_disenio_COMPOSITE;

import java.util.ArrayList;
import java.util.List;

public class Directorio extends Componente {

    private List<Componente> hijos;

    public Directorio(String nombre) {
        super(nombre);
        this.hijos = new ArrayList<>();
    }

    public Directorio addComponente(Componente componente) {
        hijos.add(componente);
        return this;
    }

    public Void removeComponente(Componente componente) {
        hijos.remove(componente);
        return null;
    }

    @Override
    public String mostrar(int nivel) {

        StringBuilder stringBuilder = new StringBuilder("\t".repeat(nivel));
        stringBuilder.append(nombre)
                .append("/")
                .append("\n");

        for (Componente hijo : this.hijos) {
            stringBuilder.append(hijo.mostrar(nivel+1));
            if (hijo instanceof Archivo) {
                stringBuilder.append("\n");
            }
        }

        return stringBuilder.toString();
    }

    @Override
    public boolean buscar(String nombre) {
        if(this.nombre.equalsIgnoreCase(nombre)){
            return true;
        }

        /*for(Componente hijo:hijos){
            if(hijo.buscar(nombre)){
                return true;
            }
        }*/
        return hijos.stream().anyMatch(h -> h.buscar(nombre)); //en una sola linea con el ApiStream en vez de con for.
    }

}
