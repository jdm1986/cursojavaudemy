package com.jdiaz.parte24curso_patrones_disenio_DECORATOR.Ejemplo2_CAFE_STARBUCKS;

public class Cafe implements Configurable{
    public Cafe(float precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }

    private float precio;
    private String nombre;
    @Override
    public float getPrecioBase() {
        return this.precio;
    }

    @Override
    public String getIngredientes() {
        return this.nombre;
    }
}
