package Parte2Arrays.Ejercicios;

public class T15SistemaEstadísticoDeArray {
    public static void main(String[] args) {

        int[] arrayA = {1, 5, 7, -1, -3, 2, 0, 8, 0, 10};

        int numerosPositivos = 0;
        int contadorPositivos = 0;
        int numerosNegativos = 0;
        int contadorNegativos = 0;
        int totalDeCeros = 0;
        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] == 0) {
                totalDeCeros++;
            }
            if (arrayA[i] > 0) {
                numerosPositivos += arrayA[i];
                contadorPositivos++;
            }
            if (arrayA[i] < 0) {
                numerosNegativos += arrayA[i];
                contadorNegativos++;
            }
        }
        if (contadorPositivos != 0) {
            System.out.println("Promedio de números positivos = " + numerosPositivos / contadorPositivos);
        } else {
            System.out.println("No hay números positivos para calcular el promedio");
        }

        if (contadorNegativos != 0) {
            System.out.println("Promedio de números negativos = " + numerosNegativos / contadorNegativos);
        } else {
            System.out.println("No hay números negativos para calcular el promedio");
        }

        System.out.println("totalDeCeros = " + totalDeCeros);
    }
}
