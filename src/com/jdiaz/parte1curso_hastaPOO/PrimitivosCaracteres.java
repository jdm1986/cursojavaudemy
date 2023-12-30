package com.jdiaz.parte1curso_hastaPOO;

public class PrimitivosCaracteres {
    public static void main(String[] args) {

        char caracter = '\u0040';
        char decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter: " + (decimal == caracter));

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter: " + (simbolo == caracter));

        char espacio = ' ';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';


        System.out.println("Tipo character ocupa \t en memoria " + tabulador + Character.BYTES + " bytes y corresponde a "+ System.lineSeparator()+ Character.SIZE + " bits");
        System.out.println("Valor máximo de un double " + Character.MAX_VALUE);
        System.out.println("Valor mínimo de un double " + Character.MIN_VALUE);
    }
}
