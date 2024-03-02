package com.jdiaz.ilerna.EjercicioCalculadora;

public class Calculadora {

    private int numOperaciones;

    public Calculadora() {
        this.numOperaciones = 0;
    }


    public void operacion (int num1, int num2, String operacion){
        int resultado;
        switch (operacion){
            case "+":
                resultado = num1 + num2;
                System.out.println("El resultado de la suma es " + resultado);
                break;
            case "-":
                resultado = num1 - num2;
                System.out.println("El resultado de la resta es " + resultado);
                break;
            case "*":
                resultado = num1 * num2;
                System.out.println("El resultado de la multiplicación es " + resultado);
                break;
            case "/":
                resultado = num1 / num2;
                System.out.println("El resultado de la división es " +  resultado );
                break;
            default:
                System.out.println("Operación no reconocida.");
                break;
        }
        incrementarOperaciones();
    }

    private void incrementarOperaciones(){
        numOperaciones++;
        System.out.println("Número de operaciones realizadas: " + numOperaciones);
    }

    public int getNumOperaciones() {
        return numOperaciones;
    }
}

