/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programa1;

/**
 *
 * @author DELL G15
 */
 import java.util.Scanner;
public class Operaciones_programa1 {
    Scanner scanner = new Scanner(System.in);
    float num1 ;
    float num2;

    public Operaciones_programa1 (float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void areatriangulo(){
        System.out.println("Calcular el area de un triangulo ");
        System.out.println("Ingrese la base : ");
        num1 = scanner.nextFloat();
        System.out.println("Ingrese la altura: ");
        num2 = scanner.nextFloat();
        System.out.println("El resultado del area es :");
        System.out.println(num1 * num2/2);
   
  }
    
}