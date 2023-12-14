package Parte2Arrays;

public class Array08LocalizarNumeroMayorConOperadorTernario {

    public static void main(String[] args) {

        int [] a = {2,5,2,9,7}/*new int[5]*/;
/*
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa 5 números");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
*/

        int max = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.println("Comparando índice: " + max + " de max => " + a[max] + " e índice " + i + " de i => " + a[i]);
            if (a[max]>a[i]){
                System.out.println(true);
            }
            max = (a[max] > a[i]) ? max : i;

            System.out.println("Nuevo valor del indice de la variable auxiliar max: " + max +" con valor => " + a[max]);
        }
        System.out.println("El número más grande es: " + a[max]);
    }
}
