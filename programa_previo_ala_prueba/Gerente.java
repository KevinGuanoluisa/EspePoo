/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo;

/**
 *
 * @author DELL G15
 */
 public class Gerente extends Empleado {
    public String departamento;
    
    public Gerente(String nombre, String apellido, int edad, String departamento){
        super(nombre,apellido,edad);
        this.departamento=departamento;
    }
}
