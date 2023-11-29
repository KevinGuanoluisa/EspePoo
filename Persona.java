/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL G15
 */
public class Persona {
   String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void comer(){
            System.out.println(this.nombre + "Esta comiendo...");
    }
    public void saltar(){
        System.out.println(this.nombre + "Esta saltando...");
    }
    public void dormir(){
        System.out.println(this.nombre + "esta durmiendo...");
    }  
}
