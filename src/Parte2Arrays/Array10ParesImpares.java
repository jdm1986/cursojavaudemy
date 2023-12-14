package Parte2Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array10ParesImpares {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] a;
        int [] pares;
        int [] impares;
        int totalPares = 0;
        int totalImpares = 0;

        a = new int[10];

        System.out.println("Introduce 10 números");
        for (int i =0; i<a.length;i++){
            a[i] = scanner.nextInt();
        }

        for (int i = 0;i <a.length;i++){
            if (a[i] % 2 == 0){
                totalPares++;

            } else {
                totalImpares++;

            }
        }
        pares = new int[totalPares];
        impares = new int[totalImpares];

        int j = 0;//variable de control
        int k = 0;//variable de control

        for (int i = 0;i <a.length;i++){
            if (a[i] % 2 == 0){
                pares[j++] = a[i];

            } else {
                totalImpares++;
                impares[k++] = a[i];
            }
        }

        System.out.println("Lista de pares: "+Arrays.toString(pares));
        System.out.println("Lista de impares: "+Arrays.toString(impares));
    }
}
