/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programa2;

/**
 *
 * @author DELL G15
 */
public class Cuenta_banco_programa2 {
    String usuario;
    int valor;

    public Cuenta_banco_programa2 (String usuario , int valor) {
        this.usuario = usuario;
        this.valor = valor;
    }
    
    public void ingresar(){
        System.out.println("Ingresando....");
    }
    public void retirar(){
        System.out.println("Retirando...");
    }
}