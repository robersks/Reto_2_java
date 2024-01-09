package com.local;
 
public class Revista extends Recurso {

    // ATRIBUTOS
    int numero; // número de revista
    TipoRevista tipo;

    public Revista(int numero,TipoRevista tipo,int id, String titulo, boolean disponible) {
        super(id, titulo, disponible);
        this.numero = numero;
        this.tipo = tipo;
    }
    
    // METODOS GETTERS

    public int getNumero() {
        return this.numero;
    }

    public TipoRevista getTipo() {
        return this.tipo;
    }

    
    @Override
    public String toString() {
        return "{" +
            " id:'" + getId() + "'" +
            ", titulo:'" + getTitulo() + "'" +
            ", disponible:'" + getDisponible() + "'" +
            " numero='" + getNumero() + "'" +
            ", tipo='" + getTipo() + "'" +
            "}";
    }

    
}
