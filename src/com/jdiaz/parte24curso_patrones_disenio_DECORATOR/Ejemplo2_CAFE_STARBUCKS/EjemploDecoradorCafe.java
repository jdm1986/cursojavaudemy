package com.jdiaz.parte24curso_patrones_disenio_DECORATOR.Ejemplo2_CAFE_STARBUCKS;

import com.jdiaz.parte24curso_patrones_disenio_DECORATOR.Ejemplo2_CAFE_STARBUCKS.decorador.ConChocolateDecorador;
import com.jdiaz.parte24curso_patrones_disenio_DECORATOR.Ejemplo2_CAFE_STARBUCKS.decorador.ConCremaDecorador;
import com.jdiaz.parte24curso_patrones_disenio_DECORATOR.Ejemplo2_CAFE_STARBUCKS.decorador.ConLecheDecorador;

public class EjemploDecoradorCafe {
    public static void main(String[] args) {

        Configurable cafe = new Cafe(7,"Cafe Mocha");
        ConCremaDecorador conCrema = new ConCremaDecorador(cafe);
        ConLecheDecorador conLeche = new ConLecheDecorador(conCrema);
        ConChocolateDecorador conChocolate = new ConChocolateDecorador(conLeche);

        System.out.println("El precio del café mocha es:" + conChocolate.getPrecioBase());
        System.out.println("Los Ingredientes: " + conChocolate.getIngredientes());

        Configurable cafeCapuchino = new Cafe(4,"Cafe Capuchino");
        conCrema = new ConCremaDecorador(cafeCapuchino);
        conLeche = new ConLecheDecorador(conCrema);

        System.out.println("El precio del café capuchino es: " + conLeche.getPrecioBase());
        System.out.println("Los ingredientes son: " + conLeche.getIngredientes());

        Configurable cafeExpresso = new Cafe(3,"Café Expresso");
        System.out.println("El precio del café expreso: " + cafeExpresso.getPrecioBase());
        System.out.println("Los ingredientes son: " + cafeExpresso.getIngredientes());

    }
}
