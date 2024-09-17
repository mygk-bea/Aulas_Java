/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exemploheranca;

public class ExemploHeranca {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Augusto", "939928939-09", 197845);
        a1.imprime();
        
        Professor p1 = new Professor("Luciana", "993884772-12", 7500f);
        p1.imprime();
        
        Pessoa pe1 = new Pessoa("Maria", "123434234-87");
        pe1.imprime();
    }
}
