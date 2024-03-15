package com.jdiaz.ilerna.EjercicioLibro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Libro libro1 = new Libro("978-3-16-148410-0", "Autor 1", "Título 1", 2021, "Editorial 1", 300);
        Libro libro2 = new Libro("978-1-23-456789-7", "Autor 2", "Título 2", 2019, "Editorial 2", 250);
        Libro libro3 = LibroCreator.crearLibroDesdeConsola();

        libro1.imprimirInformacionDelLibro();
        System.out.println("=============================================================");
        libro2.imprimirInformacionDelLibro();
        System.out.println("=============================================================");
        libro3.imprimirInformacionDelLibro();
        System.out.println("=============================================================");



    }


}
