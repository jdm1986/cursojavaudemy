package com.jdiaz.ejercicios.CarroDeSupermercado;

public class NoPerecible extends Producto {
    private int conteo;
    private int calorias;
    public NoPerecible(String nombre, double precio, int conteo, int calorias) {
        super(nombre, precio);
        this.conteo = conteo;
        this.calorias = calorias;
    }

    public int getConteo() {
        return conteo;
    }

    public int getCalorias() {
        return calorias;
    }

    @Override
    public String toString() {
        return "NoPerecible{" +
                "conteo=" + conteo +
                ", calorias=" + calorias +
                "} " + super.toString();
    }
}
