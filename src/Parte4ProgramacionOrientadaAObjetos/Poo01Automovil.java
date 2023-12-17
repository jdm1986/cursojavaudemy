package Parte4ProgramacionOrientadaAObjetos;

public class Poo01Automovil {
    public static void main(String[] args) {

    Automovil subaru = new Automovil();

        subaru.asignarFabricante("subauru");
        subaru.asignarModelo("Impreza");
        subaru.asignarCilindrada(2.0);
        subaru.asignarColor("blanco");

        Automovil mazda = new Automovil();

        mazda.asignarFabricante("Mazda");
        mazda.asignarModelo("Bt-50");
        mazda.asignarCilindrada(3.0);
        mazda.asignarColor("rojo");

        System.out.println("mazda.leerFabricante() = " + mazda.leerFabricante());
        System.out.println();


        /*System.out.println("mazda.fabricante = " + mazda.fabricante);
        System.out.println("mazda.modelo = " + mazda.modelo);
        System.out.println("mazda.color = " + mazda.color);
        System.out.println("mazda.cilindrada = " + mazda.cilindrada);*/ //llamando directamente a los atributos.

        System.out.println(subaru.verDetalle());
        System.out.println();
        System.out.println(mazda.verDetalle());
        System.out.println();
        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());
        System.out.println();

        System.out.println(mazda.acelerarYFrenar(4000));
        System.out.println();

        System.out.println("Kilómetros por litro " + subaru.calcularConsumo(300,0.6f));
        //mismo método diferente implementación (principio de encapsulamiento y polimorfismo) se suele confundir con con el principio de ocultación o visibildiad (público.. privado.. protegido)...
        System.out.println("Kilómetros por litro " + subaru.calcularConsumo(300,60));






    

    }
}
