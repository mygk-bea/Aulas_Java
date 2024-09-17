/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicioencapsulamento;

import java.util.Scanner;

public class ExercicioEncapsulamento {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("======| Insira os Dados do Professor |======");
        
        System.out.println("Qual o nome do professor?");
        String nome = sc.nextLine();
        
        System.out.println("Qual o curso do professor?");
        String curso = sc.nextLine();
        
        Professor p = new Professor(nome, curso);
        
        System.out.println("Quantas aulas " +p.getNome()+ " deu nesse mes?");
        Integer qtdAulas = sc.nextInt();
        p.setSalario(qtdAulas);
        
        System.out.println("\n======| Dados do Professor |======");
        System.out.print(p.imp());
    }
}
