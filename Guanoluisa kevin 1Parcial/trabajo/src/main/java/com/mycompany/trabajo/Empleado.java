/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo;

/**
 *
 * @author DELL G15
 */
public class Empleado {
    String  nombre;
    String apellido;
    int edad;
    private double salario;
      public Empleado(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido=apellido;
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }   
    public double bono (){
        double bono;
        bono=0.1*(salario);        
        return bono;
    }
    public void mostrar_informacion(String data){
        
        
        
        System.out.println( "El nombre es."+this.nombre);
        System.out.println( "El apellido es."+this.apellido);
        System.out.println( "La edad es."+this.edad);
        System.out.println( "El bono es."+this.getSalario());
    }
            
   
}



