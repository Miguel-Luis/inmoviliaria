package com.mycompany.inmoviliaria;
/** @author Miguel */

public class ContratoAlquiler implements Servicios {
    public String mostrarServicio(Persona persona) {
        return "Señor " + persona.getNombre() + " este es su contrato de alquiler:\nContrato bla bla bla";
    }
}
