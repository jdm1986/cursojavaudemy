package com.jdiaz.ilerna.EjercicioLibro;

import java.util.Scanner;

public class LibroCreator {
    public static Libro crearLibroDesdeConsola() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca los datos del tercer libro:");
        System.out.print("ISBN: ");
        String isbn = scanner.nextLine();
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Año de Publicación: ");
        int anioPublicacion = scanner.nextInt();
        scanner.nextLine(); // Consume la nueva línea
        System.out.print("Editorial: ");
        String editorial = scanner.nextLine();
        System.out.print("Número de Páginas: ");
        int numPaginas = scanner.nextInt();

        return new Libro(isbn,autor,titulo,anioPublicacion,editorial,numPaginas);
    }
}
