package org.jdiaz;

import org.jdiaz.modelo.Categoria;
import org.jdiaz.modelo.Producto;
import org.jdiaz.repositorio.CategoriaRepositorioImplement;
import org.jdiaz.repositorio.ProductoRepositorioImpl;
import org.jdiaz.repositorio.Repositorio;
import org.jdiaz.util.ConexionBaseDatos;

import java.sql.*;
import java.util.Date;

public class EjemploJdbc {
    public static void main(String[] args) throws SQLException {



            try (Connection conn = ConexionBaseDatos.getConnection()) {
                if(conn.getAutoCommit()){
                    conn.setAutoCommit(false);
                }
                try {

                    Repositorio<Categoria> repositorioCategoria = new CategoriaRepositorioImplement(conn);
                    System.out.println("==================Insertar nueva categoria==================");
                    Categoria categoria = new Categoria();
                    categoria.setNombre("ElectroHogar");
                    Categoria nuevaCategoria = repositorioCategoria.guardar(categoria);
                    System.out.println("Categoría guardada con éxito: " + nuevaCategoria.getId());

                    Repositorio<Producto> repositorio = new ProductoRepositorioImpl(conn);
                    System.out.println("================== Listar ================");
                    repositorio.listar().forEach(System.out::println);

                    System.out.println("================== Ver por Id ================");
                    System.out.println(repositorio.porId(1L));

                    System.out.println("================== Insertar Nuevo Producto ================");
                    Producto producto = new Producto();
                    producto.setNombre("Refrigerador Samsung");
                    producto.setPrecio(9900);
                    producto.setFechaRegistro(new Date());
                    producto.setSku("abcf12345");

                    producto.setCategoria(nuevaCategoria);
                    repositorio.guardar(producto);
                    System.out.println("Producto guardado con éxito: " + producto.getId());
                    System.out.println("================== Listar ================");
                    repositorio.listar().forEach(System.out::println);

                    conn.commit();
                } catch (SQLException e){
                    conn.rollback();
                    e.printStackTrace();
                }
            }
    }
}
