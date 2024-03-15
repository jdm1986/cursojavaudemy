package com.jdiaz.parte25curso_patrones_disenio_COMPOSITE.ejemplo;

import com.jdiaz.parte25curso_patrones_disenio_COMPOSITE.Archivo;
import com.jdiaz.parte25curso_patrones_disenio_COMPOSITE.Directorio;

public class EjemploCompositeBuscar {
    public static void main(String[] args) {

        Directorio doc = new Directorio("Documentos");
        Directorio java = new Directorio("Java");

        java.addComponente(new Archivo("patron-composite.docx"));

        Directorio stream = new Directorio("Api Stream");
        stream.addComponente(new Archivo("stream-map.docx"));

        java.addComponente(stream);
        doc.addComponente(java);
        doc.addComponente(new Archivo("cv.docx"));
        doc.addComponente(new Archivo("logo.jpeg"));

        boolean encontrado = doc.buscar("patron-composite.docx");
        System.out.println("Encontrado \"patron-composite.docx\": " + encontrado);

        encontrado = doc.buscar("Ai Stream");
        System.out.println("Encontrador Api Stream: " + encontrado);

        encontrado = doc.buscar("cv.docx");
        System.out.println("Encontrado Cv: " + encontrado);

        //System.out.println(doc.mostrar(0));



    }
}
