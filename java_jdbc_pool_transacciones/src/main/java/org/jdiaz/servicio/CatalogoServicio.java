package org.jdiaz.servicio;

import org.jdiaz.modelo.Categoria;
import org.jdiaz.modelo.Producto;
import org.jdiaz.repositorio.CategoriaRepositorioImplement;
import org.jdiaz.repositorio.ProductoRepositorioImpl;
import org.jdiaz.repositorio.Repositorio;
import org.jdiaz.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class CatalogoServicio implements Servicio {

    private Repositorio<Producto> productoRepositorio;
    private Repositorio<Categoria> categoriaRepositorio;

    public CatalogoServicio() {
        this.productoRepositorio = new ProductoRepositorioImpl();
        this.categoriaRepositorio = new CategoriaRepositorioImplement();
    }

    @Override
    public List<Producto> listar() throws SQLException {
        try(Connection conn = ConexionBaseDatos.getConnection()){
            productoRepositorio.setConn(conn);
        }
        return null;
    }

    @Override
    public Producto porId(Long id) throws SQLException {
        try(Connection conn = ConexionBaseDatos.getConnection()){
            productoRepositorio.setConn(conn);
        }
        return null;
    }

    @Override
    public Producto guardar(Producto producto) throws SQLException {
        try(Connection conn = ConexionBaseDatos.getConnection()){
            productoRepositorio.setConn(conn);
        }
        return null;
    }

    @Override
    public void eliminar(Long id) throws SQLException {
        try(Connection conn = ConexionBaseDatos.getConnection()){
            productoRepositorio.setConn(conn);
        }

    }

    @Override
    public List<Categoria> listarCategoria() throws SQLException {
        try(Connection conn = ConexionBaseDatos.getConnection()){
            categoriaRepositorio.setConn(conn);
        }
        return null;
    }

    @Override
    public Categoria porIdCategoria(Long id) throws SQLException {
        try(Connection conn = ConexionBaseDatos.getConnection()){
            categoriaRepositorio.setConn(conn);
        }
        return null;
    }

    @Override
    public Categoria guardarCategoria() throws SQLException {
        try(Connection conn = ConexionBaseDatos.getConnection()){
            categoriaRepositorio.setConn(conn);
        }
        return null;
    }

    @Override
    public void eliminarCategoria(Long id) throws SQLException {
        try(Connection conn = ConexionBaseDatos.getConnection()){
            categoriaRepositorio.setConn(conn);
        }

    }

    @Override
    public void guardarProductoConCategoria(Producto producto, Categoria categoria) throws SQLException {
        try(Connection conn = ConexionBaseDatos.getConnection()){
            productoRepositorio.setConn(conn);
            categoriaRepositorio.setConn(conn);
        }

    }
}
