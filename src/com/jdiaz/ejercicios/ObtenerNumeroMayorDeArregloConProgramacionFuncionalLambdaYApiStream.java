package com.jdiaz.ejercicios;

import java.util.Arrays;

public class ObtenerNumeroMayorDeArregloConProgramacionFuncionalLambdaYApiStream {
    public static void main(String[] args) {

        int [] array = {12, 45, 67, 23, 98, 54, 32};

        int numeroMayor = Arrays.stream(array)
                .reduce(Integer.MIN_VALUE,(a,b) -> Math.max(a, b));

        System.out.println("numeroMayor = " + numeroMayor);

    }
}
