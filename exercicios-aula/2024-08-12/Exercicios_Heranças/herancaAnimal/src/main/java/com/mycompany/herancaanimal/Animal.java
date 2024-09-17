/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herancaanimal;

public class Animal {
    private String nome;
    
    Animal(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    void imp() {
        System.out.println("O animal se chama " +this.nome);
    }
    
    void talk() {
        System.out.println("Me not falar :I");
    }
}

class Passaro extends Animal {
    Passaro(String nome) {
        super(nome);
    }
    
    void talk() {
        System.out.println(this.getNome()+ " fez: Piupiu!");
    }
}

class BemTeVi extends Passaro {
    BemTeVi(String nome) {
        super(nome);
    }
    
    void talk() {
        System.out.println(this.getNome()+ " fez: Bem-te-vi!");
    }
}

class Papagaio extends Passaro {
    String vocabulario;
    
    Papagaio(String nome, String vocabulario) {
        super(nome);
        this.vocabulario = vocabulario;
    }
    
    void setVoc(String v) {
        this.vocabulario = v;
    }
    
    void talk() {
        System.out.println(this.getNome()+ " fez: " +vocabulario+ ", " +vocabulario);
    }
}

class Mamifero extends Animal {
    Mamifero(String nome){
        super(nome);
    }
}

class Cachorro extends Mamifero {
    Boolean lateMuito;
    
    Cachorro(String nome, Boolean lateMuito) {
        super(nome);
        this.lateMuito = lateMuito;
    }
    
    void setLateAlto() {
        System.out.println(this.getNome()+ " fez: AU! AU!");
    }
        
    void setLateBaixo() {
        System.out.println(this.getNome()+ " fez: au, au...");
    }
    
    void talk() {
        if(this.lateMuito) {
            this.setLateAlto();
        } else {
            this.setLateBaixo();
        }
    }
}

class Vaca extends Mamifero {
    Vaca(String nome){
        super(nome);
    }
    
    void talk() {
        System.out.println(this.getNome()+ " fez: Muuuuuuuuuu...");
    }
}
