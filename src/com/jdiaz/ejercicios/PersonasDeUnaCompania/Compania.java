package com.jdiaz.ejercicios.PersonasDeUnaCompania;

public class Compania {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Juan","Diaz Martin","50056056v","Calle Santa María 3 3A",50000,1,100000);
        gerente.aumentarRemuneracion(10);
        gerente.setPresupuesto(120000);

        System.out.println(gerente);
    }
}
