package com.jdiaz.ejercicios;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class CalcularEdadAPartirDeFechaDeNacimiento {
    public static void main(String[] args) {



        //Scanner scanner = new Scanner(System.in);
        String entrada = JOptionPane.showInputDialog("Introduzca fecha de nacimiento dd-MM-yyyy");
        //System.out.println("Introduzca fecha de nacimiento dd-MM-yyyy");
        String fechaDeNacimientoStr = entrada;//scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate fechaDeNacimiento = LocalDate.parse(fechaDeNacimientoStr,formatter);

        LocalDate fechaActual = LocalDate.now();

        Period periodoEntreFechas = Period.between(fechaDeNacimiento,fechaActual);

        int edad = periodoEntreFechas.getYears();

        JOptionPane.showMessageDialog(null,"La edad es de " + edad + "años");

        //System.out.println("edad = " + edad+ " años");




    }
}
