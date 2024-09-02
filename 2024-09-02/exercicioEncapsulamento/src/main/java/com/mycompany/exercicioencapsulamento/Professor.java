/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicioencapsulamento;

public class Professor {
    private String nome;
    private String curso;
    private double salario;
    
    public Professor(String nome, String curso) {
        this.nome = nome;
        this.curso = curso;
    }
    
    public void setNome(String strNome) {
        this.nome = strNome;
    }
    
    public void setCurso(String strCurso) {
        this.curso = strCurso;
    }
    
    public void setSalario(int QtdAulas) {
        this.salario = this.CalculaSalario(QtdAulas);
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public String getCurso() {
        return this.curso;
    }
    
    public double getSalario() {
        return this.salario;
    }
    
    public String imp() {
        return "Nome: " +getNome()+ "\nCurso: " +getCurso()+ "\nSalario: " +getSalario();
    }
    
    private double CalculaSalario(int qtdAulas) {
        int valorHora = 50;
        return valorHora*qtdAulas*4;
    }
}
