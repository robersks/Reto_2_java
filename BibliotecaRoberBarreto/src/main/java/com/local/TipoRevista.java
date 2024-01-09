package com.local;

public enum TipoRevista {
    
    // TIPOS
    VEHICULOS("Vehiculos",20),
    MOTOS("Motos",22),
    IDIOMAS("Idiomas",44),
    CIENCIA("Ciencia",31),
    TECNOLOGIA("Tecnología",64);
    

    private String nombre;
    private int paginas;

    private TipoRevista (String nombre, int paginas){
        this.nombre = nombre;
        this.paginas = paginas;
    }
}
