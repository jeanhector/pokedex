package com.openlab.pokedex;

/**
 * Created by jean1 on 29/04/2017.
 */

public class pokemon {
    private String nombre;
    private String imagen;

    public pokemon(String nombre, String imagen) {
        this.nombre = nombre;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
