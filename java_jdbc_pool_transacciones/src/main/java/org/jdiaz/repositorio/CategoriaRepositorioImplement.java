package org.jdiaz.repositorio;

import org.jdiaz.modelo.Categoria;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoriaRepositorioImplement implements Repositorio<Categoria> {

    private Connection conn;

    public CategoriaRepositorioImplement(Connection conn) {
        this.conn = conn;
    }

    @Override
    public List<Categoria> listar() throws SQLException {
        List<Categoria> categorias = new ArrayList<>();
        Statement stmt = conn.createStatement();
        ResultSet resultSet = stmt.executeQuery("SELECT * FROM categorias");
        while (resultSet.next()) {
            categorias.add(crearCategoria(resultSet));
        }
        return categorias; // Retorna la lista de categorías
    }


    @Override
    public Categoria porId(Long id) throws SQLException {
        Categoria categoria = null;
        try (PreparedStatement statement = conn.prepareStatement("SELECT * FROM categorias as c WHERE c.id=?")) {
            statement.setLong(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    categoria = crearCategoria(resultSet); // Corrección aquí
                }
            }
        }
        return categoria;
    }


        @Override
        public Categoria guardar (Categoria categoria) throws SQLException {
        String sql = null;
            if (categoria.getId() !=  null && categoria.getId()>0){
                sql = "UPDATE categorias SET nombre =? WHERE id=?";
            } else {
                sql = "INSERT INTO categorias(nombre) VALUES(?)";
            }
            try(PreparedStatement statement = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)){
                statement.setString(1,categoria.getNombre());
                if(categoria.getId() != null&& categoria.getId()>0){
                    statement.setLong(2,categoria.getId());
                }
                statement.executeUpdate();

                if(categoria.getId()==null){
                    try (ResultSet resultSet = statement.getGeneratedKeys()){
                        if(resultSet.next()){
                            categoria.setId(resultSet.getLong(1));
                        }
                    }
                }
            }
            return categoria;
        }

        @Override
        public void eliminar (Long id) throws SQLException {
            try(PreparedStatement statement = conn.prepareStatement("DELETE FROM categorias WHERE id=?")){
                statement.setLong(1,id);
                statement.executeUpdate();
            }
        }

        private static Categoria crearCategoria (ResultSet resultSet) throws SQLException {
            Categoria cat = new Categoria();
            cat.setId(resultSet.getLong("id"));
            cat.setNombre(resultSet.getString("nombre"));
            return cat;
        }
    }
