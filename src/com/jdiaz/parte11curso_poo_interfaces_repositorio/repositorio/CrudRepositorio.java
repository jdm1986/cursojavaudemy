package com.jdiaz.parte11curso_poo_interfaces_repositorio.repositorio;

import com.jdiaz.parte11curso_poo_interfaces_repositorio.modelo.Cliente;

import java.util.List;

public interface CrudRepositorio<T> {
    List<T> listar();
    T porId(Integer id);

    void crear(T cliente);
    void editar(T cliente);
    void eliminar(Integer id);
}
