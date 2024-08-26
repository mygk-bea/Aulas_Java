/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formas;

import java.util.*;
import java.util.Scanner;

abstract class Quadrilatero {
    String nome;
    protected float largura;
    protected float altura;
 
    public Quadrilatero(String nome, float largura, float altura) {
        this.nome = nome;
        this.largura = largura;
        this.altura = altura;
    }
    
    public abstract float calcularArea();
    public abstract float calcularPerimetro();
    
    public void setAltura(float alt) {
        this.altura = alt;
    }
    public void setLargula(float lar) {
        this.largura = lar;
    }
    public void setNome(String n) {
        this.nome = n;
    }
    
    public float getAltura() {
        return this.altura;
    }
    public float getLargura() {
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