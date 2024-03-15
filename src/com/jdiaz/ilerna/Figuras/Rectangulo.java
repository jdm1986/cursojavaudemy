package com.jdiaz.ilerna.Figuras;

public class Rectangulo extends FiguraGeometrica {

    private double base;
    public double altura;

    public Rectangulo(String colorRectangulo, double baseRectangulo, double alturaRectangulo) {
        super(colorRectangulo);
        this.base = baseRectangulo;
        this.altura = alturaRectangulo;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
