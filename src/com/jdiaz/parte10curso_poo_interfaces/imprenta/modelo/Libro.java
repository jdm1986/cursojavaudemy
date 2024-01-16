package com.jdiaz.parte10curso_poo_interfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimible {

    List<Imprimible> paginas;
    private Persona autor;
    private String titulo;
    private Genero genero;

    public Libro(Persona autor, String titulo, Genero genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.paginas = new ArrayList<>();
    }

    public Libro addPagina(Imprimible pagina){
        paginas.add(pagina);
        return this;
    }
@Override
    public String imprimir(){
        StringBuilder stringBuilder = new StringBuilder("Titulo: ");
        stringBuilder.append(this.titulo).append("\n")
                .append("Autor: ").append(this.autor).append("\n")
                .append("Género: ").append(this.genero).append("\n");
        for (Imprimible pag :
                this.paginas) {
            stringBuilder.append(pag.imprimir()).append("\n");
        }
        return stringBuilder.toString();
    }
}
