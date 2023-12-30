package com.jdiaz.ejercicios;

import java.util.Scanner;

public class EjercicioTanqueGasolina {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        double capacidad = 0;

        while (true) {
            System.out.println("Cuál es la capacidad del tanque debe ser entre 1 y 70 litros?");
            capacidad = scanner.nextDouble();
            if (capacidad < 1) {
                System.out.println("la capacidad debe ser entre 1 y 70 litros");
            } else if (capacidad > 70) {
                System.out.println("la capacidad debe ser entre 1 y 70 litros");
            } else {
                break;
            }
        }
        System.out.println("capacidad = " + capacidad);

        if (capacidad > 1 && capacidad < 20) {
            System.out.println("Capacidad insuficiente");
        } else if (capacidad >= 20 && capacidad < 35) {
            System.out.println("Capacidad Suficiente");
        } else if (capacidad >= 35 && capacidad < 40) {
            System.out.println("Medio estanque");
        } else if (capacidad >= 40 && capacidad < 60) {
            System.out.println("Estanque 3/4");
        } else if (capacidad >= 60 && capacidad < 70) {
            System.out.println("Estanque casi lleno");
        } else if (capacidad == 70) {
            System.out.println("Estaque lleno");
        }
    }
}
