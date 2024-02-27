package org.jdiaz;

import org.jdiaz.util.ConexionBaseDatos;

import java.sql.*;

public class EjemploJdbc {
    public static void main(String[] args) {


        int incremento = 1;

        try (Connection connection = ConexionBaseDatos.getInstance();
             Statement statement = connection.createStatement();
             ResultSet resultado = statement.executeQuery("SELECT * FROM productos")) {

            while (resultado.next()){
                System.out.print(resultado.getString("nombre"));
                System.out.print(" | ");
                System.out.print(resultado.getInt("id"));
                System.out.print(" | ");
                System.out.print(resultado.getInt("precio"));
                System.out.print(" | ");
                System.out.print(resultado.getDate("fecha_registro"));
                System.out.print(" | ");
                System.out.println("registro " + incremento++);
            }

        } catch (SQLException e) {
            e.printStackTrace();

        }

    }
}
