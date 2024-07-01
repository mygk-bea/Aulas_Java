/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio3;

/**
 *
 * @author aluno
 */
import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
        double R;
        double A;
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Insira o raio da lata:");
        R = sc.nextDouble();
        
        System.out.println("Insira a altura da lata:");
        A = sc.nextDouble();
        
        double V = 3.14159 * R * R * A;
        System.out.println("Volume da lata = "+V+"cm²");
    }
}
