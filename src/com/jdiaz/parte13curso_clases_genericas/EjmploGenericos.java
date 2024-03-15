package com.jdiaz.parte13curso_clases_genericas;
import javax.sound.midi.Soundbank;
import java.util.Objects;


public class EjmploGenericos {
    public static void main(String[] args) {

        Camion<Animal> transporteCaballos = new Camion<>(5);
        transporteCaballos.add(new Animal("Peregrino","Caballo"));
        transporteCaballos.add(new Animal("Gruillo","Caballo"));
        transporteCaballos.add(new Animal("Tunquen","Caballo"));
        transporteCaballos.add(new Animal("Topocalma", "Caballo"));
        transporteCaballos.add(new Animal("Longotma","Caballo"));

        imprimirCamion(transporteCaballos);

        Camion<Maquinaria> transporteMaquinarias = new Camion<>(3);
        transporteMaquinarias.add(new Maquinaria("Buldoccer"));
        transporteMaquinarias.add(new Maquinaria("Grúa Horquilla"));
        transporteMaquinarias.add(new Maquinaria("Perforadora"));

        imprimirCamion(transporteMaquinarias);

        Camion<Automovil> transporteAutos = new Camion<>(3);
        transporteAutos.add(new Automovil("Toyota"));
        transporteAutos.add(new Automovil("Mitsubishi"));
        transporteAutos.add(new Automovil("Mercedes"));

        imprimirCamion(transporteAutos);
    }
    public static <T> void imprimirCamion(Camion<T> camion){
        for (T a : camion) {
            if (a instanceof Animal){
                System.out.println(((Animal)a).getNombre() + " tipo: " + ((Animal)a).getTipo());
            } else if (a instanceof  Automovil) {
                System.out.println(((Automovil)a).getMarca());
            } else if (a instanceof Maquinaria) {
                System.out.println(((Maquinaria) a).getTipo());
            }
        }
    }
}
