/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa5;

/**
 *
 * @author DELL G15
 */
public class Programa5 { // SumaNumerosPares
    public static void main(String[] args) {
        int suma = 0;

        for (int i = 2; i <= 100; i += 2) {
            suma += i;
        }

        System.out.println("La suma de los números pares del 1 al 100 es: " + suma);
    }
}