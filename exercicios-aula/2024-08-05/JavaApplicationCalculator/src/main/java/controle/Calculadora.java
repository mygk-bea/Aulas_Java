/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import javax.swing.JOptionPane;

public class Calculadora {
    /* Método de Soma */
    public void somar(int num1, int num2){
        JOptionPane.showMessageDialog(null, "A soma é: " + (num1 + num2));
    }
    
    /* Método de Subtração */
    public void subtrair(int num1, int num2){
        JOptionPane.showMessageDialog(null, "A subtração é: " + (num1 - num2));
    }
        
    /* Método de Multiplicação */
    public void multiplicar(int num1, int num2){
        JOptionPane.showMessageDialog(null, "A multiplicação é: " + (num1 * num2));
    }
    
    /* Método de Divisão */
    public void divisao(int num1, int num2){
        JOptionPane.showMessageDialog(null, "A divisão é: " + (num1 / num2));
    }
}
