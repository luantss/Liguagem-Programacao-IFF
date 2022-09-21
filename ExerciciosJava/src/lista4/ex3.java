package lista4;

import java.util.Scanner;

//Escreva um algoritmo que determine se um dado número N (digitado pelo usuário) é primo ou não.

public class ex3 {
    
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int num;

        System.out.print("Entre com um número: ");
        num = leia.nextInt();

        if(num >  40) {

            System.out.println("O número "+num+" é primo!!!");
        }
    }
}
