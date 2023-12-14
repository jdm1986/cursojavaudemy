package Parte2Arrays.Ejercicios;

public class T14ImprimirNumeroMasAltoDelArray {
    public static void main(String[] args) {

        int[] arrayA = {14, 33, 15, 36, 78, 21, 43};

        int auxiliar = 0;
        for (int i = 0; i<arrayA.length;i++){
            if (arrayA[i]>auxiliar){
                auxiliar = arrayA[i];
            }
        }
        System.out.println("El valor mayor es " + auxiliar);

        int[] arrayB = {14, 33, 15, 36, 78, 21, 43};

        int max = 0;

        for (int i = 0; i < 7; i++) {
            max = (max > arrayB[i])? max: arrayB[i];
        }
        System.out.println("El valor mas alto es: " + max);

    }
}
