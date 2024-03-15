package com.jdiaz.ejercicios.PersonasDeUnaCompania;

public class Gerente extends Empleado{
    private double presupuesto;
    public Gerente(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion, int empleadoId,double presupuesto) {
        super(nombre, apellido, numeroFiscal, direccion, remuneracion, empleadoId);
        this.presupuesto = presupuesto;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        if (presupuesto < this.getRemuneracion()) {
            throw new IllegalArgumentException("El presupuesto no puede ser menor que la remuneración");
        }
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "presupuesto=" + presupuesto +
                "}" + super.toString();
    }
}
