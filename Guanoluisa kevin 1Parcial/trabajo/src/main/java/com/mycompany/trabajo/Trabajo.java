/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.trabajo;

/**
 *
 * @author DELL G15
 */
import java.util.Scanner;

public class Trabajo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empleado empleado = new Empleado("kevin", "guanoluisa", 19);
        Desarrollador desarrolador = new Desarrollador("alex", "gua", 50, "c++");
        Gerente gerente = new Gerente("Miguel", "Pilicita", 35, "economia");
        Boolean truem = true;
        do {
            System.out.println("......Empreza.......");
            System.out.println("1 Empleado");
            System.out.println("2 Desarrollador");
            System.out.println("3 Gerente ");

            try {
                switch (scanner.nextInt()) {
                    case 1:
                        empleado.setSalario(678);
                        System.out.println("El salario es :" + empleado.getSalario());
                        System.out.println(" La informacion del Empleado es: ");
                        empleado.mostrar_informacion("empleado comun");
                        System.out.println(" EL bono del empleado es: " + empleado.bono());
                        scanner.nextLine();
                        break;
                    case 2:
                        desarrolador.setSalario(789);
                        System.out.println(" La informacion del Desarrollador es :");
                        desarrolador.mostrar_informacion("empleado especifico");
                        System.out.println("El bono es: " + desarrolador.bono());
                        scanner.nextLine();
                        break;
                    case 3:
                        gerente.setSalario(9000);
                        System.out.println("El salario es :" + gerente.getSalario());
                        System.out.println(" La informacion del gerente es: ");
                        gerente.mostrar_informacion("Aspirante a Jefe");
                        System.out.println(" EL bono del empleado es: " + gerente.bono());
                        scanner.nextLine();

                        break;
                    default:
                        System.out.println("La opcion ingresada no existe");
                        scanner.nextLine();
                        break;
                }
                truem = false;
            } catch (Exception e) {
                System.out.println("Recuerde no ingresar cadenas en donde le piden numeros");
                scanner.nextLine();
            }
        } while (truem);

    }
}


