/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL G15
 */
public class Gato {
     String nombre;
       int edad;

    public Gato(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }


   public void ronronear(){
       System.out.println(this.nombre + " esta ronroneando");
   }
   public void rasgar(){
       System.out.println(this.nombre + " esta rasgando");
   }
   public void acostar(){
       System.out.println(this.nombre + " esta dormido");
   }
}
