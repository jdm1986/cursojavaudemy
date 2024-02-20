package com.jdiaz.parte22curso_patrones_disenio.SINGLETON;

public class EjemploSingleton {
    public static void main(String[] args) {
        ConexionBdSingleton conexion = null;
        for(int i = 0;i<10;i++){
        conexion = ConexionBdSingleton.getInstancia();
        System.out.println("conexion = " + conexion);
    }
        ConexionBdSingleton conexion2 = ConexionBdSingleton.getInstancia();
        ConexionBdSingleton conexion3 = ConexionBdSingleton.getInstancia();
        boolean b1 = ((conexion2 == conexion3) && (conexion == conexion3));
        System.out.println("b1 = " + b1);
    }
}
