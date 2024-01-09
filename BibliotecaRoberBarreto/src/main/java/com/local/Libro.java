package com.local;

public class Libro extends Recurso {

    // ATRIBUTOS
    String autor; // autor del libro


    //  METODO Constructor
    public Libro(String autor,int id, String titulo, boolean disponible) {
        super(id, titulo, disponible);
        this.autor = autor;
    }

    public String getAutor() {
        return this.autor;
    }

    @Override
    public String toString() {
        return "{" +
            " id:'" + getId() + "'" +
            ", titulo:'" + getTitulo() + "'" +
            ", disponible:'" + getDisponible() + "'" +
            " autor='" + getAutor() + "'" +
            "}";
    }


}
