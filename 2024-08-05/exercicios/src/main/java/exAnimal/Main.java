/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package exAnimal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;
        
        try {
            System.out.print("Crie o seu novo animal \nInsira o nome: ");
            String nome = sc.nextLine();
            System.out.print("Insira a classe: ");
            String classe = sc.nextLine();
            System.out.print("Insira a família");
            String familia = sc.nextLine();
            
            Animais a1 = new Animais(nome, classe, familia);
            System.out.println(a1.nasceu());
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
