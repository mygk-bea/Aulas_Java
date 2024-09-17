/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exBanco;

import java.util.Scanner;

public class Application {
    /*
     * Alterei o arquivo Application para ser rodado no properties/run/Main Class do projeto
     */
    
    public static void main(String[] args) {
        Integer op = 0;
        Scanner sc = new Scanner(System.in);
        
        try {
            Bank c1 = new Bank(10, 150, "Sede", 1);
            
            while(op != 5) {
                System.out.println("\nBem vindo ao nosso banco!\nQual operacao voce gostaria de fazer?\n" + "1- Depositar\n2- Sacar\n3- Consultar Saldo\n4- Encerrar Conta\n5- Sair");
                op = sc.nextInt();
                
                switch(op) {
                    case 1:
                        if(c1.getTipo() != 4) {
                            System.out.println("Digite o valor que voce quer depositar: ");
                            c1.depositar(sc.nextFloat());
                            System.out.println(c1.consultarSaldo(c1.getTipo()));
                        } else {
                            System.out.println("Conta encerrada! Nao e possivel depositar nesta conta!");
                        }
                        break;
                    case 2:
                        if(c1.getTipo() != 4) {
                            System.out.println("Digite o valor que voce quer sacar: ");
                            System.out.println(c1.sacar(sc.nextFloat()));
                            System.out.println(c1.consultarSaldo(c1.getTipo()));
                        } else {
                            System.out.println("Conta encerrada! Nao e possivel sacar nesta conta!");
                        }
                        break;
                    case 3:
                        System.out.println(c1.consultarSaldo(c1.getTipo()));
                        break;
                    case 4:
                        if(c1.getSaldo() <= 0) {
                            c1.encerrarConta();
                            System.out.println(c1.textoEncerrar());
                        } else {
                            System.out.println("Não é possível encerrar a conta!\n" +c1.consultarSaldo(c1.getTipo()));
                        }
                        break;
                    case 5:
                        System.out.println("\nVolte sempre!");
                        break;
                }
            }
            
        } catch(Exception e) {
            System.out.println("Error: " +e.getMessage());
        } finally {
            System.out.println("Fim do programa");
            sc.close();
        }
    }
}
