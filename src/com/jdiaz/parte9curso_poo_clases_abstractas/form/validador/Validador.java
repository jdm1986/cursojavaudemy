package com.jdiaz.parte9curso_poo_clases_abstractas.form.validador;

abstract public class Validador {

    protected String mensaje;
    abstract  void setMensaje(String mensaje);
    abstract public String getMensaje();
    abstract public boolean esValido (String valor);
}
