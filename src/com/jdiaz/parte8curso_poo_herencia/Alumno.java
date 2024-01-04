package com.jdiaz.parte8curso_poo_herencia;

public class Alumno extends Persona{

    private String instituto;
    private double notaMatematicas;
    private double notaLengua;
    private double notaHistoria;

    public Alumno(){
        System.out.println("Alumno: inicializando constructor...");
    }

    public Alumno(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Alumno(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    public Alumno(String nombre, String apellido, int edad, String instituto) {
        super(nombre, apellido, edad);
        this.instituto = instituto;
    }

    public Alumno(String nombre, String apellido, int edad, String instituto, double notaMatematicas, double notaLengua, double notaHistoria) {
        this(nombre, apellido, edad, instituto);
        this.notaMatematicas = notaMatematicas;
        this.notaLengua = notaLengua;
        this.notaHistoria = notaHistoria;
    }

    public String getInstituto() {
        return instituto;
    }

    public void setInstituto(String instituto) {
        this.instituto = instituto;
    }

    public double getNotaMatematicas() {
        return notaMatematicas;
    }

    public void setNotaMatematicas(double notaMatematicas) {
        this.notaMatematicas = notaMatematicas;
    }

    public double getNotaLengua() {
        return notaLengua;
    }

    public void setNotaLengua(double notaLengua) {
        this.notaLengua = notaLengua;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }
}
