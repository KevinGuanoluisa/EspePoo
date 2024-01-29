/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pruebakevin;

/**
 *
 * @author DELL G15
 */

import java.util.Scanner;

public class Pruebakevin {

    public static void main(String[] args) {
      Scanner scanner = new Scanner (System.in);
       Pasajero pasajero = new Pasajero ("234","Bryan",123);
       Chofer chofer = new Chofer("2610" , "312" ,"Juan",30);
       
   
        System.out.println("1 Para Persona");       
        System.out.println("2 Para pasajero");
        System.out.println("3 para chofer");
       
        switch(scanner.nextInt()){
          
            case 1:
              System.out.println("ingrese el nombre de la persona");
              String nombrePersona = scanner.next();
               System.out.println("Ingrese la edad de la persona: ");
               int edadPersona = scanner.nextInt();
               System.out.println("Ingrese la cedula de la persona");
               String cedulaPersona = scanner.next();
              scanner.nextLine();
              break;
              
            case 2 : 
                System.out.println("La accion del pasajero es: ");
               pasajero.pedirtaxi();
               pasajero.cancelartaxi();
               scanner.nextLine(); //limpiar buffer
               break;
         
            case 3:
                System.out.println("La accion realizada por el chofer es: ");
                chofer.concelarcarrera();
                chofer.aceptarcarrera();
                scanner.nextLine();
                break; 
             
        }  
    }
}

