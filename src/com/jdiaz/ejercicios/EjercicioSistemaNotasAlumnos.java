package com.jdiaz.ejercicios;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class EjercicioSistemaNotasAlumnos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica el número de notas?");
        int numeroNotas = scanner.nextInt();
        double[] listaNotas = new double[numeroNotas];
        double sumaNotasMenoresA5 = 0;
        int contadorNotasMenoresA5 = 0;
        double sumaNotaMayoresA5 = 0;
        int contadorNotaMayoresA5 = 0;
        int cantidadNotas1 = 0;
        String prueba = ".";
        System.out.println("prueba = " + prueba);

        for (int i = 0; i < numeroNotas; i++) {
            System.out.println("ingresa la nota del alumno " + (i + 1) + " entre 1-7 ");
            String entrada = scanner.next(); // Lee la entrada como texto
            entrada = entrada.replace(',', '.'); // Reemplaza comas por puntos
            try {
                listaNotas[i] = Double.parseDouble(entrada); // Convierte a double
            } catch (NumberFormatException e) {
                System.out.println("Error en el formato del número. Inténtalo de nuevo.");
                i--; // Retrocede el índice para reintentar la entrada de esta nota
                if (listaNotas[i] == 0) {
                    System.out.println("Error, finalizando programa");
                    break;
                }
            }

        }
        bucleNotaMenoresA5:
        for (double nota :
                listaNotas) {
            if (nota < 5) {
                sumaNotasMenoresA5 += nota;
                contadorNotasMenoresA5++;
            }
        }
        bucleNotaMayoresA5:
        for (double nota : listaNotas
        ) {
            if (nota >= 5 || nota < 7) {
                sumaNotaMayoresA5 += nota;
                contadorNotaMayoresA5++;
            }
        }
        bucleNotasConValor1:
        for (double nota : listaNotas
        ) {
            if (nota == 1) {
                cantidadNotas1++;
            }
        }

        if (sumaNotaMayoresA5 >= 5) {
            double promedioNotaMayoresA5 = sumaNotaMayoresA5 / contadorNotaMayoresA5;
            System.out.println("promedioNotaMayoresA5 = " + promedioNotaMayoresA5);
        }
        if (sumaNotasMenoresA5 >=0 && sumaNotasMenoresA5<5) {
            double promedioNotaMenoresA5 = sumaNotasMenoresA5 / contadorNotasMenoresA5;
            System.out.println("promedioNotaMenoresA5 = " + promedioNotaMenoresA5);
        }
        if (cantidadNotas1 > 0) {
            System.out.println("cantidadNotas1 = " + cantidadNotas1);
        }
    }
}



