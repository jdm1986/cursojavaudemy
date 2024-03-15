package com.jdiaz.parte1curso_hasta_Arrays;

public class EjemploStringMetodos {
    public static void main(String[] args) {

        String nombre = "Andres";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Andrés\") = " + nombre.equals("Andrés"));
        System.out.println("nombre.equals(\"Andrés\") = " + nombre.equals("Andres"));
        System.out.println("nombre.equalsIgnoreCase(\"andres\") = " + nombre.equalsIgnoreCase("andres"));
        System.out.println("nombre.compareTo(\"Andres\") = " + nombre.compareTo("Andres"));
        System.out.println("nombre.compareTo(\"Andres\") = " + nombre.compareTo("Aaron"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));

        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1,4));

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\") = " + trabalenguas.replace("a","."));
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.indexOf(\"a\") = " + trabalenguas.indexOf("a"));
        System.out.println("trabalenguas.lastIndexOf(\"a\") = " + trabalenguas.lastIndexOf("a"));
        System.out.println("trabalenguas.indexOf(\"z\") = " + trabalenguas.indexOf("lenguas"));
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("lenguas"));
        System.out.println("trabalenguas.indexOf(\"z\") = " + trabalenguas.indexOf("t"));
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("t"));
        System.out.println("trabalenguas.startsWith(\"t\") = " + trabalenguas.startsWith("t"));
        System.out.println("trabalenguas.endsWith(\"s\") = " + trabalenguas.endsWith("s"));
        System.out.println(" trabalenguas ");
        System.out.println("trabalenguas          ".trim());


    }
}
