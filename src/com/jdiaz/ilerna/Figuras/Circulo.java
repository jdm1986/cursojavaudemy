package com.jdiaz.ilerna.Figuras;

public class Circulo extends FiguraGeometrica {

    private double radio;

    public Circulo(String colorCirculo, double radioCirculo) {
        super(colorCirculo);
        this.radio = radioCirculo;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
