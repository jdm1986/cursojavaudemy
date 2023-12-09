package Parte1;

public class SentenciaForEach {
    public static void main(String[] args) {

        int[] numeros = {1,3,5,7,9,11,13,14} ;
        for (int num :
                numeros) {
            System.out.println("num = " + num);
        }
        String[] nombres = {"Andres", "Pepe", "Luis", "Maria", "Lalo", "Pepa"};

        for (String nom :
                nombres) {
            System.out.println("nom = " + nom);
        }
    }
}
