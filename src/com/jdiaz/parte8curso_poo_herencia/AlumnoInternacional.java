package com.jdiaz.parte8curso_poo_herencia;

public class AlumnoInternacional extends Alumno {
    private String pais;
    private double notasIdiomas;

    public AlumnoInternacional(){
        System.out.println("AlumnoInternacional: inicializando constructor...");
    }

    public AlumnoInternacional(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public AlumnoInternacional(String nombre, String apellido, String pais) {
        super(nombre, apellido);
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotasIdiomas() {
        return notasIdiomas;
    }

    public void setNotasIdiomas(double notasIdiomas) {
        this.notasIdiomas = notasIdiomas;
    }
}
