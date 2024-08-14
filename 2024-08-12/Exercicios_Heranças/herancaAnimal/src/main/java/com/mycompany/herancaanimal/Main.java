/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.herancaanimal;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        
        try{
            while (option != 5) {
                System.out.println("\nQual animal voce quer criar?\n1- Bem-te-vi\n2- Papagaio\n3- Cachorro\n4- Vaca\n5- Nenhum (Sair)");
                option = sc.nextInt();
                sc.nextLine();
                
                if(option > 0 && option < 5) {
                    System.out.println("Qual o nome do animal?");
                    String nome = sc.nextLine();
                    
                    switch(option) {
                        case 1: 
                            BemTeVi btv = new BemTeVi(nome);
                            btv.imp();
                            btv.talk();
                            break;
                        case 2:
                            System.out.println("Qual frase voce ensinou ao seu papagaio?");
                            String vocabulario = sc.nextLine();
                            
                            Papagaio pg = new Papagaio(nome, vocabulario);
                            pg.imp();
                            pg.talk();
                            
                            System.out.println("\nVoce quer ensinar outra frase pro " +pg.getNome()+ "? (S/N)");
                            String novoVoc = sc.nextLine();
                            
                            if(novoVoc.equals("S")) {
                                System.out.println("Qual frase voce ensinou ao seu papagaio?");
                                novoVoc = sc.nextLine();
                                pg.setVoc(novoVoc);
                            }
                            pg.talk();
                            break;
                        case 3:
                            while(true) {
                                System.out.println("Seu cachoro late muito? (S/N)");
                                String resposta = sc.nextLine();

                                /* Método .equals() para comparar o valor da String */
                                if(resposta.equals("S") || resposta.equals("N")) {
                                    Boolean lateMuito = resposta.equals("S");
                                    
                                    Cachorro c = new Cachorro(nome, lateMuito);
                                    c.imp();
                                    c.talk();
                                    break;
                                } else {
                                    System.out.println("Opcao invalida, tente novamente!");
                                }
                            }
                            break;
                        case 4:
                            Vaca v = new Vaca(nome);
                            v.imp();
                            v.talk();
                            break;
                    }
                }
            }

            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
