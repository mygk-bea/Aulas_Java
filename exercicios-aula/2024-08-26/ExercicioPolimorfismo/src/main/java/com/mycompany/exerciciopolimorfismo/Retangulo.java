/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciopolimorfismo;

public class Retangulo extends Quadrilatero{
    public Retangulo() {
        this.nome = "Retangulo";
    }

    @Override
    public double calcularArea() {
        return getAltura()*getLargura();
    }

    @Override
    public double calcularPerimetro() {
        return (getAltura()*2)+(getLargura()*2);
    }
}
