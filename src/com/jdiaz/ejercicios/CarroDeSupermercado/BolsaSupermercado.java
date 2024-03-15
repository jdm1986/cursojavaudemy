package com.jdiaz.ejercicios.CarroDeSupermercado;

import java.util.ArrayList;
import java.util.List;

public class BolsaSupermercado <T>{
    private List<T> productos;

    public BolsaSupermercado() {
        productos = new ArrayList<T>();
    }

    public boolean addProducto (T producto){
        if(productos.size()<5){
            productos.add(producto);
            return true;
        } else {
            System.out.println("No se pueden agregar más productos a la bolsa");
            return false;
        }
    }

    public List<T> getProductos() {
        return productos;
    }
}
