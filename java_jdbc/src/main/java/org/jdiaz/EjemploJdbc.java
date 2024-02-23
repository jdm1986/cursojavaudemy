package org.jdiaz;

import java.sql.*;

public class EjemploJdbc {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/java_curso";
        String username = "root";
        String password = "$1482Zaid$";

        try ( Connection connection = DriverManager.getConnection(url,username,password); //de esta forma se hace autoClose
        Statement statement = connection.createStatement();
        ResultSet resultado = statement.executeQuery("SELECT * FROM productos")) {

            while (resultado.next()){
                System.out.print(resultado.getString("nombre"));
                System.out.print(" | ");
                System.out.print(resultado.getInt("id"));
                System.out.print(" | ");
                System.out.print(resultado.getInt("precio"));
                System.out.print(" | ");
                System.out.println(resultado.getDate("fecha_registro"));
            }

        } catch (SQLException e) {
            e.printStackTrace();

        }

    }
}
