package com.jdiaz.parte4curso_programacion_orientada_a_objetos;


public class Poo04AutomovilRelacionesObjetos {
    public static void main(String[] args) {

        Rueda[] ruedasSubaru = new Rueda[5];//implementación de array1

        ruedasSubaru[0] = new Rueda("GoodYear", 16, 7.5);
        ruedasSubaru[1] = new Rueda("GoodYear", 16, 7.5);
        ruedasSubaru[2] = new Rueda("GoodYear", 16, 7.5);
        ruedasSubaru[3] = new Rueda("GoodYear", 16, 7.5);
        ruedasSubaru[4] = new Rueda("GoodYear", 16, 7.5);
        Persona conductorSubaru = new Persona("Jesús", "Díaz");
        Automovil subaru = new Automovil("subauru", "Impreza");
        //Al implementar el constructor con parámetros de la clase, no necesito especialmente el set. Ya que estamos creando e inicializando
        //el objeto con el fabricante y el modelo.
        subaru.setMotor(new Motor(2.0, TipoMotor.GASOLINA));
        subaru.setDeposito(new Deposito());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);
        //subaru.setRuedas(ruedasSubaru);


        Rueda[] ruedasMazda = {new Rueda("Michelin", 18, 10.5), //implementación de array2
                new Rueda("Michelin", 18, 10.5),
                new Rueda("Michelin", 18, 10.5),
                new Rueda("Michelin", 18, 10.5),
                new Rueda("Michelin", 18, 10.5),};
        Automovil mazda = new Automovil("Mazda", "Bt-50", Color.ROJO, new Motor(3.0, TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setDeposito(new Deposito(50));
        mazda.setConductor(new Persona("Israel", "Boza"));
        //mazda.setRuedas(ruedasMazda);
        System.out.println();


        Rueda[] ruedasNissan = new Rueda[5];  //implementación de array3 con un For
        for (int i = 0;i<ruedasNissan.length;i++){
            ruedasNissan[i] = new Rueda("Pirelli", 20, 11.5);
        };
        Persona laura = new Persona("Laura", "Lara");
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(4.0, TipoMotor.DIESEL), new Deposito(50), laura, ruedasNissan);
        nissan.setTipo(TipoAutomovil.PICKUP);


        Rueda[] ruedasNissan2 = {new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
        };
        Persona pepe = new Persona("Pepe", "Rodriguez");
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(3.5, TipoMotor.GASOLINA), new Deposito(50), pepe, ruedasNissan2);
        nissan2.setTipo(TipoAutomovil.PICKUP);

        nissan2.setColor(Color.AMARILLO);
        Automovil.setColorPatente(Color.AZUL);
        Automovil auto = new Automovil();

        System.out.println();
        System.out.println(subaru.verDetalle());
        System.out.println();
        System.out.println(mazda.verDetalle());
        System.out.println();
        System.out.println(nissan.verDetalle());
        System.out.println();
        System.out.println(nissan2.verDetalle());
        System.out.println();

        /*System.out.println("Conductor subaru: " + subaru.getConductor());
        System.out.println("Ruedas subaru");
        for (Rueda rueda :
                ruedasSubaru) {
            System.out.println(rueda.getFabricante() + ", aro: "+  rueda.getAro() + ", ancho"+rueda.getAncho());
        }*/


    }

}
