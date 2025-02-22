package com.jdiaz.parte1curso_hasta_Arrays;

public class ConversionDeTipos {
    public static void main(String[] args) {

        String numeroStr = "50";

        int numeroInt = Integer.parseInt(numeroStr);

        System.out.println("numeroInt = " + numeroInt);

        Byte.parseByte(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String logicoStr = "False";

        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);

        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        otroNumeroStr = String.valueOf(otroNumeroInt + 10);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        double otroRealDouble = 1.23456e2;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        float numeroFloat = 1.23456e2f;
        otroRealStr = String.valueOf(numeroFloat);
        System.out.println("otroRealStr = " + otroRealStr);
        
        int i = 32768;
        short s = (short)i;
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        char b = (char) i;
        System.out.println("b = " + b);


    }
}
