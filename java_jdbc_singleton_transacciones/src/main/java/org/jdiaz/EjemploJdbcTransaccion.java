package org.jdiaz;

import org.jdiaz.modelo.Categoria;
import org.jdiaz.modelo.Producto;
import org.jdiaz.repositorio.ProductoRepositorioImpl;
import org.jdiaz.repositorio.Repositorio;
import org.jdiaz.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

public class EjemploJdbcTransaccion {
    public static void main(String[] args) throws SQLException {


        try (Connection connection = ConexionBaseDatos.getInstance()) {
            if (connection.getAutoCommit()) {
                connection.setAutoCommit(false);
            }
            try {

                Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
                System.out.println("================== Listar ================");
                repositorio.listar().forEach(System.out::println);

                System.out.println("================== Ver por Id ================");
                System.out.println(repositorio.porId(1L));

                System.out.println("================== Insertar Nuevo Producto ================");
                Producto producto = new Producto();
                producto.setNombre("Teclado IBM mecánico");
                producto.setPrecio(1550);
                producto.setFechaRegistro(new Date());
                Categoria categoria = new Categoria();
                categoria.setId(3L);
                producto.setCategoria(categoria);
                producto.setSku("abcde12345");
                repositorio.guardar(producto);
                System.out.println("Producto guardado con éxito");

                System.out.println("================== Editar Producto ================");
                producto = new Producto();
                producto.setId(5L);
                producto.setNombre("Teclado Cosair k95 mecánico");
                producto.setPrecio(1000);
                producto.setSku("abcdef1234");
                categoria = new Categoria();
                categoria.setId(2L);
                producto.setCategoria(categoria);
                repositorio.guardar(producto);
                System.out.println("Producto actualizado con éxito");
                System.out.println("================== Listar ================");
                repositorio.listar().forEach(System.out::println);

                connection.commit();
            } catch (SQLException exception) {
                connection.rollback();
                exception.printStackTrace();
            }
        }
    }
}