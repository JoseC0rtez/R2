package com.example.r1diseo;

public class contacto {
    int id;
    String Apellido;
    String Telefono;
    String nombre;
    public contacto(int id, String nombre, String apellido, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.Apellido = apellido;
        this.Telefono = telefono;
    }
    public contacto(){}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }





}
