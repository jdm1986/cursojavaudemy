package com.jdiaz.ilerna.Persona;

public class Persona {

    private String nombre;
    private String apellido1;
    private String apellido2;
    private char sexo;
    private int edad;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, String apellido1, String apellido2) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    public Persona(String nombre, String apellido1, String apellido2, char sexo, int edad) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.sexo = sexo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Apellido 1: " + this.getApellido1());
        System.out.println("Apellido 2: " + this.getApellido2());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Edad: " + this.getEdad());
    }

    public void mayorEdad(){
        if(this.getEdad() >= 18 ){
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }

}
