package com.jdiaz.parte17curso_expresiones_lambda;

import com.jdiaz.parte17curso_expresiones_lambda.models.Usuario;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class EjemploPredicate {
    public static void main(String[] args) {

        Predicate<Integer> test = num -> num > 10;
        boolean resultado = test.test(7);
        System.out.println("resultado = " + resultado);

        Predicate<String> test2 = role -> role.equals("ROLE_ADMIN");
        System.out.println(test2.test("ROLE_USER"));

        BiPredicate<String,String> t3 = (a,b) -> a.equals(b); //recuerda, puedes reemplazar por referencia al método >>> String::equals;
        System.out.println(t3.test("andres","andres"));

        BiPredicate<Integer,Integer> t4 = (i,j)-> j>i;
        boolean resultado2 = t4.test(5,10);
        System.out.println("resultado2 = " + resultado2);

        Usuario a = new Usuario();
        Usuario b = new Usuario();

        a.setNombre("María");
        b.setNombre("María");

        BiPredicate<Usuario,Usuario> t5 = (ua,ub) -> ua.getNombre().equals(ub.getNombre());
        System.out.println("t5.test(a,b) = " + t5.test(a, b));
    }
}
