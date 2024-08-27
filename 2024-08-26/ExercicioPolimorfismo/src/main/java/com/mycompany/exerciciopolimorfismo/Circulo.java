/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciopolimorfismo;

import java.util.Scanner;

public class Circulo extends Quadrilatero{
    protected double raio;   
    
    public Circulo() {
        this.nome = "Circulo";
    }
    
    @Override
    public double calcularArea() {
        return Math.PI*(getRaio()*getRaio());
    }

    @Override
    public double calcularPerimetro() {
        return 2*Math.PI*getRaio();
    }
    
    public void setRaio(double r) {
        this.raio = r;
    }
    
    public double getRaio() {
        return this.raio;
    }
    
    @Override
    public void setDados(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o raio do Circulo: ");
        double r = entrada.nextDouble();
        setRaio(r);
    }
}
