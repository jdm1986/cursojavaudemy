package com.jdiaz.ejercicios.AlmacenConsumo;

public class NoPerecedero extends Producto{
    int contenido;
    int calorias;
    public NoPerecedero(String nombre, double precio, int contenido, int calorias) {
        super(nombre, precio);
        this.contenido = contenido;
        this.calorias = calorias;
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\tcontenido=" + contenido +
                ", calorias=" + calorias;
    }
}
