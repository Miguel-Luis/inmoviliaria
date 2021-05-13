package com.mycompany.inmoviliaria;
/** @author Miguel */

public class Inmueble implements Servicios {
    String inmuebles[] = {"Nova Real", "La Casa Real", "El Titán", "La Tierra Prometida", "Piedra Angular"};
    
    public String mostrarServicio(Persona persona) {
        String lista = "";
        
        for(int i = 0; i < inmuebles.length; i++) {
            lista += inmuebles[i] + "\n";
        }
        
        return "Señor " + persona.nombre + " esta es la lista de Inmuebles:\n" + lista;
    }
}
