package com.jdiaz.parte10curso_poo_interfaces.imprenta;
import com.jdiaz.parte10curso_poo_interfaces.imprenta.modelo.Curriculum;
import com.jdiaz.parte10curso_poo_interfaces.imprenta.modelo.Hoja;
import com.jdiaz.parte10curso_poo_interfaces.imprenta.modelo.Informe;

public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculum cv = new Curriculum("Pepe Díaz", "Ingeniero de Software", "Resumen laboral...");
        cv.addExperiencias("Java");
        cv.addExperiencias("Oracle DBA");
        cv.addExperiencias("Spring Framework");
        cv.addExperiencias("Desarrollador FullStack");
        cv.addExperiencias("Angular");

        Informe informe = new Informe("Martín","James", "Estudio sobre microservicios");

        imprimir(cv);
        imprimir(informe);
    }

    public static void imprimir (Hoja imprimible){
        System.out.println(imprimible.imprimir());

    }
}
