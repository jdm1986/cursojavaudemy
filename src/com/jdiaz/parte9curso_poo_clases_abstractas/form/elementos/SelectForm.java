package com.jdiaz.parte9curso_poo_clases_abstractas.form.elementos;

import com.jdiaz.parte9curso_poo_clases_abstractas.form.elementos.select.Opcion;

import java.util.ArrayList;
import java.util.List;

public class SelectForm extends ElementoForm {

    private List<Opcion> opciones;

    public SelectForm(String nombre) {
        super(nombre);
        this.opciones = new ArrayList<Opcion>();
    }

    public SelectForm(String nombre, List<Opcion> opciones) {
        super(nombre);
        this.opciones = opciones;
    }

    public SelectForm addOpcion(Opcion opcion) {
        this.opciones.add(opcion);
        return this;
    }

    @Override
    public String dibujarHtml() {
        StringBuilder stringBuilder = new StringBuilder("<select ");
        stringBuilder.append("name =")
                .append(this.nombre)
                .append("'>");

        for (Opcion opcion :
                this.opciones) {
            stringBuilder.append("\n<option value= '")
                    .append(opcion.getValor())
                    .append("'");
            if (opcion.isSelected()){
                stringBuilder.append(" selected");
                this.valor = opcion.getValor();
            }
            stringBuilder.append(">").append(opcion.getNombre())
                    .append("</option>");
        }
        stringBuilder.append("</select>");
        return stringBuilder.toString();
    }
}
