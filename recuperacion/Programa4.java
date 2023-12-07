/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa4;

/**
 *
 * @author DELL G15
 */
import java.util.Scanner;

public class Programa4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número para generar la tabla de multiplicar: ");
        int numero = scanner.nextInt();

        System.out.println("Tabla de multiplicar del " + numero + ":");

        // Llama al método para imprimir la tabla de multiplicar
        imprimirTablaMultiplicar(numero);

        scanner.close();
    }

    // Método para imprimir la tabla de multiplicar de un número dado
    private static void imprimirTablaMultiplicar(int numero) {
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}


