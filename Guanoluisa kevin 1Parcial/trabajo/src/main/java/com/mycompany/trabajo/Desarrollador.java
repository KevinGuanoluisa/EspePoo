/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-de
fault.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo;

/**
 *
 * @author DELL G15
 */
 public class Desarrollador extends Empleado {
    
     String lenguaje_programacion;
   
    public Desarrollador(String nombre, String apellido, int edad, String lenguaje_programacion){
        super(nombre,apellido,edad);
        this.lenguaje_programacion=lenguaje_programacion;
        
    }
    
    
}