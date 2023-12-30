package com.jdiaz.parte1curso_hastaPOO;

public class WrapperBoolean {
    public static void main(String[] args) {

        Integer num1,num2;

        num1 = 1; //recuerda, implícito
        num2 = Integer.valueOf(2); //recuerda, explícito

        boolean primitivoBoolean = num1 > num2;//false
        Boolean objetoBoolean1 = Boolean.valueOf(primitivoBoolean); //Boxing
        Boolean objetoBoolean2 = Boolean.valueOf("false");
        Boolean objetoBoolean3 = false;

        System.out.println("primitivoBoolean = " + primitivoBoolean);
        System.out.println("objetoBoolean1 = " + objetoBoolean1);
        System.out.println("objetoBoolean2 = " + objetoBoolean2);

        System.out.println("Comparando dos objetos Boolean con ==: " + (objetoBoolean1 == objetoBoolean2));
        System.out.println("Comparando dos objetos Boolean con ==: " + (objetoBoolean2 == objetoBoolean3));
        System.out.println("Comparando dos objetos Boolean con ==: " + (objetoBoolean1 == objetoBoolean3));
        System.out.println("Comparando dos objetos Boolean con equals: " + (objetoBoolean1.equals(objetoBoolean2)));

        boolean primitivoBoolean2 = objetoBoolean2.booleanValue(); //Unboxing
        System.out.println("primitivoBoolean2 = " + primitivoBoolean2);




    }
}
