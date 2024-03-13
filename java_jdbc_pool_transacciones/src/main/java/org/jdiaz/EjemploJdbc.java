package org.jdiaz;

import org.jdiaz.modelo.Categoria;
import org.jdiaz.modelo.Producto;
import org.jdiaz.repositorio.CategoriaRepositorioImplement;
import org.jdiaz.repositorio.ProductoRepositorioImpl;
import org.jdiaz.repositorio.Repositorio;
import org.jdiaz.servicio.CatalogoServicio;
import org.jdiaz.servicio.Servicio;
import org.jdiaz.util.ConexionBaseDatos;

import java.sql.*;
import java.util.Date;

public class EjemploJdbc {
    public static void main(String[] args) throws SQLException {

        Servicio servicio = new CatalogoServicio();
        System.out.println("================== Listar ================");
        servicio.listar().forEach(System.out::println);


        System.out.println("==================Insertar nueva categoria==================");
        Categoria categoria = new Categoria();
        categoria.setNombre("Iluminación");


        System.out.println("================== Insertar Nuevo Producto ================");
        Producto producto = new Producto();
        producto.setNombre("Lámpara led escritorio");
        producto.setPrecio(990);
        producto.setFechaRegistro(new Date());
        producto.setSku("abcdefgh12");
        servicio.guardarProductoConCategoria(producto,categoria);
        System.out.println("Producto guardado con éxito: " + producto.getId());
        servicio.listar().forEach(System.out::println);


    }
}