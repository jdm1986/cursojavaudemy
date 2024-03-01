package org.jdiaz;

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
            System.out.println(repositorio.porId(2L));

            System.out.println("================== Insertar Nuevo Producto ================");
            Producto producto = new Producto();
            producto.setNombre("Teclado mecánico");
            producto.setPrecio(500);
            producto.setFechaRegistro(new Date());

            repositorio.guardar(producto);

            System.out.println("Producto guardado con éxito");

            System.out.println("================== Listar ================");
            repositorio.listar().forEach(System.out::println);


        } catch (SQLException e) {
            e.printStackTrace();

        }

    }
}
