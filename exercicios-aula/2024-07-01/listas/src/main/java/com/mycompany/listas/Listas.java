/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.listas;

/**
 *
 * @author aluno
 */
public class Listas {
    public static void main(String[] args) {
        String nome = "Beatriz";
        
        System.out.println(nome);
        System.out.println(nome.charAt(0));
        System.out.println(nome.charAt(1));
        System.out.println(nome.charAt(2));
        System.out.println(nome.charAt(3));
        System.out.println(nome.charAt(4));
        System.out.println(nome.charAt(5));
        System.out.println(nome.charAt(6));
        
        int[]numeros = new int[10];
        
        numeros[0] =1;
        numeros[1] =234;
        numeros[2] =11;
        numeros[3] =76;
        numeros[4] =34;
        numeros[5] =22;
        numeros[6] =786;
        numeros[7] =88;
        numeros[8] =94;
        numeros[9] =100;

        System.out.println(numeros[6]);
        System.out.println();
                
        /*
        * String [] nomes= new String[5];;
        * boolean [] valores_logicos = new boolean [9];
        */

        float[] decimais = new float [3];
        decimais [0]=28.83f;
        decimais [1]=45.64f;
        decimais [2]=65.42f;
        
        float somatoria = (decimais[0]+decimais[1]+decimais[2]);
        System.out.println(somatoria);
    }
}
