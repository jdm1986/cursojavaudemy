package com.jdiaz.parte10curso_poo_interfaces.imprenta.modelo;

public class Pagina extends Hoja implements Imprimible{
    public Pagina(String contenido) {
        super(contenido);
    }

    @Override
    public String imprimir() {
        return this.contenido;
    }
}
