/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL G15
 */
public class Perro {
     String nombre;
      int edad;

    public Perro(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void comer(){
        System.out.println(this.nombre +" esta comiendo");
    }

    public void ladrar(){
        System.out.println(this.nombre + " esta ladrando");
    }
    public void saltar(){
        System.out.println(this.nombre + " esta saltando");
    }
}  

