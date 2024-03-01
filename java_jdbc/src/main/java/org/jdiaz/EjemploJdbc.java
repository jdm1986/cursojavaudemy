package org.jdiaz;

import org.jdiaz.modelo.Categoria;
import org.jdiaz.modelo.Producto;
import org.jdiaz.repositorio.ProductoRepositorioImpl;
import org.jdiaz.repositorio.Repositorio;
import org.jdiaz.util.ConexionBaseDatos;

import java.sql.*;
import java.util.Date;

public class EjemploJdbc {
    public static void main(String[] args) {


        int incremento = 1;

        try (Connection connection = ConexionBaseDatos.getInstance()) {

            Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
            System.out.println("================== Listar ================");
            repositorio.listar().forEach(System.out::println);

            System.out.println("================== Ver por Id ================");
            System.out.println(repositorio.porId(1L));

            System.out.println("================== Insertar Nuevo Producto ================");
            Producto producto = new Producto();
            producto.setNombre("Teclado Rizer mecánico");
            producto.setPrecio(550);

            producto.setFechaRegistro(new Date());
            Categoria categoria = new Categoria();
            categoria.setId(3L);
            producto.setCategoria(categoria);

            repositorio.guardar(producto);

            System.out.println("Producto guardado con éxito");

            System.out.println("================== Listar ================");
            repositorio.listar().forEach(System.out::println);


        } catch (SQLException e) {
            e.printStackTrace();

        }

    }
}
