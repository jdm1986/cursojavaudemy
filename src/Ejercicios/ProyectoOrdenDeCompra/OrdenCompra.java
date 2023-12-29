package Ejercicios.ProyectoOrdenDeCompra;

import java.util.Date;

public class OrdenCompra {

    private static Integer ultimoIdentificador = 0;
    private Integer identificadorAutoIncrementable;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos = new Producto[4];

    public OrdenCompra(String descripcion) {
        this.descripcion = descripcion;
        this.identificadorAutoIncrementable = ++ultimoIdentificador;
    }

    public Integer getIdentificadorAutoIncrementable() {
        return identificadorAutoIncrementable;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addProducto(Producto producto) {
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] == null) { // Si hay espacio en el arreglo
                productos[i] = producto; // Asignamos el producto al arreglo
                return; // Salimos del método después de agregar el producto
            }
        }
        // Si llegamos aquí, significa que no hay espacio en el arreglo
        System.out.println("No se puede agregar más productos, el arreglo está lleno.");
    }
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            if (producto != null) { // Asegurarse de que el producto no sea null
                total += producto.getPrecio();
            }
        }
        return total;


    }


}


