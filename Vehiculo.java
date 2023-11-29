/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL G15
 */
public class Vehiculo {
      String nombre;
    int vel;

    public Vehiculo(String nombre, int vel){
        this.nombre = nombre;
        this.vel = vel;
    }



   public void multa(){
       System.out.println(this.nombre + " Esta a exceso de velocidad");
   } 
}
