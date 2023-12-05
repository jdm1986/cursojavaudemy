package Ejercicios;

import java.util.Scanner;

public class CalcularElNumeroMenorDeMultiplesValores {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el número de valores a comprar");
        int numeroTotalDeValores = 10;//scanner.nextInt();

        int [] listaDeValores = new int[numeroTotalDeValores];
        int valorMinimo = Integer.MAX_VALUE;


        for(int i = 0; i<listaDeValores.length;i++){
            System.out.println("Introduzca el siguiente valor "+(i+1)+":");
            listaDeValores[i] = scanner.nextInt();
            System.out.println("Valor "+ listaDeValores[i] + " introducido.");

            if(listaDeValores[i]<valorMinimo){
                valorMinimo = listaDeValores[i];
            }

        }
        System.out.println("valorMinimo = " + valorMinimo);
        if (valorMinimo < 10){
            System.out.println("El numero " + valorMinimo + " es menor que 10!");
        } else {
            System.out.println("El numero " + valorMinimo + " es mayor o igual que 10");
        }

    }
}
