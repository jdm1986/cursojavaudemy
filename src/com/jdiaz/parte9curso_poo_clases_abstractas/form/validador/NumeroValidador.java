package com.jdiaz.parte9curso_poo_clases_abstractas.form.validador;

public class NumeroValidador extends Validador {

    protected String mensaje = "el campo debe ser un número";

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
        try {
            Integer.parseInt(valor);
            return true; // Retorno verdadero si no hay excepción
        } catch (NumberFormatException e) {
            return false; // Retorno falso si hay excepción
        }
    }
}

