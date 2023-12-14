/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.excepeciones;

/**
 *
 * @author DELL G15
 */
import java.util.Scanner;
public class Menu_excepciones {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);

        try {
            System.out.println("---------MENU-----------");
            System.out.println("1 SUMA");
            System.out.println("2 RESTA");
            System.out.println("4 Multiplicacion"); 
            System.out.println("Elija la operacion deseada");

            switch (op.nextInt()){
                case 1:
                    System.out.println("Sumando..."); break;
                case 2:
                    System.out.println("Restando..."); break;
                case 3:
                    System.out.println("Multiplicando"); break;
                default:
                    System.out.println("La operacion no existe"); break;
            }
        }
        catch(Exception e){
            System.out.println("\nSolo debes ingresar numeros, no letras\n");
        }
        finally{
            System.out.println("\nPrograma terminado, vuelva a intentarlo\n");
        }
    }
}