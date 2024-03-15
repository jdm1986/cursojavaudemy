package com.jdiaz.parte23curso_patrones_disenio.FACTORY.Producto;

import com.jdiaz.parte23curso_patrones_disenio.FACTORY.PizzaProducto;

public class PizzaNewYorkItaliana extends PizzaProducto {
    public PizzaNewYorkItaliana() {
        super();
        nombre = "Pizza NewYork Italiana";
        masa = "Masa gruesa";
        salsa = "Salsa de tomate italiano con carne";
        ingredientes.add("Queso mozzarela");
        ingredientes.add("Aceitunas");
        ingredientes.add("Jamón");
        ingredientes.add("Chorizo");
        ingredientes.add("Champiñones");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 30 min a 120º");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando en tiras");
    }
}
