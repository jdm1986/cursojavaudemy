package com.jdiaz.ejercicios;

import java.time.*;
import java.util.Scanner;

public class CalcularEdad {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca su fecha de nacimiento en formato YYYY-MM-DD:");
        String fechaDeNacimientoStr = scanner.nextLine();

        LocalDate fechaDeNacimiento = LocalDate.parse(fechaDeNacimientoStr);

        LocalDate fechaActual = LocalDate.now();
        int edad = Period.between(fechaDeNacimiento, fechaActual).getYears();

        System.out.println("Edad: " + edad + " años");
    }
}
