package com.jdiaz.parte1curso_hasta_Arrays;

public class WrapperInteger {
    public static void main(String[] args) {


        /*Explícito*/ Integer intObjeto = Integer.valueOf(32768); //new Integer(76) (llamar a la instancia ya no se hace
        /*Implícito*/ Integer intObjeto2 = 32768;

        int intPrimitivo = 32768;
        Integer intObjet = Integer.valueOf(intPrimitivo);
        Integer intOjet2 = intPrimitivo;

        System.out.println("intObjeto = " + intObjeto);

        int num = intObjet;
        System.out.println("num = " + num);
        int num2 = intObjeto2.intValue();//retorna lo mismo
        System.out.println("num2 = " + num2);

        String valorTvLcd = "6700";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valorTV = " + valor);

        Short shortObjeto = intObjeto.shortValue();
        System.out.println("shortObjeto = " + shortObjeto); //Es ambiguo al ser el valor mayor en línea 8. 32767 o menos si lo soporta

        Byte byteObjeto = intObjeto.byteValue();
        System.out.println("byteObjeto = " + byteObjeto);//Lo mismo, hay pérdida de información.

        Long longObjeto = intObjeto.longValue();
        System.out.println("longObjeto = " + longObjeto);//aquí si funciona correctamente porque admite long valores mayores que Int







    }
}
