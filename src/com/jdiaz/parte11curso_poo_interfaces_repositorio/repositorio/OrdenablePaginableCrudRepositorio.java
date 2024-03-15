package com.jdiaz.parte11curso_poo_interfaces_repositorio.repositorio;

public interface OrdenablePaginableCrudRepositorio<T> extends OrdenableRepositorio<T>, PaginableRepositorio<T>, CrudRepositorio<T>,ContableRepositorio{

}
