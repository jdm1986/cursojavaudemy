package com.jdiaz.ejercicios.CarroDeSupermercado;

public class Lacteo extends Producto{
    private int cantidad;
     private int proteinas;
    public Lacteo(String nombre, double precio, int cantidad, int proteinas) {
        super(nombre, precio);
        this.cantidad = cantidad;
        this.proteinas = proteinas;
    }

    @Override
    public String toString() {
        return "Lacteo{" +
                "cantidad=" + cantidad +
                ", proteinas=" + proteinas +
                "} " + super.toString();
    }
}
