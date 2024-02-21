package com.jdiaz.parte23curso_patrones_disenio.FACTORY;

import com.jdiaz.parte23curso_patrones_disenio.FACTORY.PizzaProducto;
import com.jdiaz.parte23curso_patrones_disenio.FACTORY.PizzeriaZonaAbstractFactory;
import com.jdiaz.parte23curso_patrones_disenio.FACTORY.Producto.PizzaCaliforniaPepperoni;
import com.jdiaz.parte23curso_patrones_disenio.FACTORY.Producto.PizzaCaliforniaQueso;
import com.jdiaz.parte23curso_patrones_disenio.FACTORY.Producto.PizzaCaliforniaVegetariana;

public class PizzeriaCaliforniaFactory extends PizzeriaZonaAbstractFactory {
    @Override
    protected PizzaProducto crearpizza(String tipo) {
        PizzaProducto producto = null;
        switch (tipo){ //En la factoría de new Yor está el Switch de otra manera.
            case "queso":
                producto = new PizzaCaliforniaQueso();
                break;
            case "pepperoni":
                producto = new PizzaCaliforniaPepperoni();
                break;
            case "vegetariana":
                producto = new PizzaCaliforniaVegetariana();
                break;

        }
        return producto;
    }
}
