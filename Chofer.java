/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebakevin;

/**
 *
 * @author kevin
 */
public class Chofer extends Persona{
    
    String numplaca;
    String codtaxi;
    public Chofer (String numplaca,String codtaxi,String nombre, int edad ) {
        super(nombre, edad);
        this.numplaca=numplaca;
        this.codtaxi =codtaxi;
    }
     public void aceptarcarrera (){
        System.out.println(this.nombre + "Esta aceptando la carrera ....");
    }
    public void concelarcarrera(){
        System.out.println(this.nombre + "Esta cancelando la carrera ...");
    }
}

