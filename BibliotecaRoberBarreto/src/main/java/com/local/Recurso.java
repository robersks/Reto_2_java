package com.local;

// CLASE
public abstract class Recurso {
    
    //ATRIBUTOS
    private int id;
    private String titulo;
    private boolean disponible;

    // METODO Constructor
    public Recurso(int id, String titulo, boolean disponible) {
        this.id = id;
        this.titulo = titulo;
        this.disponible = disponible;
    }

    // METODOS GETTERS
    public int getId() {
        return this.id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public boolean getDisponible() {
        return this.disponible;
    }


    // SET - METODO PARA PRESTAR RECURSO
    public void prestarRecurso(boolean disponibilidad){
        this.disponible = disponibilidad;
    } 


    // METODOS toString
    public String toString() {
        return "{" +
            " id:'" + getId() + "'" +
            ", titulo:'" + getTitulo() + "'" +
            ", disponible:'" + getDisponible() + "'" +
            "}";
    }


}
