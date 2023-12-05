package Ejercicios.PruebaObjetos.Ahorcado;

import java.util.Scanner;

import static Ejercicios.PruebaObjetos.Ahorcado.AhorcadoJuego.isAdivinado;

public class MainAhorcado {
    public static void main(String[] args) {

        System.out.println("-----------------Bienvenido al Juego del Ahorcado----------------");
        System.out.println("Jugador 1, Introduce la palabra secreta");
        Scanner scanner = new Scanner(System.in);
        String palabraSecreta = "comecocos";//scanner.nextLine().toLowerCase();
        System.out.println("Número de caracteres de la palabra secreta: " + palabraSecreta.length());
        int intentos = 7;
        System.out.println("intentos = " + intentos);

        char[] numeroDeCaracteres = palabraSecreta.toCharArray();

        for (int i = 0; i < numeroDeCaracteres.length; i++) {
            numeroDeCaracteres[i] = '_';
            System.out.print(numeroDeCaracteres[i] + " ");
        }

        boolean adivinado = false;

        adivinado = isAdivinado(scanner, palabraSecreta, intentos, numeroDeCaracteres, adivinado);
        if (adivinado) {
            System.out.println("Felicidades, adivinaste");
        } else {
            System.out.println("Perdiste, la palabra era: " + palabraSecreta);
            MostrarGraficoAhorcado.mostrarAhorcado(intentos);
        }

    }
}


