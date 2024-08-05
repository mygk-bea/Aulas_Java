/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.javaapplicationcalculator;

import controle.Calculadora;
/**
 *
 * @author aluno
 */
public class JavaApplicationCalculator {

    public static void main(String[] args) {
        Calculadora calculadora;
        calculadora = new Calculadora();
        calculadora.somar(3, 9);
        calculadora.subtrair(3, 9);
        calculadora.multiplicar(3, 9);
        calculadora.divisao(9, 3);
    }
}
