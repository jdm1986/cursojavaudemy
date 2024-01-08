package com.jdiaz.ejercicios.PersonasDeUnaCompania;

public class Persona {

    private String nombre;
    private String apellido;
    private String numeroFiscal;
    private String direccion;

    public Persona(String nombre, String apellido, String numeroFiscal, String direccion) {
        if (nombre == null || nombre.trim().isEmpty()){
            throw new IllegalArgumentException("El campo nombre no puede estar vacío");
        }
        if (apellido == null || apellido.trim().isEmpty()){
            throw new IllegalArgumentException("El campo apellido no puede estar vacío");
        }
        if (numeroFiscal == null || numeroFiscal.trim().isEmpty()){
            throw new IllegalArgumentException("El campo Número Fiscal no puede estar vacío");
        }
        if (direccion == null || direccion.trim().isEmpty()){
            throw new IllegalArgumentException("El campo dirección no puede estar vacío");
        }

        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroFiscal = numeroFiscal;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumeroFiscal() {
        return numeroFiscal;
    }

    public void setNumeroFiscal(String numeroFiscal) {
        this.numeroFiscal = numeroFiscal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", numeroFiscal='" + numeroFiscal + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
