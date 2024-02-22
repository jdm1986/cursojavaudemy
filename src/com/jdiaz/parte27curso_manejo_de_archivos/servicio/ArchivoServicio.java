package com.jdiaz.parte27curso_manejo_de_archivos.servicio;

import java.io.*;

public class ArchivoServicio {
    public void crearArchivo(String nombre) {
        File archivo = new File(nombre);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(archivo, true))) {
            bufferedWriter.append("Hola que tal amigos!\n")
                    .append("Todo bien?, yo aquí escribiendo un archivo\n")
                    .append("Hasta luego lucas!!\n");
            System.out.println("El archivo se ha creado con éxito");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //-----------VERSIÓN LARGA Y NORMAL ---------------
        /*try {
            FileWriter escritor = new FileWriter(archivo, true);
            BufferedWriter bufferedWriter = new BufferedWriter(escritor);
            bufferedWriter.append("Hola que tal amigos!\n")
                    .append("Todo bien?, yo aquí escribiendo un archivo\n")
                    .append("Hasta luego lucas!!\n");
            bufferedWriter.close();
            System.out.println("El archivo se ha creado con éxito");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/
    }

    public void crearArchivo2(String nombre) {
        File archivo = new File(nombre);
        try (PrintWriter bufferedWriter = new PrintWriter(new FileWriter(archivo, true))) {
            bufferedWriter.println("Hola que tal amigos!");
            bufferedWriter.println("Todo bien?, yo aquí escribiendo un archivo");
            bufferedWriter.printf("Hasta luego %s!", "lucas!!");
            System.out.println("El archivo se ha creado con éxito");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
