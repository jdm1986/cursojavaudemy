package com.jdiaz.ilerna.EjercicioLibro;

public class Libro {

    private String isbn;
    private String autor;
    private String titulo;
    private int anioPublicacion;
    private String editorial;
    private int numPaginas;

    public Libro(String isbn, String autor, String titulo, int anioPublicacion, String editorial, int numPaginas) {
        this.isbn = isbn;
        this.autor = autor;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.editorial = editorial;
        this.numPaginas = numPaginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public void imprimirInformacionDelLibro(){
        System.out.println("ISBN: " + isbn);
        System.out.println("Autor: " + autor);
        System.out.println("Título: " + titulo);
        System.out.println("Año de Publicación: " + anioPublicacion);
        System.out.println("Editorial: " + editorial);
        System.out.println("Número de Páginas: " + numPaginas);
    }
}
