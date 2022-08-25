package repeticao;

import java.util.Scanner;

//Refaça o programa anterior para 100 números.(Utilizar a estrutura de repetição while)

public class ex2 {
    
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        float num, soma = 0, i = 0;

        while(i < 100) {

            System.out.print("Entre com um número: ");
            num = leia.nextFloat();

            soma = soma + num;
            i++;
        }

        System.out.println("A soma total dos número é: "+soma);
    }
}
