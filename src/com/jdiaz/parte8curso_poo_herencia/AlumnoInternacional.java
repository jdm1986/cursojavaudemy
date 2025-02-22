package com.jdiaz.parte8curso_poo_herencia;

public final class AlumnoInternacional extends Alumno {
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

    @Override
    public String saludar() {
        return super.saludar() +" Soy extranjero del país " + getPais();
    }

    @Override
    public double calcularPromedio() {
        //System.out.println("CalcularPromedio " + AlumnoInternacional.class.getCanonicalName());
        return ((super.calcularPromedio()*3) + notasIdiomas)/4 ;
    }

    @Override
    public String toString() {
        return super.toString() + "\npais='" + pais + '\'' +
                ", notasIdiomas=" + notasIdiomas;
    }
}
