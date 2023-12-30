package com.jdiaz.parte1curso_hastaPOO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        while (true) {
            System.out.println("Ingresa una fecha con este formato yyyy-MM-dd o pulse Enter para salir");
            String input = scanner.nextLine();

            if (input.equals("")){
                break;
            }

            try {
                Date fecha = format.parse(scanner.nextLine());
                System.out.println("fecha = " + fecha);
                System.out.println("format = " + format.format(fecha));
            } catch (ParseException e) {
                System.out.println("Formato incorrecto");
            }
        }

    }
}
