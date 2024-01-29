/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebakevin;

/**
 *
 * @author kevin

 */
public class Pasajero extends Persona{
    String numID;

    public Pasajero(String numID, String nombre, int edad) {
        super(nombre, edad);
        this.numID = numID;
    }
    
     public void pedirtaxi (){
        System.out.println( "Esta solicitando un taxi ....");
    }
    public void cancelartaxi(){
        System.out.println( "Esta cancelando el taxi ...");
    }
    
}

