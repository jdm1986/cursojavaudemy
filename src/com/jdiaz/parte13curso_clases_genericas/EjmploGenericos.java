package com.jdiaz.parte13curso_clases_genericas;
import javax.sound.midi.Soundbank;
import java.util.Objects;


public class EjmploGenericos {
    public static void main(String[] args) {

        Camion transporteCaballos = new Camion(5);
        transporteCaballos.add(new Animal("Peregrino","Caballo"));
        transporteCaballos.add(new Animal("Gruillo","Caballo"));
        transporteCaballos.add(new Animal("Tunquen","Caballo"));
        transporteCaballos.add(new Animal("Topocalma", "Caballo"));
        transporteCaballos.add(new Animal("Longotma","Caballo"));

        for (Object o : transporteCaballos) {
            Animal a = (Animal) o;
            System.out.println(a.getNombre() + " tipo: " + a.getTipo());
        }

        Camion transporteMaquinarias = new Camion(3);
        transporteMaquinarias.add(new Maquinaria("Buldoccer"));
        transporteMaquinarias.add(new Maquinaria("Grúa Horquilla"));
        transporteMaquinarias.add(new Maquinaria("Perforadora"));

        for (Object o : transporteMaquinarias) {
            Maquinaria m = (Maquinaria) o;
            System.out.println(m.getTipo());
        }

        Camion transporteAutos = new Camion(3);
        transporteAutos.add(new Automovil("Toyota"));
        transporteAutos.add(new Automovil("Mitsubishi"));
        transporteAutos.add(new Automovil("Mercedes"));

        for (Object o : transporteAutos) {
            Automovil a = (Automovil) o;
            System.out.println(a.getMarca());
        }
    }
}
