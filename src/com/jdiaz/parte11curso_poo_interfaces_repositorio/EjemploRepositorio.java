package com.jdiaz.parte11curso_poo_interfaces_repositorio;

import com.jdiaz.parte11curso_poo_interfaces_repositorio.modelo.Cliente;
import com.jdiaz.parte11curso_poo_interfaces_repositorio.repositorio.*;

import java.io.PrintStream;
import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {

        OrdenablePaginableCrudRepositorio repo = new ClienteListRepositorio();
        repo.crear(new Cliente("Jano","Perez"));
        repo.crear(new Cliente("Bea", "González"));
        repo.crear(new Cliente("Andres", "Guzman"));
        repo.crear(new Cliente("Luci", "Martinez"));

        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);

        System.out.println("======== paginable ==========");

        List<Cliente> paginable = repo.listar(0,3);
        paginable.forEach(System.out::println);

        System.out.println("======== ordenar ==========");
        
        List<Cliente> clientesOrdenAsc = repo.listar("apellido", Direccion.DESC);
        for (Cliente c : clientesOrdenAsc) {
            System.out.println(c);
        }
        System.out.println("======== editar ==========");
        Cliente beaActualizar = new Cliente("Bea", "Mena");
        beaActualizar.setId(2);
        repo.editar(beaActualizar);
        System.out.println("======== Eliminar ==========");

        repo.eliminar(2);
        repo.listar().forEach(System.out::println);

        System.out.println(("====== total ====="));
        System.out.println("Total registros: " + repo.total());
    }
}
