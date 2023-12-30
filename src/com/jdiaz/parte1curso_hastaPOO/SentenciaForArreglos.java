package com.jdiaz.parte1curso_hastaPOO;

import javax.swing.*;

public class SentenciaForArreglos {
    public static void main(String[] args) {

        String[] nombres = {"Andres", "Pepe", "Luis", "Maria", "Lalo", "Pepa"};

        int count = nombres.length;

        for (int i = 0; i < count; i++) {
            if (nombres[i].toLowerCase().contains("andres") || nombres[i].toLowerCase().contains("maria")) {
                continue;
            }
            System.out.println(i + " - " + nombres[i]);

        }
        String buscar = JOptionPane.showInputDialog("Ingresa un nombre, ejemplo \"Pepe\" o \"Maria\"");
        System.out.println("buscar = " + buscar);

        boolean esEncontrado = false;
        for (int i = 0; i < count; i++) {
            if (nombres[i].equalsIgnoreCase(buscar)) {
                esEncontrado = true;
                break;
            }
            System.out.println("nombres = " + nombres[i]);

        }
        if (esEncontrado) {
            JOptionPane.showMessageDialog(null, buscar + " fue encontrado");
        } else {
            JOptionPane.showMessageDialog(null, " no existe en el sistema.");
        }
    }
}
