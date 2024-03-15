package com.jdiaz.parte19curso_clase_Optional.repositorio;

import com.jdiaz.parte19curso_clase_Optional.models.Computador;
import com.jdiaz.parte19curso_clase_Optional.models.Fabricante;
import com.jdiaz.parte19curso_clase_Optional.models.Procesador;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ComputadorRepositorio implements Repositorio<Computador> {

    private List<Computador> dataSource;

    public ComputadorRepositorio() {
        dataSource = new ArrayList<>();
        Procesador proc = new Procesador("I9-9980",new Fabricante("Intel"));
        Computador asus = new Computador("Asus Rog", "Strix 512");
        asus.setProcesador(proc);
        dataSource.add(asus);

        dataSource.add(new Computador("Macbook Pro", "Mvb23"));

    }

    @Override
    public Optional<Computador> filtrar(String nombre) {

        return dataSource.stream()
                .filter(computador -> computador.getNombre().toLowerCase().contains(nombre.toLowerCase()))
                .findFirst();

       /* for(Computador c: dataSource){
            if(c.getNombre().equalsIgnoreCase(nombre)){
                return Optional.of(c);
            }
        }
        return Optional.empty();
    }*/
    }
}
