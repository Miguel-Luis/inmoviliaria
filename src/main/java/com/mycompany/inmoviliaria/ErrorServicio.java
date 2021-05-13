package com.mycompany.inmoviliaria;
/** @author Miguel */

public class ErrorServicio implements Servicios {
    public String mostrarServicio(Persona persona) {
        return "Señor " + persona.getNombre() + " no tenemos servicios para usted";
    }
}
