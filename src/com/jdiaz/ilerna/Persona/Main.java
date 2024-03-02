package com.jdiaz.ilerna.Persona;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();


        System.out.println(numero);

        Persona profe = new Persona("Fernando","Méndez", "Castellar",'H', 43);

        profe.mostrarDatos();

        profe.mayorEdad();
    }

}
