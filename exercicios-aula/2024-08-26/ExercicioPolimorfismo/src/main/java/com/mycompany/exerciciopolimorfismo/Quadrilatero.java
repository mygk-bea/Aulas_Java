/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciopolimorfismo;

import java.util.Scanner;

abstract class Quadrilatero {
    String nome;
    protected double largura;
    protected double altura;
 
    public Quadrilatero() {
        this.nome = "Forma";
        this.largura = 1;
        this.altura = 1;
    }
    
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
    
    public void setAltura(float alt) {
        this.altura = alt;
    }
    public void setLargula(float lar) {
        this.largura = lar;
    }
    public void setNome(String n) {
        this.nome = n;
    }
    
    public double getAltura() {
        return this.altura;
    }
    public double getLargura() {
        return this.largura;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setDados(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a altura do Quadrilatero: ");
        altura = entrada.nextFloat();
        System.out.println("Digite a largura do Quadrilatero: ");
        largura = entrada.nextFloat();
    }
    
}