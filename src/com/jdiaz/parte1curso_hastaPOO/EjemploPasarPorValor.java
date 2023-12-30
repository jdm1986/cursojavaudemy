package com.jdiaz.parte1curso_hastaPOO;

public class EjemploPasarPorValor {
    public static void main(String[] args) {

        int i = 10; //siempre se pasa por valor, y no por referencia.
        System.out.println("Iniciamos el método main con i = " + i);
        test(i);
        System.out.println("Finaliza el método main con el valir de i (i se mantiene igual) = " + i);

    }

    public static void test(int i){
        System.out.println("Iniciamos el método 'test' con i = " + i);
        i = 35;
        System.out.println("Finaliza el método test con i = " + i);
    }
}
