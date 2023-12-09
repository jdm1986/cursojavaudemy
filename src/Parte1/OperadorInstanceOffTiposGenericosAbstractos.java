package Parte1;

import javax.security.auth.spi.LoginModule;

public class OperadorInstanceOffTiposGenericosAbstractos {
    public static void main(String[] args) {

        Object texto = "creado un objeto";

        Number num = Integer.valueOf(7);

        Boolean b1 = texto instanceof String;
        System.out.println("b1 = " + b1);

        b1 = texto instanceof Integer;
        System.out.println(b1);

        b1 = num instanceof Integer;
        System.out.println("b1 = " + b1);

        b1 = num instanceof Long;
        System.out.println(b1);


        



    }
}

