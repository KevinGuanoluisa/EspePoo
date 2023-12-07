/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa3;

/**
 *
 * @author DELL G15
 */
  import java.util.Scanner;
public class Programa3 {

         public static void main(String[] args) {
             
        Scanner scanner = new Scanner(System.in);
        Password password = new Password("", 12345);
        Boolean repetir=true;
        
        do{
        System.out.println("Ingrese su nombre de usuario: ");
        String usuario = scanner.next();
        System.out.println("Ingrese la contraseña ");
        if (scanner.nextInt() <= 100){
            password.rechazado();
                    }
        else{
            
            password.aceptado();
            System.out.println("Su contraseña y usuario se han registrado exitosamente");
            repetir = false;
        }
        }while (repetir);
           
        }
    }

