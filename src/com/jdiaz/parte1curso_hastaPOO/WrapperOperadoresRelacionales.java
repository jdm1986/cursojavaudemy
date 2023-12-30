package com.jdiaz.parte1curso_hastaPOO;

public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {

        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeto? " + (num1 == num2));

        num2 = 1000;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeto? " + (num1 == num2));

        System.out.println("tienen el mismo valor? " + (num1.equals(num2))); //compara valores en tipo de referencia
        System.out.println("tienen el el mismo valor? "+ (num1.intValue() == num2.intValue())); //compara en primitivos, por valor.

        boolean condicion = num1 > num2; //recuerda, por debajo invocan el intValue(). --AutoUnboxing
        System.out.println("condicion = " + condicion);
    }
}
