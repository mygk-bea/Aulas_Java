/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.encapsulamento;

import java.util.Scanner;

public class Encapsulamento {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Trapezio t = new Trapezio();
        
        System.out.println("Digite a base maior:");
        t.setBaseMaior(entrada.nextFloat());
        
        System.out.println("Digite a base menor:");
        t.setBaseMenor(entrada.nextFloat());
        
        System.out.println("Digite a altura:");
        t.setAltura(entrada.nextFloat());
        
        System.out.println("A Area do trapezio é: " +t.calcularArea());
        
        System.out.println("=== Dados do Trapezio ===");
        System.out.println(t.imprimir());
    }
}
