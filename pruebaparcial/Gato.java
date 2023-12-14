/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebapoo;

/**
 *
 * @author DELL G15
 */
public class Gato extends Animal {
  String pelaje;
   public Gato(String nombre, String apodo, String pelaje){
        super(nombre,apodo);
        this.pelaje=pelaje;
   }
    public void hacerSonido() {
        System.out.println("Miau");
    }
 
       public void mostrarinformacion() {
        super.mostrarinformacion();
        System.out.println("pelaje: " + pelaje);
    }
}
