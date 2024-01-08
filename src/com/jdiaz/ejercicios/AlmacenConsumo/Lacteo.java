package com.jdiaz.ejercicios.AlmacenConsumo;

public class Lacteo extends Producto{
    int cantidad;
    int proteinas;
    public Lacteo(String nombre, double precio,int cantidad,int proteinas) {
        super(nombre, precio);
        this.cantidad = cantidad;
        this.proteinas = proteinas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getProteinas() {
        return proteinas;
    }

    public void setProteinas(int proteinas) {
        this.proteinas = proteinas;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\tcantidad=" + cantidad +
                ", proteinas=" + proteinas;
    }
}
