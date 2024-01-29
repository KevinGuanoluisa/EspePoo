/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoraconbucleyexepciones;

import java.util.Scanner;

/**
 *
 * @author DELL G15
 */
public class Calculadoraconbucleyexepciones {

    public static void main(String[] args) {
       Scanner op = new Scanner(System.in);
    int num1;
    int num2; 
    int resultado;
    Boolean repetir = true; 
        
    do{    
    try{
        System.out.println("MENU");
        System.out.println("Que operacion desea realizar");
        System.out.println("(1) SUMA");
        System.out.println("(2) RESTA");
        System.out.println("(3) Multiplicacion");        
        System.out.println("(4) Division"); 
         System.out.println("(5) Salir"); 

        switch (op.nextInt()){
                case 1:
                    
                    System.out.println("Ingrese el primer numero"); 
                    num1 = op.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    num2 = op.nextInt();
                    
                    resultado=num1 + num2;
                    System.out.println("El resultado de la suma es: " + resultado);
                   
                    break;
                case 2:
                    
                    System.out.println("Ingrese el primer numero"); 
                    num1 = op.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    num2 = op.nextInt();
                    resultado=num1 - num2;
                    
                    System.out.println("El resultado de la resta es: "+ resultado);
                    
                    break;
                case 3:
                    //aqui solo voy a multiplicar las variables antes mencionadas
                    System.out.println("Ingrese el primer numero"); 
                    num1 = op.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    num2 = op.nextInt();
                    resultado=num1 * num2;
                    System.out.println("El resultado de la multiplicacion es: "+ resultado);
                   
                    break;
                case 4:
                    System.out.println("Ingrese el primer numero"); 
                    num1 = op.nextInt();                                  
                    System.out.println("Ingrese el segundo numero");
                    num2 = op.nextInt();
                    resultado= num1 / num2;
                        if (num2 == 0){
                            throw new ArithmeticException("No se puede dividir para 0");
                        }
                        else {          
                            System.out.println("El resultado es: " + resultado);
                        }
                break;
                
                case 5:
                    System.out.println("¡gracias por utilizar la calculadora ");
                    System.exit(0);
                    break;

                default:        
                    System.out.println("No disponemos de esa opcion");
                    break;
            } 
        repetir= false; 
   }catch(Exception e){ 
                System.out.println("\nSolo debes ingresar numeros, no letras \n, de no ser el caso no debes dividir para 0");
                 op.nextLine(); 
        }
    }while (repetir); 
        
    }
}
