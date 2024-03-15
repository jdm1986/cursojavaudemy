package org.jdiaz;

import org.jdiaz.modelo.Producto;
import org.jdiaz.repositorio.ProductoRepositorioImpl;
import org.jdiaz.repositorio.Repositorio;
import org.jdiaz.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

public class EjemploJdbcUpdate {
    public static void main(String[] args) {

        int incremento = 1;

            Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
            System.out.println("================== Listar ================");
            repositorio.listar().forEach(System.out::println);

            System.out.println("================== Ver por Id ================");
            System.out.println(repositorio.porId(2L));

            System.out.println("================== Editar Producto ================");
            Producto producto = new Producto();

            producto.setId(3L);
            producto.setNombre("Teclado Raizer mecánico");
            producto.setPrecio(700);

            repositorio.guardar(producto);
            System.out.println("Producto actualizado con éxito");
            System.out.println("================== Listar ================");
            repositorio.listar().forEach(System.out::println);

    }
}
