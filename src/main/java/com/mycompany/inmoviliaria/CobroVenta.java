package com.mycompany.inmoviliaria;
/** @author Miguel */

public class CobroVenta implements Servicios{
    public String mostrarServicio(Persona persona) {
        return "Señor" + persona.getNombre() + " se a cobrado la venta de un inmueble";
    }
}
