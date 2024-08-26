/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formas;

import java.util.Scanner;

public class Circulo extends Quadrilatero{
    protected double raio;   
    
    public Circulo(double raio) {
        this.raio = raio;
    }
    
    @Override
    public float calcularArea() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public float calcularPerimetro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void setRaio(float r) {
        this.raio = r;
    }
    
    public double getRaio() {
        return this.raio;
    }
    
    public void setDados(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o raio do Círculo");
        raio = entrada.nextDouble();
    }
    
}
