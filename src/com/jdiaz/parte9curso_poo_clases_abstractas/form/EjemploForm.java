package com.jdiaz.parte9curso_poo_clases_abstractas.form;

import com.jdiaz.parte9curso_poo_clases_abstractas.form.elementos.ElementoForm;
import com.jdiaz.parte9curso_poo_clases_abstractas.form.elementos.InputForm;
import com.jdiaz.parte9curso_poo_clases_abstractas.form.elementos.SelectForm;
import com.jdiaz.parte9curso_poo_clases_abstractas.form.elementos.TextareaForm;
import com.jdiaz.parte9curso_poo_clases_abstractas.form.elementos.select.Opcion;

import java.util.ArrayList;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {

        InputForm ursername = new InputForm("username"); //tipo text por defecto
        InputForm password = new InputForm("clave", "password");
        InputForm email = new InputForm("email", "email");
        InputForm edad = new InputForm("edad", "numbre");

        TextareaForm experiencia = new TextareaForm("exp", 5, 9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        Opcion java = new Opcion("1", "Java");
        lenguaje.addOpcion(java);
        lenguaje.addOpcion(new Opcion("2","Python"));
        lenguaje.addOpcion(new Opcion("3", "JavaScript"));
        lenguaje.addOpcion(new Opcion("4", "TypeScript"));
        lenguaje.addOpcion(new Opcion("5","PHP"));


        ElementoForm saludar = new ElementoForm() {
            @Override
            public String dibujarHtml() {
                return "<input disabled name='" + this.nombre + "' value=\"" + this.valor + "\">";
            }
        };


        saludar.setValor("Hola que tal este campo está deshabilitado");
        ursername.setValor("John.doe");
        password.setValor("a1b2c3");
        email.setValor("john.doe@correo.com");
        edad.setValor("29");
        experiencia.setValor(".... mas de 10 años de experiencia....");
        java.setSelected(true);

        List <ElementoForm> elementos = new ArrayList<>();
        elementos.add(ursername);
        elementos.add(password);
        elementos.add(email);
        elementos.add(edad);
        elementos.add(experiencia);
        elementos.add(lenguaje);
        elementos.add(saludar);

        for (ElementoForm e :
                elementos) {
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        }

    }
}
