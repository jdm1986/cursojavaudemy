package com.jdiaz.parte10curso_poo_interfaces.imprenta;
import com.jdiaz.parte10curso_poo_interfaces.imprenta.modelo.*;

public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculum cv = new Curriculum("Pepe Díaz", "Ingeniero de Software", "Resumen laboral...");
        cv.addExperiencias("Java");
        cv.addExperiencias("Oracle DBA");
        cv.addExperiencias("Spring Framework");
        cv.addExperiencias("Desarrollador FullStack");
        cv.addExperiencias("Angular");

        Libro libro = new Libro("Eich Gamma", "Patrones de diseños: Elem. reusables POO", Genero.PROGRAMACION);

        libro.addPagina(new Pagina("Patrón Singleton"))
                .addPagina(new Pagina("Patrón observador"))
                .addPagina(new Pagina("Patrón factory"))
                .addPagina(new Pagina("Composite"))
                .addPagina(new Pagina("Fascade"));

        Informe informe = new Informe("Martín","James", "Estudio sobre microservicios");

        imprimir(cv);
        imprimir(informe);
        imprimir(libro);
    }

    public static void imprimir (Imprimible imprimible){
        System.out.println(imprimible.imprimir());

    }
}
