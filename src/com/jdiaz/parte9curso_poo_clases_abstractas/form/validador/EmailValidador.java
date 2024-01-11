package com.jdiaz.parte9curso_poo_clases_abstractas.form.validador;

public class EmailValidador extends Validador {

    protected String mensaje = "formato del email incorrecto";

    private final static String EMAIL_REGEX = "^(.+)@(.+)$";
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
        return valor.matches(EMAIL_REGEX);
    }
}
