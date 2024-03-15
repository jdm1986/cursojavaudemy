package com.jdiaz.parte23curso_patrones_disenio.FACTORY.Producto;

import com.jdiaz.parte23curso_patrones_disenio.FACTORY.PizzaProducto;

public class PizzaCaliforniaPepperoni extends PizzaProducto {
    public PizzaCaliforniaPepperoni() {
        super();
        nombre = "Pizza California Pepperoni";
        masa = "Masa a la piedra gruesa";
        ingredientes.add("Pepperoni");
        ingredientes.add("Extra de queso mozzarellla");
        ingredientes.add("Aceitunas");

    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando 50 minutos a 66ºc");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando en pequeños rectángulos");
    }
}
