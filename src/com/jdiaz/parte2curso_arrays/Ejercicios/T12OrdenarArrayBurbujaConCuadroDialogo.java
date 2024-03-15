package com.jdiaz.parte2curso_arrays.Ejercicios;

import javax.swing.*;

public class T12OrdenarArrayBurbujaConCuadroDialogo {
    public static void main(String[] args) {


        int numeroAlumnos = Integer.parseInt(JOptionPane.showInputDialog(null, "Total Alumnos"));
        String[] alumnos = new String[numeroAlumnos];

        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i] = JOptionPane.showInputDialog(null, "Introduce nombre y apellidos");
        }


       /* for (int i = 0; i < alumnos.length - 1; i++) {
            for (int j = 0; j < alumnos.length - 1; j++) {
                if (alumnos[j].compareTo(alumnos[j + 1]) > 0) {
                    String auxiliar = alumnos[j];
                    alumnos[j] = alumnos[j + 1];
                    alumnos[j + 1] = auxiliar;
                }

            }
        }*/ // ordenamiento burbuja propio.

        ordenarBurbuja(alumnos);

        StringBuilder alumnosOrdenados = new StringBuilder();
        for (String alumno :
                alumnos) {
            alumnosOrdenados.append(alumno).append("\n");
        }
        JOptionPane.showMessageDialog(null, alumnosOrdenados.toString());
    }


    private static void ordenarBurbuja(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1-i; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    String auxiliar = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = auxiliar;
                }

            }
        }
    }
}

