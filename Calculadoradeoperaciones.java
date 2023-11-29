/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoradeoperaciones;

/**
 *
 * @author DELL G15
 */
import java.util.Scanner;

public class Calculadoradeoperaciones {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
       System.out.println("Ingrese la operación que desea hacer ");
        System.out.println("(1) sumar ");
        System.out.println("(2  restar");
        System.out.println("(3) multiplicar");
        System.out.println("(4) dividir");
        System.out.println("(5) salir");

        int num1, num2 ;
        double resultado;
    int opcion = scanner.nextInt();

               
      
        switch (scanner.nextInt()) {

            case 1 -> {
                System.out.println("Ingrese el primer numero");
                num1 = scanner.nextInt();
                System.out.println("Ingrese el segundo numero");
                num2 = scanner.nextInt();
                resultado=num1+num2;
                
                System.out.println("El resultado de la suma es: " + resultado);
            }
            case 2 -> {
                System.out.println("Ingrese el primer numero");
                num1 = scanner.nextInt();
                System.out.println("Ingrese el segundo numero");
                num2 = scanner.nextInt();
                resultado=num1-num2;
                
                System.out.println("El resultado de la resta es :"+resultado);
               
            }
            case 3 -> {
                System.out.println("Ingrese el primer numero");
                num1 = scanner.nextInt();
                System.out.println("Ingrese el segundo numero");
                num2 = scanner.nextInt();
                
                resultado=num2 * num1;
                System.out.println("El resultado de la multiplicacion es: " +resultado);
            }
            case 4 -> {
                System.out.println("Ingrese el primer numero");
                num1= scanner.nextInt();
                System.out.println("Ingrese el segundo numero");
                num2 = scanner.nextInt();
                
                resultado=num1 / num2;
   
                System.out.println("El resultado de la division es: " + resultado);     
            }
            
             case 5 -> {

                    System.out.println("¡gracias ");
                    System.exit(0);
                    break;
                     }
            
        }

        
        scanner.close();
    }
    
}
