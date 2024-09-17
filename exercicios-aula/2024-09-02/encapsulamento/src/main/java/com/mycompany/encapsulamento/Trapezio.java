/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.encapsulamento;

public class Trapezio {
    
    //atributos - variáveis de instância
    private float baseMaior;
    private float baseMenor;
    private float altura;
    
    //construtor
    public Trapezio(float baseMaior, float baseMenor, float altura) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    Trapezio() {}
    
    //métodos
    public float getBaseMaior() {
        return this.baseMaior;
    }
    
    public void setBaseMaior(float baseMaior) {
        this.baseMaior = baseMaior;
    }
    
    public float getBaseMenor() {
        return this.baseMenor;
    }
    
    public void setBaseMenor(float baseMenor) {
        this.baseMenor = baseMenor;
    }
    
    public float getAltura() {
        return this.altura;
    }
    
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public float calcularArea() {
        return ((baseMaior + baseMenor) * altura)/2;
    }
    
    public String imprimir() {
        return "Base Maior: " +this.getBaseMaior()+ "\nBase Menor: " +this.getBaseMenor()+ "\nAltura: " +this.getAltura();
    }
    
    

}
