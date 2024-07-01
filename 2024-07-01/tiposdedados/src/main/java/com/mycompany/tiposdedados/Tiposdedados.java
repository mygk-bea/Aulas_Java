/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tiposdedados;

/**
 *
 * @author aluno
 */
public class Tiposdedados {
    public static void main(String[] args) {
        
        String nome = "Natalia";
        int idade = 29;
        float peso = 69.0f;
        double altura = 1.60;
        char sexo = 'f';
        boolean eh_maior = idade >= 18;
        
        int x = 10;
        int y = 20;
        
        int soma = x + y;
        int subtracao = x - y;
        int multiplicaçao = x * y;
        int divisao = x/y;
        int resto = x%y;

            System.out.println("Nome: " +nome);
            System.out.println("Idade: " +idade);
            System.out.println("Peso: " +peso);
            System.out.println("Altura: " +altura);
            System.out.println("Sexo: " +sexo);
            System.out.println("É maior de idade?: " +eh_maior);
            
            System.out.println(soma);
            System.out.println(subtracao);
            System.out.println(multiplicaçao);
            System.out.println(divisao);
            System.out.println(resto);
    }
}
