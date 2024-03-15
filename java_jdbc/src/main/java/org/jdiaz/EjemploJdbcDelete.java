package org.jdiaz;

import org.jdiaz.modelo.Producto;
import org.jdiaz.repositorio.ProductoRepositorioImpl;
import org.jdiaz.repositorio.Repositorio;
import org.jdiaz.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.SQLException;

public class EjemploJdbcDelete {
    public static void main(String[] args) {


        int incremento = 1;

        try (Connection connection = ConexionBaseDatos.getInstance()) {

            Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
            System.out.println("================== Listar ================");
            repositorio.listar().forEach(System.out::println);

            System.out.println("================== Ver por Id ================");
            System.out.println(repositorio.porId(2L));

            System.out.println("================== Eliminar Producto ================");

            repositorio.eliminar(3L);
            System.out.println("Producto eliminado con éxito");
            System.out.println("================== Listar ================");
            repositorio.listar().forEach(System.out::println);


        } catch (SQLException e) {
            e.printStackTrace();

        }

    }
}
