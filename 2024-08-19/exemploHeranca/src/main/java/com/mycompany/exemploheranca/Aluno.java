/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemploheranca;

public class Aluno extends Pessoa{
    private int ra;
    
    public Aluno(String nome, String cpf, int ra){
        super(nome, cpf);
        this.ra = ra;
    }
    
    @Override
    public void imprime() {
        super.imprime();
        System.out.println("RA: "+this.ra);
    }
}
