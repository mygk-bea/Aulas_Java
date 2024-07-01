/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio5;

/**
 *
 * @author aluno
 */
import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Insira a");
        int a = sc.nextInt();
        System.out.println("Insira b");
        int b = sc.nextInt();
        System.out.println("Insira c");
        int c = sc.nextInt();
        System.out.println("Insira d");
        int d = sc.nextInt();
        System.out.println("Insira e");
        int e = sc.nextInt();
        System.out.println("Insira f");
        int f = sc.nextInt();
        
        int x = a + b + c + d + e + f; 
        int y = a * b * c * d * e * f; 
        
        System.out.println("Soma dos números (x) = " + x);
        System.out.println("Multiplicação dos números (y) = " + y);
    }
}
