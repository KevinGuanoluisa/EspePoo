/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pruebapoo;

/**
 *
 * @author DELL G15
 */
import java.util.Scanner;
public class PruebaPOO {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
         try {
            // Solicitar información del perro al usuario
            System.out.println("Ingrese información del perro:");
            System.out.print("Nombre: ");
            String nombrePerro = scanner.nextLine();
            System.out.print("Apellido: ");
            String apodoPerro = scanner.nextLine();
            System.out.print("Edad: ");
            int edadPerro = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea
            System.out.print("Raza: ");
            String razaPerro = scanner.nextLine();

            // Solicitar información del gato al usuario
            System.out.println("\nIngrese información del gato:");
            System.out.print("Nombre: ");
            String nombreGato = scanner.nextLine();
            System.out.print("Apellido: ");
            String apodoGato = scanner.nextLine();
            System.out.print("Edad: ");
            int edadGato = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea
            System.out.print("Tipo de Pelaje: ");
            String pelajeGato = scanner.nextLine();

            // Crear instancias de las clases Perro y Gato
            Perro perro = new Perro(nombrePerro, apodoPerro, razaPerro);
            Gato gato = new Gato(nombreGato, apodoGato, pelajeGato);

            // Mostrar información de los animales
            System.out.println("\nInformación del Perro:");
            perro.mostrarinformacion();
            perro.hacerSonido();

            System.out.println("\nInformación del Gato:");
            gato.mostrarinformacion();
            gato.hacerSonido();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
    

