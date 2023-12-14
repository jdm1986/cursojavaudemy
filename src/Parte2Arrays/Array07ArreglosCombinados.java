package Parte2Arrays;

import java.util.Arrays;

public class Array07ArreglosCombinados {
    public static void main(String[] args) {

        int[] a, b, c;
        a = new int[10];
        b = new int[10];
        c = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }

        for (int i = 0; i < b.length; i++) {
            b[i] = (i + 1) * 5;
        }
        int aux = 0;
        for (int i = 0; i < 10; i++) {//con 10 iteraciones relleno los 20 elementos, ojo con los incrementos de la variable auxiliar.
            c[aux++] = a[i];
            c[aux++] = b[i];
        }
        System.out.println(Arrays.toString(c));
        for (int i = 0; i < c.length; i++) {
            System.out.println("Índice => "+ i + " : "+c[i]);
        }
    }
}
