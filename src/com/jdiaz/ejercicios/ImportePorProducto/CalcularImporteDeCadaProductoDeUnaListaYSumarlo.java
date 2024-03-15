package com.jdiaz.ejercicios.ImportePorProducto;

import java.util.ArrayList;
import java.util.List;

public class CalcularImporteDeCadaProductoDeUnaListaYSumarlo {

    public static void main(String[] args) {

        List<Producto> productos = new ArrayList<>();

        productos.add(new Producto(10.5,3));
        productos.add(new Producto(20.0,2));
        productos.add(new Producto(15.75,4));

        double total = productos.stream()
                .mapToDouble(producto -> producto.getPrecio()* producto.getCantidad())
                .sum();

        System.out.println("total = " + total);

    }

}
