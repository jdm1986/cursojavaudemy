package org.jdiaz.repositorio;

import org.jdiaz.modelo.Producto;
import org.jdiaz.util.ConexionBaseDatos;

import java.sql.*;
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
             ResultSet resultSet = statement.executeQuery("SELECT * FROM productos")) {

            while (resultSet.next()) {
                Producto p = crearProducto(resultSet);
                productos.add(p);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return productos;
    }



    @Override
    public Producto porId(Long id) {
        Producto producto = null;
        try (PreparedStatement statement = getConnection().prepareStatement("SELECT * FROM productos WHERE id = ?")) {
            statement.setLong(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    producto = crearProducto(resultSet);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return producto;
    }

    @Override
    public void guardar(Producto producto) {

        String sql;
        if (producto.getId() != null && producto.getId() > 0) {
            sql = "UPDATE productos SET nombre =?, precio=? WHERE id=?";
        } else {
            sql = "INSERT INTO productos (nombre, precio, fecha_registro) VALUES(?,?,?)";
        }
        try (PreparedStatement statement = getConnection().prepareStatement(sql)){
            statement.setString(1, producto.getNombre());
            statement.setLong(2,producto.getPrecio());

            if (producto.getId() != null && producto.getId() > 0) {
                statement.setLong(3,producto.getId());
            } else {
                statement.setDate(3, new Date(producto.getFechaRegistro().getTime()));
            }

            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void eliminar(Long id) {

        try (PreparedStatement statement = getConnection().prepareStatement("DELETE FROM productos WHERE id =?")){
            statement.setLong(1,id);
            statement.executeUpdate();
        } catch (SQLException throwables){
            throwables.printStackTrace();
        }

    }
    private static Producto crearProducto(ResultSet resultSet) throws SQLException {
        Producto p = new Producto();
        p.setId(resultSet.getLong("id"));
        p.setNombre(resultSet.getString("nombre"));
        p.setPrecio(resultSet.getInt("precio"));
        p.setFechaRegistro(resultSet.getDate("fecha_registro"));
        return p;
    }
}
