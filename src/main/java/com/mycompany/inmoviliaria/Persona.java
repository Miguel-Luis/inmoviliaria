package com.mycompany.inmoviliaria;
/** @author Miguel */

public class Persona {
    protected String nombre;
    protected int identificacion;
    protected String correo;
    protected int telefono;

    //---------------------- Nombre --------------------------
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //--------------------------------------------------------

    //------------------ Identificación ----------------------
    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }
    //--------------------------------------------------------
    
    //---------------------- Correo --------------------------
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    //--------------------------------------------------------

    //--------------------- Télefono -------------------------
    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    //--------------------------------------------------------
}
