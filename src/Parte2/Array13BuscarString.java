package Parte2;

import java.util.Scanner;

public class Array13BuscarString {
    public static void main(String[] args) {

        String[] arregloStrings = new String[4];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arregloStrings.length; i++) {
            System.out.print("Ingresa la palabra " + (i + 1) + ":");
            arregloStrings[i] = scanner.nextLine();
        }
        System.out.println("\r\ningresa una palabra a buscar");
        String palabraABuscar = scanner.nextLine();

/*
        int i = 0;
        while (i < arregloStrings.length && palabraABuscar != arregloStrings[i]){
            i++;
        }
        if (i == arregloStrings.length){
            System.out.println("No se ha encontrado "+ palabraABuscar);
        } else if (palabraABuscar == arregloStrings[i]) {
            System.out.println("Se ha encontrado el " + palabraABuscar + " en la posición " + i);

        }
*/


        boolean encontrado = false;
        for (int i = 0; i < arregloStrings.length; i++) {
            if (palabraABuscar.equalsIgnoreCase(arregloStrings[i])) {
                System.out.println("palabraABuscar = " + palabraABuscar + " y está en la posición " + (i+1));
                encontrado = true;
                break;
            }
        }
        if(!encontrado) {
            System.out.println("No se ha encontrado la palabra");
        }
//Usando For

    }
}
