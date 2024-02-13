package com.jdiaz.ejercicios;

import java.util.Arrays;

public class AplanarArregloBidimensionalEnUnNivelYEliminarRepetidos {
    public static void main(String[] args) {

        String[][] lenguajes = {{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"}, {"java", "javascript", "kotlin"}, {"javascript"}, {}};

        String [] aplanarArray = Arrays.stream(lenguajes)
                .flatMap(Arrays::stream)//aplano elementos
                .distinct()//elimino elementos repetidos
                .toArray(String[]::new); //convierto el resultado en un arreglo de cadenas

        System.out.println(Arrays.toString(aplanarArray));

    }
}
