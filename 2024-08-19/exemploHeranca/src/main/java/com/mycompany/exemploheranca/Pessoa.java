/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemploheranca;

public class Pessoa {
    private String nome;
    private String cpf;
    
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public void imprime() {
        System.out.println("\nNome: "+this.nome);
        System.out.println("CPF: "+this.cpf);
    }
}
