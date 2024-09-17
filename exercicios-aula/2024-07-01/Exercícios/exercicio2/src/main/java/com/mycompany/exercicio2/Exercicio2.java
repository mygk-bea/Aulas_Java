/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio2;

/**
 *
 * @author aluno
 */
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Insira a quantidade de funcionarios");
        int qtd = sc.nextInt();
        
        int horasSemanais = 44;
        double salarioHora = 12;
        double soma = 0;
        
        for(int i=0; i<qtd; i++){
            System.out.println("Insira a nota (0 a 10) do funcionario " +(i+1));
            int nota = sc.nextInt();
            System.out.println("Insira a quantidade (h) de atraso do funcionario  " +(i+1));
            double atraso = sc.nextFloat();
            soma += (horasSemanais - atraso) *4 *salarioHora + (nota*10);
        }
        
        double media = soma/qtd;
        System.out.println();
        System.out.println("Fórmula do salário: (horasSemanais - atrasoF) *4 *salarioHora +(nota*10)");
        System.out.println("horasSemanais = 44 (totais)");
        System.out.println("salarioHora = 12");
        System.out.println("MÉDIA DOS SALÁRIOS = " + media);
    }
}
