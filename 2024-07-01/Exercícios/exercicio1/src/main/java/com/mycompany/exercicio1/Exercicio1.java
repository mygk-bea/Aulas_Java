/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio1;

/**
 *
 * @author aluno
 */
import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        double temperatura;
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Insira a temperatura em Cº:");
        temperatura = sc.nextDouble();
        
        double kelvin = temperatura + 273.15;
        double reaumur = temperatura * 0.8;
        double rankine = temperatura * 1.8 +32 +459.67;
        double fahrenheit = temperatura * 1.8 +32;

        System.out.println("Temperatura: " +temperatura+ "Cº");
        System.out.println("Kelvin: " +kelvin+ "K");
        System.out.println("Reaumur: " +reaumur+ "Re");
        System.out.println("Rankine: " +rankine+ "Ra");
        System.out.println("Fahrenheit: " +fahrenheit+ "F");
    }
}
