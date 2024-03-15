package com.jdiaz.parte11curso_poo_interfaces_repositorio.repositorio;

import com.jdiaz.parte11curso_poo_interfaces_repositorio.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio<T> {
    List<T> listar (int desde, int hasta);
}
