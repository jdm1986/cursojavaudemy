package Ejercicios.ProyectoOrdenDeCompra;

public class ImprimirDetalle {

    public static void imprimirDetalleOrden(OrdenCompra orden) {

        System.out.println("Orden id: " + orden.getIdentificadorAutoIncrementable());
        System.out.println("Cliente: " + orden.getCliente().getNombre() + " " + orden.getCliente().getApellidos());
        System.out.println("Fecha: " + orden.getFecha());
        System.out.println("Productos: ");
        for (Producto producto : orden.getProductos()) {
            if (producto != null) {
                System.out.println(" - " + producto.getNombre() + " de " + producto.getFabricante() + " a " + producto.getPrecio() + " Euros");
            }
        }
        System.out.println("Gran total " + orden.calcularTotal() + " Euros ");

    }
}