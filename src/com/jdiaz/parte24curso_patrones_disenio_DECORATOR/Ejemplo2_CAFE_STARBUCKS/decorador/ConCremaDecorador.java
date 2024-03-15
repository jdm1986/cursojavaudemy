package com.jdiaz.parte24curso_patrones_disenio_DECORATOR.Ejemplo2_CAFE_STARBUCKS.decorador;

import com.jdiaz.parte24curso_patrones_disenio_DECORATOR.Ejemplo2_CAFE_STARBUCKS.Configurable;

public class ConCremaDecorador extends CafeDecoradorPadre{
    public ConCremaDecorador(Configurable cafe) {
        super(cafe);
    }

    @Override
    public float getPrecioBase() {
        return cafe.getPrecioBase() + 2.5f;
    }

    @Override
    public String getIngredientes() {
        return cafe.getIngredientes() + ", Crema";
    }
}
