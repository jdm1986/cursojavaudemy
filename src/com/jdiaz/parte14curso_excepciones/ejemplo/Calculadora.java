package com.jdiaz.parte14curso_excepciones.ejemplo;

public class Calculadora {
    public double dividir(int dividendo, int divisor) throws DivisionPorCeroException {
        if (divisor == 0){
            throw new DivisionPorCeroException("No se puede dividir por cero");
        }
        return dividendo/(double)divisor;
    }
}
