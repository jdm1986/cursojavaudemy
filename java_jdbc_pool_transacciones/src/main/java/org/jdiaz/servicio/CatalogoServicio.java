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
        try (Connection conn = ConexionBaseDatos.getConnection()) {
            productoRepositorio.setConn(conn);
            return productoRepositorio.listar();
        }

    }

    @Override
    public Producto porId(Long id) throws SQLException {
        try (Connection conn = ConexionBaseDatos.getConnection()) {
            productoRepositorio.setConn(conn);
            return productoRepositorio.porId(id);
        }

    }

    @Override
    public Producto guardar(Producto producto) throws SQLException {
        try (Connection conn = ConexionBaseDatos.getConnection()) {
            productoRepositorio.setConn(conn);
            if (conn.getAutoCommit()) {
                conn.setAutoCommit(false);
            }
            Producto nuevoProducto = null;
            try {
                nuevoProducto = productoRepositorio.guardar(producto);
                conn.commit();
            } catch (SQLException e) {
                conn.rollback();
                e.printStackTrace();
            }
            return nuevoProducto;
        }

    }

    @Override
    public void eliminar(Long id) throws SQLException {
        try (Connection conn = ConexionBaseDatos.getConnection()) {
            productoRepositorio.setConn(conn);
            if (conn.getAutoCommit()) {
                conn.setAutoCommit(false);
            }
            try {
                productoRepositorio.eliminar(id);
                conn.commit();
            } catch (SQLException e) {
                conn.rollback();
            }
        }

    }

    @Override
    public List<Categoria> listarCategoria() throws SQLException {
        try (Connection conn = ConexionBaseDatos.getConnection()) {
            categoriaRepositorio.setConn(conn);
            return categoriaRepositorio.listar();
        }

    }

    @Override
    public Categoria porIdCategoria(Long id) throws SQLException {
        try (Connection conn = ConexionBaseDatos.getConnection()) {
            categoriaRepositorio.setConn(conn);
            return categoriaRepositorio.porId(id);
        }

    }

    @Override
    public Categoria guardarCategoria(Categoria categoria) throws SQLException {
        try (Connection conn = ConexionBaseDatos.getConnection()) {
            categoriaRepositorio.setConn(conn);
            if (conn.getAutoCommit()) {
                conn.setAutoCommit(false);
            }
            Categoria nuevaCategoria = null;
            try {
                nuevaCategoria = categoriaRepositorio.guardar(categoria);
                conn.commit();
            } catch (SQLException e) {
                conn.rollback();
                e.printStackTrace();
            }
            return nuevaCategoria;
        }

    }

    @Override
    public void eliminarCategoria(Long id) throws SQLException {
        try (Connection conn = ConexionBaseDatos.getConnection()) {
            categoriaRepositorio.setConn(conn);
            if (conn.getAutoCommit()) {
                conn.setAutoCommit(false);
            }
            try {
                categoriaRepositorio.eliminar(id);
                conn.commit();
            } catch (SQLException e) {
                conn.rollback();
            }
        }

    }

    @Override
    public void guardarProductoConCategoria(Producto producto, Categoria categoria) throws SQLException {
        try (Connection conn = ConexionBaseDatos.getConnection()) {
            productoRepositorio.setConn(conn);
            categoriaRepositorio.setConn(conn);
            if (conn.getAutoCommit()) {
                conn.setAutoCommit(false);
            }
            try {
                Categoria nuevaCateogria = categoriaRepositorio.guardar(categoria);
                producto.setCategoria(nuevaCateogria);
                productoRepositorio.guardar(producto);
                conn.commit();
            } catch (SQLException e) {
                conn.rollback();
            }
        }

    }
}
