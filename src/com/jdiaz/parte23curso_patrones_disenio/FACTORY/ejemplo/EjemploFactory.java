package com.jdiaz.parte23curso_patrones_disenio.FACTORY.ejemplo;

import com.jdiaz.parte23curso_patrones_disenio.FACTORY.PizzaProducto;
import com.jdiaz.parte23curso_patrones_disenio.FACTORY.PizzeriaCaliforniaFactory;
import com.jdiaz.parte23curso_patrones_disenio.FACTORY.PizzeriaNewYorkFactory;
import com.jdiaz.parte23curso_patrones_disenio.FACTORY.PizzeriaZonaAbstractFactory;

public class EjemploFactory {
    public static void main(String[] args) {

        PizzeriaZonaAbstractFactory newYorkFactory = new PizzeriaNewYorkFactory();
        PizzeriaZonaAbstractFactory californiaFactory = new PizzeriaCaliforniaFactory();

        PizzaProducto pizza = californiaFactory.ordenarPizza("queso");
        System.out.println("Bruce ordena la pizza " + pizza.getNombre());

        pizza = newYorkFactory.ordenarPizza("peperoni");
        System.out.println("Andrés ordena una " + pizza.getNombre());

        pizza = californiaFactory.ordenarPizza("vegetariana");
        System.out.println("James ordena " + pizza.getNombre());

        pizza = newYorkFactory.ordenarPizza("vegetariana");
        System.out.println("Linus ordena la pizza " + pizza.getNombre());

        pizza = californiaFactory.ordenarPizza("pepperoni");
        System.out.println("John ordena la pizza" + pizza.getNombre());

        System.out.println("pizza = " + pizza);

    }
}
