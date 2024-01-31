package com.jdiaz.parte14curso_excepciones.ejemplo;

public class Calculadora {
    public double dividir(int dividendo, int divisor) throws DivisionPorCeroException {
        if (divisor == 0) {
            throw new DivisionPorCeroException("No se puede dividir por cero");
        }
        return dividendo / (double) divisor;
    }

    public double dividir(String numerador, String divisor) throws DivisionPorCeroException, FormatoNumeroException {
        try {
            int num = Integer.parseInt(numerador);
            int div = Integer.parseInt(divisor);
            return this.dividir(num, div);
        } catch (NumberFormatException e) {
            throw new FormatoNumeroException("debe ingresar un número en el numerador y divisor");
        }
    }
}
