/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sucursales;

/**
 *
 * @author DELL G15
 */

import java.util.Scanner;

public class Sucursales {

    public static void main(String[] args) {
        
   Scanner scanner = new Scanner(System.in);
        System.out.println("A que Sucursal desea ingresar");
        System.out.println("(1) para Sucursal I ");
        System.out.println("(2) para Sucursal II");   
        System.out.println("(3) para Sucursal III");  
        System.out.println("(5) salir");

        switch (scanner.nextInt()) {
            case 1:
                System.out.println("Usted Ingreso a la Sucursal I los productos que hay en esta  sucursal son :");
                System.out.println("Carne de res");
                System.out.println("Pollo");
                System.out.println("Embutidos ");
                System.out.println("Cerdo");
               
                break;
            case 2:
                System.out.println("Usted Ingreso a la Sucursal II los productos que hay en la sucursal son :");
                System.out.println("Esparragos");
                System.out.println("Lechugas ");
                System.out.println("Repollo");
                
                break;
            case 3:
                System.out.println("Usted Ingreso a la Sucursal III  los productos que hay en la sucursal son :");
                System.out.println("Pan enrrollado");
                System.out.println("Pan con dulce ");
                System.out.println("Pasteles ");
                System.out.println("Donas555");
                break;
            case 5:

                    System.out.println("¡gracias por preferirnos ");
                    System.exit(0);
                    break;
        }

       
        scanner.close();     
    }
}
