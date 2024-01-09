package com.local;

import java.util.ArrayList;
//import java.util.HashMap;

public class Biblioteca {
    
    ArrayList<Recurso> listaRecursos = new ArrayList<>();
    //HashMap<String, Recurso> mapRecursos = new HashMap<>();

    // METODO agregar recurso a biblioteca
    public Biblioteca(ArrayList<Recurso> listaRecursos) {
        this.listaRecursos = listaRecursos;
    }
    
    public void prestarRecurso(Recurso recurso){
        System.out.println("..:");
    }

    // GET list
    public ArrayList<Recurso> getListaRecursos() {
        return this.listaRecursos;
    }
     
    // metodo para agregar recurso a biblioteca
    public void agregarRecurso(Recurso recurso){
        listaRecursos.add(recurso);
    }
    

    
    // metodo para agregar recurso a biblioteca
    
    public void pretarRecurso(int id){
        for (Recurso recurso : listaRecursos) {
            if (recurso.getId() == id) {
                recurso.prestarRecurso(false);
            }
        }
    }

    
    public void buscarRecurso(String tituloBuscar){
        ArrayList<Recurso> listaEncontrados = new ArrayList<>();
        for (Recurso recurso : listaRecursos) {
            if (recurso.getTitulo().equalsIgnoreCase(tituloBuscar)) {
                listaEncontrados.add(recurso);
            }
        }
    }


     

}
