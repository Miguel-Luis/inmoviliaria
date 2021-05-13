package com.mycompany.inmoviliaria;
/** @author Miguel */

public class CobroAlquiler implements Servicios {   
    public String mostrarServicio(Persona persona) {
        int precio_alquiler = (int) Math.floor((Math.random() * 500000) + 500000);
        
        return "Hola " + persona.getNombre() + " a cobrado $" + precio_alquiler + " de alquiler";
    }
}
