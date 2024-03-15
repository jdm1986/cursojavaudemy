package com.jdiaz.parte9curso_poo_clases_abstractas.form.validador;

public class RequeridoValidador extends Validador{

    protected String mensaje = " el campo es requerido";
    @Override
    void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        return (valor != null && valor.length()> 0);
    }
}
