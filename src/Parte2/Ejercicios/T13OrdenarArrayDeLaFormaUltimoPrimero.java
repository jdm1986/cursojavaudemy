package Parte2.Ejercicios;

public class T13OrdenarArrayDeLaFormaUltimoPrimero {
    public static void main(String[] args) {

        int [] arregloA = {1,2,3,4,5,6,7,8,9,10};

        int auxiliar = arregloA.length-1;
        for (int i = 0;i<arregloA.length/2;i++){
            System.out.println(arregloA[auxiliar] + " : "+arregloA[i]);
            auxiliar--;
        }

        int [] arregloB = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0;i<arregloB.length/2;i++){
            System.out.print(arregloB[9-i] + " : ");
            System.out.println(arregloB[i]);

        }

    }
}
