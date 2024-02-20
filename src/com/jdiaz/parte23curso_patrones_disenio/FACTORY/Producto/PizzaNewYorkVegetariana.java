package com.jdiaz.parte23curso_patrones_disenio.FACTORY.Producto;

import com.jdiaz.parte23curso_patrones_disenio.FACTORY.PizzaProducto;

public class PizzaNewYorkVegetariana extends PizzaProducto {

    public PizzaNewYorkVegetariana() {

        super();
        nombre = "Pizza veteriana New York";
        masa = "Masa integral vegana";
        salsa = "Salsa de tomate";
        ingredientes.add("Queso vegano");
        ingredientes.add("Tomate");
        ingredientes.add("Aceitunas");
        ingredientes.add("Espinacas");
        ingredientes.add("Berengenas");


    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 25 min a 150º");;
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas cuadradas");
    }
}
