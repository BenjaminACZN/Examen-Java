package com.company;

public class Persona {

    public String nombre;
    public String apellido;


    public Persona (String nombre) {
        this.nombre = nombre;
        this.apellido="Garcia";
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }
}
