package lista5;

import java.util.Scanner;

//Programa que lê duas palavras da entrada e, na saída, imprime a menor palavra.

public class ex4 {
    
    public static void main(String[] args) {

        String word1, word2;
        int size1, size2;
        Scanner read = new Scanner(System.in);

        System.out.print("Entre com a primeira palavra: ");
        word1 = read.nextLine();
        System.out.print("Entre com a segunda palavra: ");
        word2 = read.nextLine();

        size1 = word1.length();
        size2 = word2.length();

        if(size1 < size2) {
            System.out.println("A menor palavra é: "+word1);
        } else {
            if(size2 < size1) {
                System.out.println("A menor palavra é: "+word2);
            } else {
                System.out.println("As palavras tem o mesmo tamanho!!");
            }
        }

    }
}
