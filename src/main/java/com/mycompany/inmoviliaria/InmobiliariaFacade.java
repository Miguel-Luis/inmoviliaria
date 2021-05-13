package com.mycompany.inmoviliaria;
/**@author Miguel*/

public class InmobiliariaFacade {    
    public void obtenerServicio(Persona persona) {
        Servicios servicio;
        
        if(persona.getClass() == Cliente.class) {
            servicio = new ContratoAlquiler();
        } else if(persona.getClass() == Interesado.class) {
            servicio = new Inmueble();
        } else if(persona.getClass() == Propietario.class) {
            servicio = new CobroAlquiler();
        } else {
            servicio = new ErrorServicio();
        }
        
        System.out.println(servicio.mostrarServicio(persona));
    }
}
