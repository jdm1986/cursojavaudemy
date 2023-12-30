package com.jdiaz.ejercicios.PruebaObjetos.Ahorcado;
import java.util.Scanner;

public class AhorcadoJuego {

    public static boolean isAdivinado(Scanner scanner, String palabraSecreta, int intentos, char[] numeroDeCaracteres, boolean adivinado) {
        int intentosFallidosMotorGrafico = 0;
        while (intentos > 0 && !adivinado) {
            System.out.println("\nAdivina una letra");
            char letra = scanner.nextLine().toLowerCase().charAt(0);
            boolean acierto = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    numeroDeCaracteres[i] = letra;
                    acierto = true;
                }
            }
            if (acierto == true){
                System.out.println("Acertaste con la letra " + letra);
            }
            if (!acierto) {
                intentos--;
                intentosFallidosMotorGrafico++;
                MostrarGraficoAhorcado.mostrarAhorcado(intentosFallidosMotorGrafico);
                System.out.println("Incorrecto, te quedan " + intentos + " intentos");

            }
            adivinado = true;
            for (char c :
                    numeroDeCaracteres) {
                if (c == '_') {
                    adivinado = false;
                    break;
                }
            }
            System.out.println("Palabra actual: \n");
            for (char c :
                    numeroDeCaracteres) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        return adivinado;
    }


}


