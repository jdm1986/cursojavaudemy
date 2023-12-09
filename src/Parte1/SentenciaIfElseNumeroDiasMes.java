package Parte1;

import java.util.Scanner;

public class SentenciaIfElseNumeroDiasMes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa para saber si un año es bisiesto");
        System.out.println("Ingrese el año");
        int mes = 2;
        int numeroDias = 0;
        int anio = scanner.nextInt();
        boolean bisiesto = false;

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            numeroDias = 31;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            numeroDias = 30;
        } else if (mes == 2) {
            if (anio % 400 == 0 || (anio % 4 == 0 && !(anio % 100 == 0 ))){
                numeroDias = 29;
                bisiesto = true;
            }else {
                numeroDias = 28;
                bisiesto = false;
            }
        }
        System.out.println("Febrero tiene = " + numeroDias+ " dias y " + "bisiesto es: "+ bisiesto);


    }
}

