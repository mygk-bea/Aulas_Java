/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exerciciopolimorfismo;

import java.util.*;

public class ExercicioPolimorfismo {
    public static void main(String[] args) {
        Quadrilatero formas[] = new Quadrilatero[5];
        Random r = new Random();
        
        for(int i=0; i<5; i++, r = new Random()){
            int codigo = r.nextInt();

            if(codigo%3 == 0)
                formas[i] = new Retangulo();
            if((codigo%3 == 1) || (codigo%3 == -1))
                formas[i] = new Quadrado();
            if((codigo%3 == 2)||(codigo%3 == -2))
                formas[i] = new Circulo();
            
            System.out.println("\nCódigo da Forma: " +codigo%3+ "| Formato: " +formas[i].getNome());
            formas[i].setDados();
        }
        
        for(int i=0; i<5; i++){
            System.out.printf("\n\nA area do %s é: %fcm²", formas[i].getNome(), formas[i].calcularArea());
            System.out.printf("\nO perimetro do %s é: %fcm", formas[i].getNome(), formas[i].calcularPerimetro());
        }
    }
}