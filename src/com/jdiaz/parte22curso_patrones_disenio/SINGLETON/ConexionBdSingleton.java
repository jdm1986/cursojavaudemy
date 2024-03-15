package com.jdiaz.parte22curso_patrones_disenio.SINGLETON;

public class ConexionBdSingleton {

    private static ConexionBdSingleton instancia;

    private ConexionBdSingleton() {

        System.out.println("Conectádonse algún motor de base de datos");
    }

    public static ConexionBdSingleton getInstancia(){
        if (instancia == null){
            ConexionBdSingleton.instancia  = new ConexionBdSingleton(); /*se puede poner solo "instancia" en vez de ConexionBdSingleton.instancia  */
        }
        return ConexionBdSingleton.instancia;
    }
}
