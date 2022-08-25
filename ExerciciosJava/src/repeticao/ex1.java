package repeticao;

import java.util.Scanner;

//Prepare um programa para perguntar 10 números e informar a soma total destes números.

public class ex1 {
    
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        float num, soma = 0, aux;

        for(aux = 0; aux < 10; aux++) {

            System.out.print("Entre com um número: ");
            num = leia.nextFloat();

            soma = soma + num;
        }

        System.out.println("A soma total dos números foi: "+soma);
    }
}
