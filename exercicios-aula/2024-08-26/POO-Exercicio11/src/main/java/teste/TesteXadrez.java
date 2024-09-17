/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package teste;

import xadrez.*;

public class TesteXadrez {

    public static void main(String[] args) {
        Peca peao = new Peao();
        Peca cavalo = new Cavalo();
        Peca bispo = new Bispo();
        
        peao.mover();
        cavalo.mover();
        bispo.mover();
        
        System.out.println(peao instanceof Peca);
        System.out.println(cavalo instanceof Peca);
        System.out.println(bispo instanceof Peca);
    }
}
