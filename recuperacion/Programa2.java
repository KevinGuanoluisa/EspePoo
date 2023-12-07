/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa2;

/**
 *
 * @author DELL G15
 */

import java.util.Scanner;
public class Programa2 {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        
        
        //Ejercicio 1//
        Cuenta_banco cuenta = new Cuenta_banco("Alex",100);
        
        System.out.println("Banco Pichincha");
        System.out.println("Ingrese una cantidad");
        System.out.println("Si la cantidad ingresada es  mayor a 0 se hara un deposito : ");
        System.out.println("Si la cantidad ingresada es menor a 0  se retirará todo lo que tenga en su cuenta ");
        if(scanner.nextInt() >= 0){
            cuenta.ingresar();
        }
        
        else{
            cuenta.retirar();
        
    }
  }
}