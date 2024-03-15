package org.jdiaz;

import org.jdiaz.modelo.Categoria;
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

        try (Connection connection = ConexionBaseDatos.getInstance()) {

            Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
            System.out.println("================== Listar ================");
            repositorio.listar().forEach(System.out::println);

            System.out.println("================== Ver por Id ================");
            System.out.println(repositorio.porId(2L));

            System.out.println("================== Editar Producto ================");
            Producto producto = new Producto();
            producto.setId(5L);
            producto.setNombre("Teclado Cosair k95 mecánico");
            producto.setPrecio(700);
            Categoria categoria = new Categoria();
            categoria.setId(2L);
            producto.setCategoria(categoria);
            repositorio.guardar(producto);
            System.out.println("Producto actualizado con éxito");
            System.out.println("================== Listar ================");
            repositorio.listar().forEach(System.out::println);


        } catch (SQLException e) {
            e.printStackTrace();

        }

    }
}
