package com.jdiaz.parte1curso_hasta_Arrays;

public class PrimitivosFloat {



    public static void main(String[] args) {

        float realFloat = 3.4028235E38f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("Tipo float ocupa en memoria " + Float.BYTES + "bytes y corresponde a "+ Float.SIZE + " bits");
        System.out.println("Valor máximo de un float " + Float.MAX_VALUE);
        System.out.println("Valor mínimo de un float " + Float.MIN_VALUE);

        double realDouble = 1.7976931348623157E308;

        System.out.println("realDouble = " + realDouble);
        System.out.println("Tipo double ocupa en memoria " + Double.BYTES + "bytes y corresponde a "+ Double.SIZE + " bits");
        System.out.println("Valor máximo de un double " + Double.MAX_VALUE);
        System.out.println("Valor mínimo de un double " + Double.MIN_VALUE);

        float varFlotante = 3.1416f;
        System.out.println("varFlotante = " + varFlotante);
    }
}
