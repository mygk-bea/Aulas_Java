/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herancaingresso;

public class VIP extends Ingresso{
    private float adicional;
    
    public VIP(float valor, float adicional) {
        super(valor);
        this.adicional = adicional;
    }
    
    @Override
    public void imprime() {
        super.imprime();
        System.out.println("Valor Total (Taxa VIP): "+(this.getValor()+this.adicional));
    }
}
