package com.jdiaz.parte3curso_arrays_bidimensionales_matrices;

public class Matrices02StringConUnFor {
    public static void main(String[] args) {

        String[][] nombres = new String[3][2];

        nombres[0][0] = "pepe";
        nombres[0][1] = "pepa";
        nombres[1][0] = "josefa";
        nombres[1][1] = "paco";
        nombres[2][0] = "lucas";
        nombres[2][1] = "maria";

        System.out.println("<<<<<<<<<<<<<<<<<<< ITERANDO CON FOR >>>>>>>>>>>>>>>>>>>>");

        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < nombres[i].length; j++) {
                System.out.print(nombres[i][j] + "\t");
            }
            System.out.println();
        }
/*El bucle for each te permite recorrer todos los elementos de la matriz sin tener que
preocuparte por los índices o la longitud de cada fila. Es una forma más legible y menos
propensa a errores de iterar sobre arrays, especialmente cuando no necesitas modificar los
elementos o acceder a ellos por su índice.*/

        System.out.println("<<<<<<<<<<<<<<<<<<< ITERANDO CON FOR EACH >>>>>>>>>>>>>>>>>>>>");

/*Por cada fila del array nombres, quiero el nombre de cada elemento de la fila*/

        for (String[] fila : nombres) {
            for (String nombre : fila) {
                System.out.print(nombre + "\t");
            }
            System.out.println();
        }
    }

}
