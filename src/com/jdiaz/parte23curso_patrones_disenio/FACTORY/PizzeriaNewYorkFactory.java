package com.jdiaz.parte23curso_patrones_disenio.FACTORY;

import com.jdiaz.parte23curso_patrones_disenio.FACTORY.PizzaProducto;
import com.jdiaz.parte23curso_patrones_disenio.FACTORY.PizzeriaZonaAbstractFactory;
import com.jdiaz.parte23curso_patrones_disenio.FACTORY.Producto.PizzaNewYorkItaliana;
import com.jdiaz.parte23curso_patrones_disenio.FACTORY.Producto.PizzaNewYorkPeperoni;
import com.jdiaz.parte23curso_patrones_disenio.FACTORY.Producto.PizzaNewYorkVegetariana;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory {
    @Override
    protected PizzaProducto crearpizza(String tipo) {
        return switch (tipo) {
            case "vegetariana" -> new PizzaNewYorkVegetariana();
            case "peperoni" -> new PizzaNewYorkPeperoni();
            case "italiana" -> new PizzaNewYorkItaliana();
            default -> null;
        };
    }
}
