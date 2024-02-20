package com.jdiaz.parte23curso_patrones_disenio.FACTORY;

import com.jdiaz.parte23curso_patrones_disenio.FACTORY.Producto.PizzaNewYorkItaliana;
import com.jdiaz.parte23curso_patrones_disenio.FACTORY.Producto.PizzaNewYorkPeperoni;
import com.jdiaz.parte23curso_patrones_disenio.FACTORY.Producto.PizzaNewYorkVegetariana;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory{
    @Override
    PizzaProducto crearpizza(String tipo) {
        PizzaProducto producto = null;
        switch (tipo){
            case "vegetariana":
                producto = new PizzaNewYorkVegetariana();
                break;
            case "peperoni":
                producto = new PizzaNewYorkPeperoni();
                break;
            case "italiana":
                producto = new PizzaNewYorkItaliana();

        }
        return producto;
    }
}
