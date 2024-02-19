package com.jdiaz.parte21curso_recursividad;

import com.jdiaz.parte21curso_recursividad.models.Componente;

import java.util.stream.Stream;

public class EjemploRecursividad {
    public static void main(String[] args) {

        Componente pc = new Componente("Gabinete PC ATX");
        Componente fuenteAlimentacion = new Componente("Fuente Alimentación 700w");
        Componente placaBase = new Componente("MainBoard Asus Sockets AMD");
        Componente cpu = new Componente("Cpu Amd Ryzen 5 2800");
        Componente ventilador = new Componente(" Ventilador CPu");
        Componente disipador = new Componente("Disipador");
        Componente tv = new Componente("Nvidia RTX 3080 8GB");
        Componente gpu = new Componente("Nvidia GPU RTX");
        Componente gpuRam = new Componente("4gb Ram");
        Componente gpuRam2 = new Componente("4gb Ram");
        Componente gpuVentiladores = new Componente("Ventiladores Gráfica");
        Componente ram = new Componente("Memoria Ram 32GB");
        Componente ssd = new Componente(" Disco SSD 2TB");

        cpu.addComponente(ventilador)
                .addComponente(disipador);
        tv.addComponente(gpu)
                .addComponente(gpuRam)
                .addComponente(gpuRam2)
                .addComponente(gpuVentiladores);
        placaBase.addComponente(cpu)
                .addComponente(tv)
                .addComponente(ram)
                .addComponente(ssd);
        pc.addComponente(fuenteAlimentacion)
                .addComponente(placaBase)
                .addComponente(new Componente("Teclado"))
                .addComponente(new Componente("Ratón"));

        metodoRecursivoJava8(pc, 0).forEach(componente -> System.out.println("\t".repeat(componente.getNivel())+ componente.getNombre()));

    }

    public static Stream<Componente> metodoRecursivoJava8(Componente c, int nivel) {
        c.setNivel(nivel);
        return Stream.concat(Stream.of(c),
        c.getHijos().stream().flatMap(hijo -> metodoRecursivoJava8(hijo, nivel+1)));

    }

    public static void metodoRecursivo(Componente c, int nivel) {
        System.out.println("\t".repeat(nivel) + c.getNombre());
        if (c.tieneHijos()) {
            for (Componente hijo : c.getHijos()) {
                metodoRecursivo(hijo, nivel + 1);
            }
        }
    }

}
