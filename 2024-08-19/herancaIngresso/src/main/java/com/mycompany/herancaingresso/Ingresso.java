/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herancaingresso;

public class Ingresso {
    private float valor;
    
    public Ingresso(float valor){
        this.valor = valor;
    }
    
    public float getValor() {
        return this.valor;
    }
    
    public void imprime(){
        System.out.println("Valor: "+this.valor);
    }
}
