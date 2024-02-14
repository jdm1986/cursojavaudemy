package com.jdiaz.parte19curso_clase_Optional.repositorio;

import com.jdiaz.parte19curso_clase_Optional.models.Computador;

import java.util.Optional;

public interface Repositorio <T>{

    Optional <Computador> filtrar (String nombre);

}
