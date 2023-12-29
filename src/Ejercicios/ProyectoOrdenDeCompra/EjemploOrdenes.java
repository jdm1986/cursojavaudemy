package Ejercicios.ProyectoOrdenDeCompra;


import java.util.Date;

public class EjemploOrdenes {

    public static void main(String[] args) {

        Cliente pepe = new Cliente("Pepe", "Cabello");
        Cliente ana = new Cliente("Ana", "Delgado");
        Cliente angel = new Cliente("Ángel", "Pérez");

        Producto productoTvSony = new Producto("Sony", "TV-SONY60", 1200);
        Producto productoAgenda = new Producto("Alcatel", "Agenda", 50);
        Producto productoLavadora = new Producto("Bosh", "Lavadora", 500);
        Producto productoSmartPhone = new Producto("Samsung", "GalaxyNote", 1000);
        Producto productoSmartPhone2 = new Producto("Apple", "Iphone15pro", 1200);
        Producto productoFrigorífico = new Producto("Balay", "Comby", 400);
        Producto productoTvLG = new Producto("LG", "TV-LG49", 900);
        Producto productoPc = new Producto("Asus", "P-Gaming", 600);
        Producto productoLavavajillas = new Producto("Whirepool", "LavaplatosInfinito", 700);

        OrdenCompra ordenCompraPepe = new OrdenCompra("Compra de Pepe");
        ordenCompraPepe.setCliente(pepe);
        ordenCompraPepe.setFecha(new Date());
        ordenCompraPepe.addProducto(productoTvSony);
        ordenCompraPepe.addProducto(productoAgenda);
        ordenCompraPepe.addProducto(productoLavadora);
        ordenCompraPepe.addProducto(productoSmartPhone);

        OrdenCompra ordenCompraAna = new OrdenCompra("Compra de Ana");
        ordenCompraAna.setCliente(ana);
        ordenCompraAna.setFecha(new Date());
        ordenCompraAna.addProducto(productoSmartPhone2);
        ordenCompraAna.addProducto(productoFrigorífico);
        ordenCompraAna.addProducto(productoTvLG);
        ordenCompraAna.addProducto(productoPc);

        OrdenCompra ordenCompraAngel = new OrdenCompra("Compra de Ángel");
        ordenCompraAngel.setCliente(angel);
        ordenCompraAngel.setFecha(new Date());
        ordenCompraAngel.addProducto(productoLavavajillas);
        ordenCompraAngel.addProducto(productoTvLG);
        ordenCompraAngel.addProducto(productoTvSony);
        ordenCompraAngel.addProducto(productoAgenda);

        ImprimirDetalle.imprimirDetalleOrden(ordenCompraPepe);
        ImprimirDetalle.imprimirDetalleOrden(ordenCompraAna);
        ImprimirDetalle.imprimirDetalleOrden(ordenCompraAngel);
    }



    }



