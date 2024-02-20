package com.jdiaz.parte23curso_patrones_disenio.FACTORY;

public abstract class PizzeriaZonaAbstractFactory {

    public PizzaProducto ordenarPizza(String tipo){
        PizzaProducto pizza = crearpizza(tipo);
        System.out.println("--------Fabricando la pizza " + pizza.getNombre() + "--------");
        pizza.preparar();
        pizza.cocinar();
        pizza.cortar();
        pizza.empaquetar();
        return pizza;
    }

    abstract PizzaProducto crearpizza(String tipo);

}
