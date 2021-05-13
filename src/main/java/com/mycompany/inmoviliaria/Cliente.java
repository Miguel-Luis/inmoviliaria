package com.mycompany.inmoviliaria;
/** @author Miguel */

public class Cliente extends Persona {
    public Cliente(String nombre, int identificacion, String correo, int telefono) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.correo = correo;
        this.telefono = telefono;
    }
}
