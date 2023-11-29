/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package deber;

/**
 *
 * @author DELL G15
 */
import javax.swing.JOptionPane;

public class deber {

    public static void main(String[] args) {
        System.out.println("hola");
        
        Perro p1= new Perro("Max", 5);
        p1.comer();
        p1.ladrar();
        p1.saltar();
        
        
        Gato p2= new Gato("Michu",6);
        p2.ronronear();
        p2.rasgar();
        p2.acostar();
        
        Persona p3 = new Persona("Josue",24);
        p3.comer();
        p3.dormir();
        p3.saltar();
        
        vehiculo p4 = new vehiculo("Mazda",50);
        p4.multa();
        
    }
}
