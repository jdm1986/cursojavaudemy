package com.jdiaz.ilerna.Figuras;

public abstract class FiguraGeometrica {

    private String color;

    public FiguraGeometrica(String colorFigura) {
        this.color = colorFigura;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double calcularArea();
}
