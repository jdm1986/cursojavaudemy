package com.jdiaz.parte20curso_java8_Date_Time;

import java.time.LocalDate;
import java.time.Period;

public class EjemploPeriodo {
    public static void main(String[] args) {

        LocalDate fecha1 = LocalDate.of(2011,9,23);
        LocalDate fecha2 = LocalDate.of(2020,11,25);
        fecha2 = fecha2.withMonth(12); //para que asigne el mues nuevo, se debe volver a asignar.

        Period periodo = Period.between(fecha1,fecha2);
        System.out.println("periodo = " + periodo);
        System.out.printf("Periodo entre %s y %s hay %d años, %d meses y %d días",fecha1,fecha2,periodo.getYears(),periodo.getMonths(),periodo.getDays());




    }
}
