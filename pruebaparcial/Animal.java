/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebapoo;

/**
 *
 * @author DELL G15
 */
public class Animal {
    String  nombre;
    String apodo;
    private int edad;
    
     public Animal(String nombre, String apodo) {
        this.nombre = nombre;
        this.apodo=apodo;
        }
      public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
         if (edad >= 0) {
            this.edad = edad;
        } else {
           throw new IllegalArgumentException("Edad no válida: " + edad + ". La edad no puede ser un número negativo.");  
        }
        this.edad = edad;
    }   
    
       public void hacerSonido() {
        System.out.println("Sonido del animal");
    }

    
    public void mostrarinformacion(){
        
        System.out.println( "El nombre es."+this.nombre);
        System.out.println( "El apodo es."+this.apodo);
        System.out.println( "La edad es."+this.getEdad());
    }
        
}
     
