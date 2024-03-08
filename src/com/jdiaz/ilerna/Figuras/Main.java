package com.jdiaz.ilerna.Figuras;

public class Main {
    public static void main(String[] args) {

        Triangulo triangulo = new Triangulo("Amarillo",5,10);
        System.out.println("El area del triángulo es " + triangulo.calcularArea());

        triangulo.setBase(20);
        triangulo.setAltura(50);
        System.out.println("El área ahora es: " + triangulo.calcularArea());

        Rectangulo rectangulo = new Rectangulo("Azul", 50.5, 600.50);
        System.out.println("Area rectángulo de color " + rectangulo.getColor() + " = " + rectangulo.calcularArea());

        Circulo circulo = new Circulo("Verde",50);
        System.out.println("El área del círculo " + circulo.getColor() + " es " + circulo.calcularArea());
    }
}
