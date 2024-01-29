/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebapoo;

/**
 *
 * @author DELL G15
 */
public class Perro extends Animal {
    String raza;
    
     public Perro(String nombre, String apodo, String raza){
        super(nombre,apodo);
        this.raza=raza;
   }

    public void hacerSonido() {
        System.out.println("Guau");
    }
       
       public void mostrarinformacion() {
        super.mostrarinformacion();
        System.out.println("Raza: " + raza);
    }
}     
     
