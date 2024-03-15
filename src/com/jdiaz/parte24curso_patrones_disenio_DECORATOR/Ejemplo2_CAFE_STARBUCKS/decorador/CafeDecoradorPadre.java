package com.jdiaz.parte24curso_patrones_disenio_DECORATOR.Ejemplo2_CAFE_STARBUCKS.decorador;

import com.jdiaz.parte24curso_patrones_disenio_DECORATOR.Ejemplo2_CAFE_STARBUCKS.Configurable;

public abstract class CafeDecoradorPadre implements Configurable {
    protected Configurable cafe;

    public CafeDecoradorPadre(Configurable cafe) {
        this.cafe = cafe;
    }
}
