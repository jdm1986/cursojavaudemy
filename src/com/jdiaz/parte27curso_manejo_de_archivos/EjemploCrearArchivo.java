package com.jdiaz.parte27curso_manejo_de_archivos;

import com.jdiaz.parte27curso_manejo_de_archivos.servicio.ArchivoServicio;

public class EjemploCrearArchivo {
    public static void main(String[] args) {

        String nombreArchivo = "D:\\Cursos\\Java\\archivo\\java.txt";

        ArchivoServicio service = new ArchivoServicio();
        service.crearArchivo2(nombreArchivo);

    }
}
