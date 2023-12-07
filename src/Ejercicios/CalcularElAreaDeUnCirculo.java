package Ejercicios;

import java.util.Scanner;

public class CalcularElAreaDeUnCirculo {
    public static void main(String[] args) {

        System.out.println("Cáculo del Área de un círculo. Introudzca el radio en cm");
        Scanner scanner = new Scanner(System.in);
        String radioStr = scanner.nextLine();

        double radioDouble = Double.parseDouble(radioStr);
        double radioalcuadrado = Math.pow(radioDouble,2);

        double area = Math.PI*radioalcuadrado;

        System.out.println("El area de una circunferencia " + radioDouble + " es " + area);

    }

}
