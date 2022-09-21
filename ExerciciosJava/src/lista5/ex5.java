package lista5;

import java.util.Scanner;

/*Faça um programa que leia 2 strings e informe o conteúdo delas seguido do seu comprimento. Informe tambem
se as duas strings possuem o mesmo comprimento e são iguais ou diferentes no conteúdo.*/

public class ex5 {
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        String word1, word2;
        int size1, size2;

        System.out.print("Entre com a primeira: ");
        word1 = read.nextLine();
        System.out.print("Entre com a segunda: ");
        word2 = read.nextLine();

        size1 = word1.length();
        size2 = word2.length();

        System.out.println("==============================");
        System.out.println("1°- "+word1);
        System.out.println("2°- "+word2);

        if(size1 == size2) {
            System.out.println("\nAs duas possuem o mesmo comprimento!");
        } else {
            System.out.println("\nAs duas NÃO possuem o mesmo comprimento!");
        }
        if(word1 == word2) {
            System.out.println("As duas possuem o mesmo conteúdo!");
        } else {
            System.out.println("As duas NÃO possuem o mesmo conteúdo!");
        }
    }
}
