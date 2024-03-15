package com.jdiaz.parte27curso_manejo_de_archivos.servicio;

import java.io.*;
import java.util.Scanner;

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

    public String leerArchivo(String nombre) {
        StringBuilder stringBuilder = new StringBuilder();
        File archivo = new File(nombre);
        try( BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                stringBuilder.append(linea).append("\n");
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return stringBuilder.toString();
    }

    public String leerArchivo2 (String nombre) {
        StringBuilder stringBuilder = new StringBuilder();
        File archivo = new File(nombre);
        try (Scanner scanner = new Scanner(archivo)){
            scanner.useDelimiter("\n");
            while (scanner.hasNext()) {
                stringBuilder.append(scanner.next()).append("\n");
            }
            scanner.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return stringBuilder.toString();
    }

    //cualquiera de las dos Formas e válida.
}