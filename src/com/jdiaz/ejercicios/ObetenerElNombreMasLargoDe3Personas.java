package com.jdiaz.ejercicios;

import javax.swing.*;

public class ObetenerElNombreMasLargoDe3Personas {
    public static void main(String[] args) {


        String nombre1 = JOptionPane.showInputDialog("Ingrese el nombre y apellidos de la primera persona:");
        String nombre2 = JOptionPane.showInputDialog("Ingrese el nombre y apellidos de la segunda persona:");
        String nombre3 = JOptionPane.showInputDialog("Ingrese el nombre y apellidos de la tercera persona:");

        JOptionPane.showMessageDialog(null, "Los nombres ingresados son:\n1. " + nombre1 + "\n2. " + nombre2 + "\n3. " + nombre3);


        String nombreMasLargo = nombre1.length()>= nombre2.length() ? nombre1:nombre2;
        nombreMasLargo = nombreMasLargo.length() >= nombre3.length() ? nombreMasLargo:nombre3;

        JOptionPane.showMessageDialog(null,"El nombre más largo es :" +nombreMasLargo);
        }
    }

