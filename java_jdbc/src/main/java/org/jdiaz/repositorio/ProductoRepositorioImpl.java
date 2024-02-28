package org.jdiaz.repositorio;

import org.jdiaz.modelo.Producto;
import org.jdiaz.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductoRepositorioImpl implements Repositorio<Producto> {

    private Connection getConnection() throws SQLException {
        return ConexionBaseDatos.getInstance();
    }

    @Override
    public List<Producto> listar() {
        List<Producto> productos = new ArrayList<>();

        try (Statement statement = getConnection().createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM productos")){

            while (resultSet.next()){
                Producto p = new Producto();
                p.setId(resultSet.getLong("id"));
                p.setNombre(resultSet.getString("nombre"));
                p.setPrecio(resultSet.getInt("precio"));
                p.setFechaRegistro(resultSet.getDate("fecha_registro"));
                productos.add(p);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return productos;
    }

    @Override
    public Producto porId(Long id) {
        return null;
    }

    @Override
    public void guardar(Producto producto) {

    }

    @Override
    public void eliminar(Long id) {

    }
}
