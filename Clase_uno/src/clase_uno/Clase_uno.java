/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_uno;

/**
 *
 * @author DELL G15
 */
import javax.swing.JOptionPane;
        
public class Clase_uno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("hola mundo");
        int num,vel=50;
       
         num=Integer.parseInt(JOptionPane.showInputDialog("Ponga la velocidad del vehiculo"));
       
       if(num >= vel){
           JOptionPane.showMessageDialog(null, "EL vehiculo sera multado");
       }
       else{
           JOptionPane.showMessageDialog(null, "El vehiculo no sera multado");
       }
        
       /*
        perro p1= new perro("max",3);
        p1.ladrar();
       
        gato g1= new gato ("zeus",4);
        g1.ronronear();
       */         
       
      
               
    }
    
}
