/*
package Parte4ProgramacionOrientadaAObjetos;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Date;

public class Poo01Automovil {
    public static void main(String[] args) {

    Automovil subaru = new Automovil("subauru","Impreza");
    //al implementar el constructor con parámetros de la clase, no necesito especialmente el set. Ya que estamos creando e inicializando
        // el objeto con el fabricante y el modelo.

        subaru.setCilindrada(2.0);
        subaru.setColor("blanco");

        Automovil mazda = new Automovil("Mazda","Bt-50","Rojo",3.0);
        System.out.println("mazda.leerFabricante() = " + mazda.getFabricante());
        System.out.println();

        Automovil nissan = new Automovil("Nissan","Navara","Gris Oscuro",3.5,50);
        Automovil nissan2 = new Automovil("Nissan","Navara","Gris Oscuro",3.5,50);

        Automovil auto =new Automovil(  );
        Date fecha = new Date();

        System.out.println("Son iguales nissan y nissan2? " + (nissan == nissan2));
        System.out.println("Son iguales nissan y nissan2 con equals? " + nissan.equals(nissan2)); // se ha modificado la clase padre = principio de polimorfismo
        System.out.println();



        */
/*System.out.println("mazda.fabricante = " + mazda.fabricante);
        System.out.println("mazda.modelo = " + mazda.modelo);
        System.out.println("mazda.color = " + mazda.color);
        System.out.println("mazda.cilindrada = " + mazda.cilindrada);*//*
 //llamando directamente a los atributos.

        System.out.println(subaru.verDetalle());
        System.out.println();
        System.out.println(mazda.verDetalle());
        System.out.println();
        System.out.println(nissan.verDetalle());
        System.out.println();
        System.out.println(auto.equals(fecha));
        System.out.println();
        System.out.println(nissan);
        System.out.println(nissan.toString());

        System.out.println();
        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());
        System.out.println();



        System.out.println(mazda.acelerarYFrenar(4000));
        System.out.println();

        System.out.println("Kilómetros por litro " + subaru.calcularConsumo(300,0.6f));
        //mismo método diferente implementación (principio de encapsulamiento y polimorfismo) se suele confundir con con el principio de ocultación o visibildiad (público.. privado.. protegido)...
        System.out.println("Kilómetros por litro " + subaru.calcularConsumo(300,60));
        System.out.println("Kilómetros por litro " + nissan.calcularConsumo(300,60));






    

    }
}
*/
