/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio4;

/**
 * 1 - Faça um algoritmo que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. 
 * @author aluno
 */
import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Insira a idade em dias");
        int diasTotais = sc.nextInt();
        
        int anos = diasTotais/365;
        int resto = diasTotais%365;
        int meses = resto/30;
        int dias = resto%30;
        
        System.out.println("Eu possuo " + anos + " anos, " + meses + " meses e " + dias + " dias");
        
        
    }
}
