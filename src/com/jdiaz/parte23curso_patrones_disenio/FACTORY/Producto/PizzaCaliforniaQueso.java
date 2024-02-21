package com.jdiaz.parte23curso_patrones_disenio.FACTORY.Producto;

import com.jdiaz.parte23curso_patrones_disenio.FACTORY.PizzaProducto;

public class PizzaCaliforniaQueso extends PizzaProducto {
    public PizzaCaliforniaQueso() {
        super();
        nombre = "Pizza California Queso";
        masa = "Masa a la piedra delgada";
        salsa = "Salsa de tomate rúcula";
        ingredientes.add("Extra de queso Mozzarella");
        ingredientes.add("Cebolla");
        ingredientes.add("Queso azul");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando a 35 min a 100ºc");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en círculos");
    }
}
