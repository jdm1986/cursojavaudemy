package com.jdiaz.ejercicios.PersonasDeUnaCompania;

public class Empleado extends Persona {
    private double remuneracion;
    private int empleadoId;

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion,int empleadoId) {
        super(nombre, apellido, numeroFiscal, direccion);

        if (remuneracion < 0){
            throw new IllegalArgumentException("La remuneración no puede ser negativa");
        }
        this.remuneracion = remuneracion;
        this.empleadoId = empleadoId;
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(double remuneracion) {
        this.remuneracion = remuneracion;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(int empleadoId) {
        this.empleadoId = empleadoId;
    }

    public void aumentarRemuneracion(int porcentaje){
        if (porcentaje < 0 || porcentaje > 50){
            throw new IllegalArgumentException("El porcentaje de aumento debe estar entre 0 y 50.");
        }
        this.remuneracion += (this.remuneracion * porcentaje / 100.0);
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "remuneracion=" + remuneracion +
                ", empleadoId=" + empleadoId +
                "} " + super.toString();
    }
}
