package com.jdiaz.parte9curso_poo_clases_abstractas.form.elementos;

abstract public class ElementoForm {

    protected String valor;
    protected String nombre;

    public ElementoForm() {
    }

    public ElementoForm(String nombre) {
        this();
        this.nombre = nombre;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    abstract public String dibujarHtml(); //un método abstracto no puede tener un cuerpo, el cuerpo lo deben tener las clases hijas.
}
