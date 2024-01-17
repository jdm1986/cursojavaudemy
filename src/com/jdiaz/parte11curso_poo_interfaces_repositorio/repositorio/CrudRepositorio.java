package com.jdiaz.parte11curso_poo_interfaces_repositorio.repositorio;

import com.jdiaz.parte11curso_poo_interfaces_repositorio.modelo.Cliente;

import java.util.List;

public interface CrudRepositorio {
    List<Cliente> listar();
    Cliente porId(Integer id);

    void crear(Cliente cliente);
    void editar(Cliente cliente);
    void eliminar(Cliente id);
}
