/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemploheranca;

public class Professor extends Pessoa{
    private float salario;
    
    public Professor(String nome, String cpf, float salario) {
        super(nome, cpf);
        this.salario = salario;
    }
    
    @Override
    public void imprime() {
        super.imprime();
        System.out.println("Salario: "+this.salario);
    }

}
