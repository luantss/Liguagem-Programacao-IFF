package lista5;

import java.util.Scanner;

//Faça um programa que solicite o nome do usuário e imprima-o na vertical.

public class ex6 {
    
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        String word;
        int position, size;

        System.out.print("Entre com o nome: ");
        word = read.nextLine();
        size = word.length();
        
        for(position = 0; position < size; position++) {
            System.out.print("\n"+word.charAt(position));
        }

    }
}
