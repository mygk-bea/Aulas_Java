/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.herancaingresso;

public class Principal {

    public static void main(String[] args) {
        System.out.println("Ingresso Geral");
        Ingresso i1 = new Ingresso(40f);
        i1.imprime();
        
        System.out.println("\nIngresso VIP");
        VIP v1 = new VIP(75.50f, 50.20f);
        v1.imprime();
        
        System.out.println("\nIngresso Normal");
        Normal n1 = new Normal(30f);
        n1.imprime();
    }
}
