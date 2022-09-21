package lista4;

import java.util.Scanner;

//Escreva um algoritmo que determine se um dado número N (digitado pelo usuário) é primo ou não.

public class ex3 {
    
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int num, div, quant=0;

        System.out.print("Entre com um número: ");
        num = leia.nextInt();

        for(div=1; div <= num; div++) {

            if(num % div == 0) {
                quant++;
            }
        }
        if(quant == 2) {
            System.out.print("O número "+num+" é primo!");
        } else {
            System.out.print("O número "+num+" NÃO é primo!");
        }
    }
}
