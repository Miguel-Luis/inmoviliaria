package com.mycompany.inmoviliaria;
/**@author Miguel*/

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Cliente("Luis Miguel", 13, "miguel@gmail.com", 321548201);
        Persona persona2 = new Interesado("Marco Tulio", 13, "miguel@gmail.com", 321548201);
        Persona persona3 = new Propietario("Pedro Picapiedra", 13, "miguel@gmail.com", 321548201);
        InmobiliariaFacade inmobiliaria = new InmobiliariaFacade();
        
        System.out.println("\n--------- Persona 1 ---------\n");
        inmobiliaria.obtenerServicio(persona1);
        
        System.out.println("\n--------- Persona 2 ---------\n");
        inmobiliaria.obtenerServicio(persona2);
        
        System.out.println("\n--------- Persona 3 ---------\n");
        inmobiliaria.obtenerServicio(persona3);
    }
}